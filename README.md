# spring-data-rest-webmvc is no longer actively maintained by VMware, Inc.

# Spring Data REST Exporter Example

This deployable web application is an example project that illustrates how to deploy your own artifacts into a WAR that uses the [Spring Data REST Exporter](https://github.com/SpringSource/spring-data-rest).

### Use

Either use this project as a template for your own project, or simply include your own artifacts as dependencies in the `build.gradle` file.

The easiest way to get going with the REST exporter is to simply run the embedded Tomcat servlet container:

    ./gradlew tomcatRun

This will expose a server at `http://localhost:8080/spring-data-rest-webmvc/`. Issue curl requests to find out what services are available.

Alternatively, you can build a WAR file using `./gradlew war`, and deploy that into your servlet container.

### Loading dummy data for testing

If you want to play with some Person entities, there is a Ruby script in the root of the project named `load_name_data.rb`. It will load some random names from the `names.txt` file and create `Person` entities from them. You can then test the paging and sorting functionality by adding the appropriate URL parameters (information is in the wiki: [spring-data-rest/wiki/Paging-and-Sorting](https://github.com/SpringSource/spring-data-rest/wiki/Paging-and-Sorting)).