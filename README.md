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

<img src="https://i.ibb.co/N9jsb98/Screenshot-from-2021-11-02-18-08-15.png"  width="600" height="400" />

* When you have that token go to the following URL:  `http: // localhost: {your_port} /swagger-ui.html#/` and within each request that he wants to execute he does them with the following command `Bearer {jwt - postman}` as can be seen in the following images


<img src="https://i.ibb.co/tML2Kh8/Screenshot-from-2021-11-02-18-18-38.png"  width="600" height="400" />
<img src="https://i.ibb.co/fHpBt8F/Screenshot-from-2021-11-02-18-19-09.png"  width="600" height="400" />

* If you got to this point and everything went well, congratulations, manipulate the API Agenda 🧑‍💻 💥 🔥

If you want to access the app from outside your OpenShift installation, you have to expose the springboot-sample-app service:
si usted quiere entrar a ver las dependencias estas se encuentra en:  

``` 
pom.xml
```

## Autor

amtoDev

## Copyright

Released under the MIT License See the [LICENSE](https://github.com/manasesortez/Agenda_API_SpringBoot/blob/master/LICENSE) file.
