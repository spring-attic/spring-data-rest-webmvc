# Spring Data REST Exporter Example

This deployable web application is an example project that illustrates how to deploy your own artifacts into a WAR that can be exporter using the [Spring Data REST Exporter](https://github.com/SpringSource/spring-data-rest).

### Use

Either use this project as a template for your own project, or simply include your own artifacts as dependencies in the `build.gradle` file.

The easiest way to get going with the REST exporter is to simply run the embedded Jetty servlet container built into Gradle:

    ./gradlew jettyRun

This will expose a server at `http://localhost:8080/data/`. Issue curl requests to find out what services are available.

Alternatively, you can build a WAR file using `./gradlew war`, and deploy that into your servlet container.
