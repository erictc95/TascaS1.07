# Sprint 1 Task S1.07

## Repository with level-1, level-2 and level-3 exercises from the Java programming course, developed using IntelliJ IDEA and Maven.

### 📂 Repository Contents

| Level   | Exercise | Package            | Principal Classes                            | Description                                                                                                             |
|---------|----------|--------------------|----------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| Level 1 | 1        | `level1.exercise1` | `Worker`, `OnlineWorker`, `FaceToFaceWorker` | Created `Work` abstract class with 2 herated classes `OnlineWorker` and `FaceToFace`, practice the `@Override` methods. |
| Level 1 | 2        | `level1.exercise2` | `Worker`, `OnlineWorker`, `FaceToFaceWorker` | Modified the previous ecercise to insert `Deprecated` methods.                                                          |
| Level 2 | 1        | `level2.exercise1` | `Worker`, `OnlineWorker`, `FaceToFaceWorker` | Modified the previous exercise to create a Json File to save the Workers.                                               |
| Level 3 | 1        | `level3.exercise1` | `Worker`, `OnlineWorker`, `FaceToFaceWorker` | Modified the previous exercise to put annotations in `VM` when create and save the workers in Json File.                |



## ⚙️ Requirements

- Java JDK 11 o superior
- Maven
- IntelliJ IDEA (optional, but recommended)

---

## 💻 Installation and Execution

1. Clone the repository:

````bash
git clone https://github.com/erictc95/TascaS1.06.git
````

2. Open the project in IntelliJ IDEA or compile with Maven:

````bash
cd TascaS1.06
mvn compile
````

3. Run a specific exercise with Maven:

````bash
mvn exec:java -Dexec.mainClass="package.Main"
````

4. Replace package.Main with the main class of each exercise:

Level-1 / Exercise 1: level1.exercise1

Level-1 / Exercise 2: level1.exercise2

Level-2 / Exercise 1: level2.exercise1

Level-3 / Exercise 1: level3.exercise1



You can also open each Main.java class in IntelliJ and run it directly from the IDE.

## 📝 Usage

Each level folder contains independent exercises.
The exercises demostrate Java concepts such as different uses of `@Override`, `@Deprecated`, `Json` and `Annotations` in `VM`.


## 🤝 Contributions

If you want to improve the exercises or add examples:

Fork the repository

Create a branch for your changes: git checkout -b my-branch

Commit your changes: git commit -m "My contribution"

Push your branch: git push origin my-branch

Open a Pull Request

## 📜 License

MIT License

## 👤 Author

Eric Tarres Cabrisas - GitHub --> erictc95