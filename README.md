# Spring Boot + ReactJS Application Built Using Build-Convention

This web application manages a list of coffee shops.

![Screenshot](screenshot.png)

The project is fully built using **JeKa**, leveraging a [convention](https://github.com/jeka-dev/demo-build-conventions/blob/master/jeka-src/dev/jeka/demo/conventions/springboot/reactjs/Convention.java) that defines the build logic.

This build-convention is designed for building **Spring Boot** projects with an optional **ReactJS** frontend. It automates tasks such as:

- Running Java tests with code coverage,
- Building and testing the ReactJS app,
- Performing **SonarQube** analysis (Java and JS),
- Creating Docker and native images.

End-to-end tests are located in the `e2e` package under the `src/test/java` directory. 
The end-2-end test handles deployment and un-deployment of the application using containers.

<small><i>Configured via <code>jeka.properties</code></i></small>
```properties
jeka.version=0.11.39
jeka.java.version=21

jeka.kbean.default=project

# Use the build convention defined at https://github.com/jeka-dev/demo-build-templates
jeka.classpath=dev.jeka:convention-examples:0.11.39-2
@convention=on
```

## How to Use

### Setup IDE
 
```shell
jeka intellij: sync
```

### Build

Help on template KBean:
```shell
jeka convention: --doc
```

Run a full build, including sonarqube and end-2-end tests
```shell
jeka build
```

Run a full build, excluding sonar analysis
```shell
jeka test pack e2eTest
```

Run the bootable jar:
```shell
jeka runJar
```

Create a Docker image:
```shell
jeka docker: build
```

Create a Spring-Boot native Docker image:
```shell
jeka docker: buildNative
```

