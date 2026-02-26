# Java-Spring

A minimal Spring XML configuration demo with a simple `Alien` bean and a tiny runner.

## Project Structure

```
3.1 spring/
  pom.xml
  src/
    main/
      java/org/example/
        Alien.java
        App.java
      resources/
        spring.xml
    test/
      java/org/example/
        AppTest.java
```

## Prerequisites

- Java JDK (set `JAVA_HOME`)
- Maven Wrapper (included: `mvnw`, `mvnw.cmd`)

## Build

```powershell
./mvnw clean package
```

## Run

```powershell
./mvnw -q exec:java -Dexec.mainClass=org.example.App
```

## Notes

- The Spring bean is defined in `src/main/resources/spring.xml`.
- `Alien` prints simple messages to the console to verify wiring.
