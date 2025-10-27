# Spring App Config

A demonstration Spring Boot application showcasing configuration management using Spring Boot's configuration features.

## Features

- Spring Boot 3.2.0
- Configuration Properties with `@ConfigurationProperties`
- YAML-based configuration
- REST API endpoints to view configuration
- Maven build system

## Project Structure

```
spring-app-config/
├── src/
│   ├── main/
│   │   ├── java/com/example/springappconfig/
│   │   │   ├── SpringAppConfigApplication.java
│   │   │   ├── config/
│   │   │   │   └── AppConfigProperties.java
│   │   │   └── controller/
│   │   │       └── ConfigController.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/
│       └── java/com/example/springappconfig/
│           └── SpringAppConfigApplicationTests.java
├── pom.xml
└── README.md
```

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Building the Project

```bash
mvn clean install
```

## Running the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Get Configuration
```bash
curl http://localhost:8080/api/config
```

Returns the application configuration loaded from `application.yml`

### Health Check
```bash
curl http://localhost:8080/api/health
```

Returns the application health status

## Configuration

The application configuration is defined in `src/main/resources/application.yml`:

```yaml
app:
  name: Spring App Config Demo
  description: A demonstration of Spring Boot configuration management
  version: 1.0.0
  features:
    - Configuration Properties
    - YAML Configuration
    - Profile Management
```

## Testing

Run tests using:

```bash
mvn test
```
