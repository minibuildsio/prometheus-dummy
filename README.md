# Spring Boot Prometheus Dummy

Spring Boot Prometheus Dummy is a Spring Boot application that provides Prometheus metrics for testing. The application provides the default Spring Boot metrics (request counts, etc.) and a custom counter metric called `no_of_ticks_total` which increments by 1 every second.

## Running the Docker Image

Use `docker run` to run the image:

```bash
docker run -p 8080:8080 ghcr.io/minibuildsio/artefacts/prometheus-dummy:0.1.0
```

The Prometheus metrics can be retrieved from the `/actuator/prometheus` endpoint like so:

```bash
curl -s http://localhost:8080/actuator/prometheus | grep tick

# output:
# HELP no_of_ticks_total
# TYPE no_of_ticks_total counter
no_of_ticks_total 72.0
```
