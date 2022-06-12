# Проект по автоматизации API-тестирования для сайта Nokian tyres

# :arrow_right: Сайт [NOKIAN TYRES][id] :arrow_left:

[id]: https://www.nokiantyres.ru/

## :page_with_curl:    Содержание

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
> :heavy_check_mark: [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)

## :technologist: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://github.com/google/gson"><img src="images/logo/gson.png" width="auto" height="50"  alt="GSON"/></a>
<a href="https://rest-assured.io/"><img src="images/logo/rest-assured.png" width="auto" height="50"  alt="Rest-assured"/></a>
<a href="https://telegram.org/"><img src="images/logo/Telegram.svg" width="auto" height="50"  alt="Telegram"/></a>
</p>

## :bookmark_tabs: Реализованные проверки

* ✓ Поиск шин по параметрам ширина/профиль/диаметр.
* ✓ Поиск шин по наличию 'Бессрочной гарантии'".
* Пользовательский сценарий: 
    * ✓ Добавление товара в корзину.
    * ✓ Проверка товара в корзине.
    * ✓ Удаление товара из корзины.
    * ✓ Проверка, что корзина пуста и товар удален.

## :computer: Запуск тестов из терминала

Локальный запуск:

```bash
gradle clean test
```

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview)

<p align="center">
  <img src="images/screenshots/JenkinsProject.jpeg" alt="job" width="800">
</p>

## <img src="images/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview/allure">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_main.jpeg">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images/screenshots/allure_tests.jpeg">
</p>

### Графики

<p align="center">
<img title="Allure Graphics" src="images/screenshots/allure_graphics.jpeg">
</p>


## <img src="images/logo/Allure_EE.svg" width="25" height="25" /> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/1199/)

### Test cases

<p align="center">
<img title="TestOps Test cases" src="images/screenshots/Test cases.jpeg">
</p>


## <img src="images/logo/Telegram.svg" width="25" height="25"/> Уведомления в Telegram с использованием бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_telegram.jpeg">
</p>



