# Springboot - ReactSs application built using an external template

The web application manages a list of coffee shops.

![img.png](screenshot.png)

It is built with JeKa by using an external KBean containing the build logic.
This allows to decribe the whole build only by specifying the following properties :

jeka.properties
``` 
jeka.version=0.11.0-beta.0
jeka.java.version=21

jeka.inject.classpath=dev.jeka:template-examples:0.11.0-alpha.7.1
jeka.default.kbean=dev.jeka.demo.templates.SpringBootTemplateBuild

@springBootTemplateBuild.appId=demo-templates-coffeeshop
@springBootTemplateBuild.nodeJsVersion=20.14.0
```

Let's see how to use it.

## Setup IDE

```shell
jeka intellij: iml
```

## Build

This springboot project is built using [JeKa](https://jeka.dev) with this [build template](https://github.com/jeka-dev/demo-build-templates/blob/master/src/dev/jeka/demo/templates/SpringBootTemplateBuild.java)

Help on template KBean :
```shell
jeka --doc
```

To create a bootable jar, containing the client app, and execute SonarQube analysis on both java and js, execute :
```shell
jeka pack
```

Same but passing by sonarqube quality checks, execute :
```shell
jeka packQuality
```

To run the bootable jar built in previous step, execute :
```shell
jeka runJar
```


## Purpose

This project showcases, how we can easily re-use build definition across several projects.

Here, we reuse a build definition (we call it a *template*) defined in an [external project](https://github.com/jeka-dev/demo-build-templates/blob/master/src/dev/jeka/demo/templates/SpringBootTemplateBuild.java).

The template is designed to build Spring-Boot project, optionally containing a ReactJs nodejs project.

This includes tests with coverage, Sonarqube analysis, ReactJs packaging (if present) and bootable jar creation.

For this, the project has to define only what is specific (application name, dependencies, Spring-Boot and Java version),
the build template will handle all the remaining parts.

The whole build definition lies in [jeka.properties file](jeka.properties) 


