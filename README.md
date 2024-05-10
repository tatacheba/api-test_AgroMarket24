# API-testing project for Nokian tyres

# :arrow_right: [NOKIAN TYRES][id] :arrow_left:

[id]: https://www.nokiantyres.ru/

## :page_with_curl: Contents

> :heavy_check_mark: [Technologies and tools](#technologist)
>
> :heavy_check_mark: [Verified checks](#verified)
>
> :heavy_check_mark: [Run tests from the terminal](#computer)
>
> :heavy_check_mark: [Running Tests in Jenkins](#running_tests)
>
> :heavy_check_mark: [Report on test results in Allure Report](#report_allure_report)
>
> :heavy_check_mark: [Integration with Allure TestOps](#integration_allure_testops)
>
> :heavy_check_mark: [Notifications in Telegram using a bot](#notifications_telegram_bot)

## <a name="technologist"> Technologies and tools</a>

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://github.com/google/gson"><img src="images/logo/gson.png" width="auto" height="50"  alt="GSON"/></a>
<a href="https://rest-assured.io/"><img src="images/logo/rest-assured.png" width="auto" height="50"  alt="Rest-assured"/></a>
<a href="https://telegram.org/"><img src="images/logo/Telegram.svg" width="auto" height="50"  alt="Telegram"/></a>
</p>

## <a name="verified">Verified checks</a>

-   ✓ Search tyres by width/profile/diameter parameters.
-   ✓ Retrieval of tyres under the 'Indefinite Guarantee'".
-   Custom Script:
    -   ✓ Add product to cart.
    -   ✓ Check the shopping cart.
    -   ✓ Removing the product from the cart.
    -   ✓ Check that the cart is empty and the goods have been removed.

## <a name="computer">Run tests from the terminal</a>

Local start:

```bash
gradle clean test
```

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"><a name="running_tests">Running Tests in [Jenkins](https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview)</a>

<p align="center">
  <img src="images/screenshots/JenkinsProject.jpeg" alt="job" width="800">
</p>

## <img src="images/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview/allure">Allure report</a>

### Main

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_main.jpeg">
</p>

### Tests

<p align="center">
<img title="Allure Tests" src="images/screenshots/allure_tests.jpeg">
</p>

### Graphics

<p align="center">
<img title="Allure Graphics" src="images/screenshots/allure_graphics.jpeg">
</p>

## <img src="images/logo/Allure_EE.svg" width="25" height="25" /> <a name="integration_allure_testops">Integration with [Allure TestOps](https://allure.autotests.cloud/project/1199/)</a>

### Test cases

<p align="center">
<img title="TestOps Test cases" src="images/screenshots/Test cases.jpeg">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"/> <a name="notifications_telegram_bot">Notifications in Telegram using a bot</a>

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_telegram.jpeg">
</p>
