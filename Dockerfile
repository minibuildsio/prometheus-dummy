FROM openjdk:17-slim
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
LABEL org.opencontainers.image.source=https://github.com/minibuildsio/prometheus-dummy
COPY *.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]