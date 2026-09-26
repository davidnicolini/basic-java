# basic-java

A foundational repository covering essential Java programming concepts, Object-Oriented Programming (OOP) principles, and fundamental syntax structure. The material and mini-projects are organized according to core software development topics.

---

## 📁 Repository Structure

```text
basic-java/
├── hello-world/
├── primitive-types/
├── control-structures-selection-repetition/
└── object-oriented-programming-oop/
```

---

## 📚 Core Concepts Summary

### 1. `hello-world/` — Java Fundamentals & Execution Model
* **The Java Technology Stack:**
  * **JDK (Java Development Kit):** Compiler (`javac`), tools, and libraries needed to develop Java applications.
  * **JRE (Java Runtime Environment):** Libraries and JVM needed to run compiled Java programs.
  * **JVM (Java Virtual Machine):** Software engine that executes Java Bytecode (`.class` files), providing cross-platform compatibility ("*Write Once, Run Anywhere*").
* **Compilation & Execution Process:**
  1. Source code is saved as `FileName.java`.
  2. Compiled using `javac FileName.java` into intermediate **Bytecode** (`FileName.class`).
  3. Executed by the JVM using `java FileName`.
* **Program Entry Point:**
  ```java
  public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
  ```
  * `public`: Accessible globally.
  * `static`: Called without instantiating the class.
  * `void`: Does not return any value.
  * `String[] args`: Command-line parameter array.

---

### 2. `primitive-types/` — Data Types & Variable Scope
Java is a strongly-typed language featuring eight primitive data types:

| Category | Type | Memory | Value Range / Description |
| :--- | :--- | :--- | :--- |
| **Integer** | `byte` | 1 byte (8 bits) | $ -128 $ to $ 127 $ |
| | `short` | 2 bytes (16 bits) | $ -32,768 $ to $ 32,767 $ |
| | `int` | 4 bytes (32 bits) | $ -2,147,483,648 $ to $ 2,147,483,647 $ |
| | `long` | 8 bytes (64 bits) | $ -9 \times 10^{18} $ to $ 9 \times 10^{18} $ (Suffix `L`) |
| **Floating Point** | `float` | 4 bytes (32 bits) | Single-precision IEEE 754 (Suffix `F`) |
| | `double` | 8 bytes (64 bits) | Double-precision IEEE 754 |
| **Character** | `char` | 2 bytes (16 bits) | Single UTF-16 character (`'A'`) |
| **Logical** | `boolean` | 1 bit | `true` or `false` |

* **Variable Scope:**
  * **Local Variables:** Declared inside methods; destroyed upon method exit. Must be explicitly initialized before use.
  * **Instance Variables (Attributes):** Declared inside a class but outside methods; tied to an object's lifecycle.
  * **Class Variables (`static`):** Shared across all instances of a class.

---

### 3. `control-structures-selection-repetition/` — Control Flow
Controls the execution flow of an application based on conditional logic and iteration.

* **Selection Structures:**
  * `if / else-if / else`: Evaluates boolean expressions sequentially.
  * `switch`: Multi-way branch evaluating integer, `char`, `String`, or `enum` expressions. Uses `break` to prevent fall-through and `default` for fallback cases.
* **Repetition Structures (Loops):**
  * `for`: Used when the exact number of iterations is known in advance (`for (init; condition; update)`).
  * `while`: Tests the condition *before* executing the loop body (0 or more executions).
  * `do-while`: Executes the loop body *at least once* before evaluating the condition.
* **Unconditional Branching:**
  * `break`: Immediately exits the loop or switch block.
  * `continue`: Skips the current iteration and jumps to the next evaluation.

---

### 4. `object-oriented-programming-oop/` — Object-Oriented Programming

#### **Classes vs. Objects**
* **Class:** A template or blueprint defining attributes (state) and methods (behavior).
* **Object:** A specific instance of a class created in memory using the `new` keyword.

#### **Encapsulation & Access Modifiers**
Hides internal object state and restricts direct access to promote data integrity.

* **Access Modifiers:**
  * `public`: Accessible from any package.
  * `protected`: Accessible within the same package and subclasses in other packages.
  * `default` (no modifier): Accessible only within the same package.
  * `private`: Accessible **only** within the defining class.
* **JavaBeans / POJO Convention:** Attributes are marked `private` and accessed via public **Getters** and **Setters**.

#### **Key Modifiers**
* `static`: Belongs to the class rather than instance objects.
* `final`: Defines constants (variables), prevents method overriding (methods), or disables class inheritance (classes).
* `abstract`: Used to define abstract classes or methods that must be extended/implemented by subclasses.

#### **Inheritance (`extends`)**
Allows a subclass (child) to inherit attributes and methods from a superclass (parent), promoting code reusability. Java supports single class inheritance.
* `super()`: Refers to the immediate parent class constructor or method.

#### **Polymorphism & Method Overriding (`@Override`)**
Allows objects of different classes to respond to the same method call with distinct implementations.
* **Method Overriding:** A subclass redefines a method inherited from a parent class using `@Override`.
* **Common Overrides:**
  * `toString()`: Customizes textual representation of an object.
  * `equals(Object obj)`: Defines logical equivalence between instances based on field values.

---

## 🚀 How to Run the Mini-Projects

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/basic-java.git
   cd basic-java
   ```

2. **Navigate to a mini-project folder:**
   ```bash
   cd hello-world
   ```

3. **Compile the Java file:**
   ```bash
   javac Main.java
   ```

4. **Run the application:**
   ```bash
   java Main
   ```

---

## 📖 Reference
* **Course:** Programação I (UniCesumar)
* **Authors:** Prof. Dr. Edson A. Oliveira Junior & Prof. Me. Andre Abdala Noel