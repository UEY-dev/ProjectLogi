# ProjectLogi

A Java-based logistics project developed as a collaborative university project.

## Overview

ProjectLogi aims to provide a foundation for a logistics management system. The project is built with Java 21 and Maven, with a focus on maintainable code and collaborative development.

**Project status:** Initial development

## Technologies

- Java 21
- Apache Maven 3.9.11
- JUnit 5
- Maven Wrapper

## Requirements

Before getting started, make sure you have:

- **JDK 21** installed
- **Git** installed
- An internet connection for the initial dependency downloads

> You do not need to install Maven separately. The included Maven Wrapper handles it automatically.

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/UEY-dev/ProjectLogi.git
cd ProjectLogi
```

### 2. Build the project and run tests

**Windows (CMD):**

```cmd
mvnw.cmd clean test
```

**Linux / macOS:**

```bash
./mvnw clean test
```

The Maven Wrapper automatically downloads the configured Maven version and project dependencies when needed.

## Project Structure

```text
ProjectLogi/
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
├── mvnw
├── mvnw.cmd
├── pom.xml
├── .gitignore
└── README.md
```

## Contributing

1. Clone the repository or fork it.
2. Create a separate branch for your changes.
3. Commit and push your work.
4. Open a Pull Request for review before merging into `main`.

Please keep changes focused and avoid committing generated build files such as `target/`.

---

**Repository:** [UEY-dev/ProjectLogi](https://github.com/UEY-dev/ProjectLogi)
