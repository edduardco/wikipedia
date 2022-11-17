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

Example: 

```bash
_./gradlew clean test -Dcucumber.filter.tags="@Exercise_1"_
```

### Command line options:

Specified browser:

```bash
-Dbrowser=firefox
````

## Docker:
**Precondition:** Requires Docker Deamon to be running.

From where _docker-compose.yml_ is located, in this case _lib folder_ inside our project execute 

```bash
docker compose up -d
```

to shut it down:
```bash
docker compose down
```

### Docker options:

Specified number of containers for parallel execution:

```bash
--scale firefox=2 --scale chrome=2
```

Specified reremote or local context:

```bash
-Dcontext=remote
```

Specified number of threads

```bash
* -Ddataproviderthreadcount="1"
```

## Author Information:

- edduardco