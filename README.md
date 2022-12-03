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

_Example:_ 
```bash
./gradlew clean test -Dcucumber.filter.tags="@wikipedia-search"
```

### Command line options:
Run on target scenario
```bash
-Dcucumber.filter.tags="@wikipedia-search"
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