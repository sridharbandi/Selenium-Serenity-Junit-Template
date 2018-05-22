## Selenium Serenity Junit Template with Gradle or Maven as build tools to getting started with

To automate [Selenium Webdriver](https://docs.seleniumhq.org/projects/webdriver/) binaries management in runtime am using [webdrivermanager](https://github.com/bonigarcia/webdrivermanager), an excellent library by [Boni García](https://github.com/bonigarcia) 

### How to use?
Create the Page Objects of your Web application under **_pageobjects_** package, call those Page Objects in scenario steps under **_steps_** package and call those steps in jUnit tests under **_tests_** package (Sample Page Objects, testcase included in this template)

### How to run?
Issue the below commands in project root directory
 
 ##### Gradle
```javascript
./gradlew test aggregate
```
By default it runs in Chrome browser, you can specify which browser to use as well
```javascript
./gradlew test aggregate -Dbrowser=firefox
```
`aggregate` in above command will generate Serenity HTML report under `target/site/serenity`
>If you're on Windows replace `./gradlew` with `gradlew.bat`

Currently supported browsers are 
* chrome
* firefox
* edge
* ie
* opera 

##### Maven
```javascript
mvn clean verify
```
Or
```javascript
mvn clean verify -Dbrowser=firefox
```
> Feel free to modify it to your own needs :)