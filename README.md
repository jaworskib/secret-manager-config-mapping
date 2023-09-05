# secret-manager-config-mapping

This is just a small reproducer project for the reported issue: https://github.com/quarkiverse/quarkus-google-cloud-services/issues/491

It illustrates a problem of loading secret-manager injected secrets into a @ConfigMapping class.

## Prerequisites
- a GCP project with Secret Manager api enabled
- `some-key` secret created in SM
- `GOOGLE_CLOUD_PROJECT` environment variable supplied
