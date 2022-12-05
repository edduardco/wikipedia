# Selenium template

Selenium template with:

* Java
* Spring Boot
* Cucumber
* Selenium
* TestNG
* Lombok

### Run from terminal using 

```bash
./gradlew clean test
```

**Build report with**
```bash
./gradlew allureServe
```

**Run and generate report**
```bash
./gradlew clean allureReport --depends-on-tests
```

**Check report with**
```bash
allure serve '/lib/build/allure-results/allure-results'
```

_Example:_ 
```bash
./gradlew clean test -D"cucumber.filter.tags=@wikipediaSearch"
```

### Command line options:
Run on target scenario
```bash
-D"cucumber.filter.tags=@wikipedia"
````

Run on target browser:
```bash
-Dbrowser=firefox
````

Run on target profile properties file
```bash
SPRING_PROFILES_ACTIVE=grid
````

## Docker:
**Precondition:** Requires Docker Deamon to be running.

From _docker-compose.yml_ path, _lib folder_  in this project, execute: 

```bash
docker compose up -d
```

to shut it down:
```bash
docker compose down
```

### Docker options:

Set number of containers for parallel execution:
```bash
--scale firefox=2 --scale chrome=2
```

Set remote or local context:
```bash
-Dcontext=remote
```

Set number of threads
```bash
* -Ddataproviderthreadcount="1"
```

## Author Information:

- https://github.com/edduardco
- https://www.linkedin.com/in/eduardo-c-157349157