# Springboot-ReactJs Application built using an External Template

The web application manages a list of coffee shops.

![img.png](screenshot.png)

The project is fully built using JeKa with a [template](https://github.com/jeka-dev/demo-build-templates/blob/master/jeka-src/dev/jeka/demo/templates/springboot/reactjs/Template.java) containing the build logic.

This template is designed for building Spring Boot projects, with optional ReactJS apps. It handles tasks like testing with coverage, building the ReactJS app, running SonarQube analysis, and creating a Docker image.

End-to-end tests are located in the `e2e` package under the `src/test/java` directory. The `e2e` method manages the deployment and undeployment of the application using containers.

<small>*jeka.properties*</small>
```properties
jeka.version=0.11.21
jeka.java.version=21

jeka.kbean.default=project

# Use build template defined at https://github.com/jeka-dev/demo-build-templates
jeka.classpath=dev.jeka:template-examples:0.11.20-1
@template=
```

## How to Use

### Setup IDE
 
```shell
jeka intellij: sync
```

### Build

Help on template KBean:
```shell
jeka template: --doc
```

Create a bootable jar, containing the client app,:
```shell
jeka pack
```

Deploy the application in Docker then run end-to-end tests:
```shell
jeka e2eTest
```

Run Sonarqube analysis, on both Java and JS:
```shell
jeka checkQuality
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

For CI/CD, we can run `jeka pack e2eTest checkQuality` for instance.
