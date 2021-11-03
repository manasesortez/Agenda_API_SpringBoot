# springboot-sample-app

[![Build Status](https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master)](https://travis-ci.org/codecentric/springboot-sample-app)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Requirements

For building and running the application you need:

- [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven](https://maven.apache.org)

## Running the application locally

* First to start the application configuration go to the `design` folder and enter the` agenda.sql` file
* Go to the following folder to configure the database `src -> main -> resources` and enter the file `application.properties`
* Then create a new user tested, and add it to the database go to the following address `src -> test -> java` and enter the file` RestServiceApplicationTests`
* If the user was already created then in test mode, go to an API request editor like `Postman` and enter inside it, in the `POST` option add the endpoint of `http: // localhost: 9001 / authenticate` and inside go to body and add the user was added to the database to authenticate as seen in the following photo
![alt text](https://i.ibb.co/N9jsb98/Screenshot-from-2021-11-02-18-08-15.png)


## Deploying the application to OpenShift

The easiest way to deploy the sample application to OpenShift is to use the [OpenShift CLI](https://docs.openshift.org/latest/cli_reference/index.html):

```shell
oc new-app codecentric/springboot-maven3-centos~https://github.com/codecentric/springboot-sample-app
```

This will create:

* An ImageStream called "springboot-maven3-centos"
* An ImageStream called "springboot-sample-app"
* A BuildConfig called "springboot-sample-app"
* DeploymentConfig called "springboot-sample-app"
* Service called "springboot-sample-app"

If you want to access the app from outside your OpenShift installation, you have to expose the springboot-sample-app service:

```shell
oc expose springboot-sample-app --hostname=www.example.com
```

## Copyright

Released under the MIT License See the [LICENSE](https://github.com/manasesortez/Agenda_API_SpringBoot/blob/master/LICENSE) file.
