# Spring Data REST Exporter Example

This deployable web application is an example project that illustrates how to deploy your own artifacts into a WAR that uses the [Spring Data REST Exporter](https://github.com/SpringSource/spring-data-rest).

### Use

Either use this project as a template for your own project, or simply include your own artifacts as dependencies in `build.gradle` or `pom.xml`.

The easiest way to get going with the REST exporter is to simply run the embedded Tomcat servlet container. See the followin sections to learn how to run this with either gradle or maven.

This will expose a server at `http://localhost:8080/spring-data-rest-webmvc/`. Issue curl requests to find out what services are available.

Alternatively, you can build a WAR file using `./gradlew war` or `mvn package`, and deploy that into your servlet container.

### Run With gradle

	./gradlew tomcatRun

### Run With maven

	mvn tomcat7:run

or

	mvn jetty:run

### Loading dummy data for testing

If you want to play with some Person entities, there is a Ruby script in the root of the project named `load_name_data.rb`. It will load some random names from the `names.txt` file and create `Person` entities from them. You can then test the paging and sorting functionality by adding the appropriate URL parameters (information is in the wiki: [spring-data-rest/wiki/Paging-and-Sorting](https://github.com/SpringSource/spring-data-rest/wiki/Paging-and-Sorting)).

Or you can just use one of the following if curl is in your path:

To load data under Unix Bash (Make sure curl is in your path):

	$ cat names.txt | while read name; do curl -H "Content-Type: application/json" -X POST -d "{ \"name\": \"$name\" }" http://localhost:8080/spring-data-rest-webmvc/people; done

To load data under Windows Batch (Make sure curl is in your path):

	> FOR /F "tokens=*" %i IN (names.txt) DO curl -H "Content-Type: application/json" -X POST -d "{ \"name\": \"%i\" }" http://localhost:8080/spring-data-rest-webmvc/people

