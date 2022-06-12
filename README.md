# Проект по автоматизации тестирования для сайта Nokian tyres
#####  :arrow_right: Сайт [NOKIAN TYRES][id] :arrow_left:
[id]: https://www.nokiantyres.ru/

## :page_with_curl:	Содержание

> :heavy_check_mark: [Технологии и инструменты](#technologist-технологии-и-инструменты)
>
> :heavy_check_mark: [Реализованные проверки](#bookmark_tabs-реализованные-проверки)
>
> :heavy_check_mark: [Запуск тестов из терминала](#computer-Запуск-тестов-из-терминала)
>
> :heavy_check_mark: [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
>
> :heavy_check_mark: [Отчет о результатах тестирования в Allure Report](#-отчет-в-allure-report)
>
> :heavy_check_mark: [Интеграция с Allure TestOps](#-Интеграция-с-Allure-TestOps)
> 
> :heavy_check_mark: [Интеграция с Jira](#-интеграция-с-jira)
>
> :heavy_check_mark: [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
>

## :technologist: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

> *В данном проекте автотесты написаны на <code><strong>*Java*</strong></code> с использованием фреймворка <code><strong>*Selenide*</strong></code> для UI-тестов.*
>
>*Для сборки проекта используется <code><strong>*Gradle*</strong></code>.*
>
>*<code><strong>*JUnit 5*</strong></code> используется как фреймворк для модульного тестирования.*
>
>*Запуск тестов выполняется из <code><strong>*Jenkins*</strong></code>.*
>
>*<code><strong>*Selenoid*</strong></code> используется для запуска браузеров в контейнерах  <code><strong>*Docker*</strong></code>.*
>
>*<code><strong>*Allure Report, Allure TestOps, Jira, Telegram Bot*</strong></code> используются для визуализации результатов тестирования.*

## :bookmark_tabs: Реализованные проверки

* ✓ Проверка перехода на страницу информации о расширенной гарантии.
* ✓ Проверка перехода в https://marketplace.nokiantyres.ru/ со страницы "Расширенная гарантия".
* ✓ Проверка перехода на страницу активации расширенной гарантии.
* ✓ Проверка списка шин с бессрочной гарантией.
* Параметризированные тесты:
    * ✓ выбор шинных центров;
    * ✓ выбор автосалонов.
    

## :computer: Запуск тестов из терминала

Локальный запуск:
```bash
gradle clean test
```

Удаленный запуск:
```bash
gradle
clean
test
-Duser=${USER}
-Dpassword=${PASSWORD}
```

## <img width="4%" title="Jenkins" src="images/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview)


<p align="center">
  <img src="images/JenkinsProject.jpeg" alt="job" width="800">
</p>


## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview/allure">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main.jpeg">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images/allure_tests.jpeg">
</p>

### Графики

<p align="center">
<img title="Allure Graphics" src="images/allure_graphics.jpeg">
</p>

### <img src="images/Selenoid.svg" width="25" height="25" /></a> Пример видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/video2.gif" width="100%" height="auto"  alt="video"> 
</p>

## <img src="images/Allure_EE.svg" width="25" height="25" /> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/1199/)

### Dashboards
<p align="center">
<img title="TestOps dashboards" src="images/Dashboards.jpeg">
</p>

### Test cases
<p align="center">
<img title="TestOps Test cases" src="images/Test cases.jpeg">
</p>

## <img width="4%" title="Jenkins" src="images/Jira.svg"> Интеграция с [Jira](https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview)

<p align="center">
<img title=" Интеграция с Jira" src="images/jira_task.jpeg">
</p>

## <img src="images/Telegram.svg" width="25" height="25"/> Уведомления в Telegram с использованием бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_telegram.jpeg">
</p>



