<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block"> 📋 Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## ✏️ About The Project

This is a project with a basic security integration with Spring Boot & Angular.

#### Built With

* ♨️ Java
* ♦️ Angular


<!-- GETTING STARTED -->
## ⌨️ Getting Started

To get a local copy up and running, follow these simple steps.

1. Clone the repository, getting the link on the Code button.
2. Open the project from the location you cloned it. 
3. Change the password in [application.properties](https://github.com/ES-IH-JAVAFT-MAY22/extra-poke-app/blob/main/poke-app-backend/src/main/resources/application.properties) so it can be connected to your local database.
4. Run the following commands to run the Spring Boot backend. 
  ```
  cd poke-app-backend
  mvn spring-boot:run
  ```
5. Run the following commands to install and run the Angular frontend
  ```
  cd poke-app-frontend
  npm install
  ng serve
  ```
6. You're all set!. 


<!-- USAGE EXAMPLES -->
## 💻 How does it works?

### Register (http://localhost:4200/register)
To use this page you need to register in the app
![](https://github.com/ES-IH-JAVAFT-MAY22/extra-poke-app/blob/main/screenshots/register.png?raw=true)

### Login (http://localhost:4200/login)
To access to the secured urls you need to login using your credentials (previusly created in the register page)
![](https://github.com/ES-IH-JAVAFT-MAY22/extra-poke-app/blob/main/screenshots/login.png?raw=true)

### Home (http://localhost:4200/)
The home page welcomes you to our page!. You only can access to this page is you are logged. If not you will be redirected to the login page. 
![](https://github.com/ES-IH-JAVAFT-MAY22/extra-poke-app/blob/main/screenshots/login.png?raw=true)

<!-- CONTACT -->
## 📥 Contact

If you have issues, please don't hesitate to contact me in Slack.
