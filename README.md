# BootstrapCucumberJavaGradle
Java based Cucumber and Selenium framework bootstraping using gradle.

## Goals
Run and report on automated tests for webbased applications (by using behavior driven development).

## Features
- Cucumber based tests
- Selenium based tests using different browsers
- Run tests in parallel
- Generate readable reports

## Prerequisites
To run the framework tests you minimal need:
- Java JDK (http://www.java.com)
- gradle (https://gradle.org/install, install latest version in your local path)
- Chrome WebDriver (http://code.google.com/p/chromedriver/downloads/list, put the executable in your local path)

## Getting started
Clone the repository and run the code
```gradle build```
and to run the code
```gradle test```
It will also generate the report for you

## Logging options
This project uses [slf4j](http://www.slf4j.org/) configured though [log4j](http://logging.apache.org/log4j/) for its logging. A Log class is already initialized at utl package. To use logger
first initialize the logger at the class
```
Log log = new Log(this.getClass())
```
In your code you can then log your messages by calling:
```
log.trace("Trace message");
log.info("Info message");
log.warn("Warn message");
log.error("Error message");
and
```

