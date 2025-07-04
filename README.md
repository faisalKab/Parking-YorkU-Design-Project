# Parking Management System

A modern, user-friendly Java desktop application for managing parking lots, bookings, and user accounts. Built for a design-focused course, this project demonstrates strong software engineering principles, including the use of multiple design patterns, modular architecture, and a polished Swing-based UI.

---

## Features

- **User & Manager Accounts**: Registration, login, and approval workflows.
- **Parking Lot Management**: Book, view, and manage parking spaces.
- **Role-Based Dashboards**: Separate interfaces for users and managers.
- **Data Persistence**: All data stored in CSV files for easy portability.
- **Robust Testing**: Includes unit and regression tests for core features.

---

## Screenshots

> _Add screenshots or a GIF here to showcase the UI!_

---

## Getting Started

### Prerequisites

- Java 8 or higher (JDK)
- (Optional) An IDE like IntelliJ IDEA or Eclipse

### Setup

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/parking-management-system.git
   cd parking-management-system/3311D2-main
   ```

2. **Add Libraries:**
   - Ensure `javacsv.jar` (in the `lib/` folder) is included in your classpath.
   - (Optional) `randoop-all-4.3.3.jar` is for advanced testing.

3. **Run the Application:**
   - In your IDE: Open `src/MainGUI.java` and run the `main()` method.
   - Or from the command line:
     ```sh
     javac -cp "lib/javacsv.jar" src/*.java
     java -cp "lib/javacsv.jar;src" MainGUI
     ```

---

## Design Patterns Used

This project was built to showcase the use of several classic design patterns:

- **Singleton**:  
  - `MainGUI` and `MainSystem` ensure only one instance exists throughout the app, providing global access points for UI and system logic.

- **Factory**:  
  - `UserFactory` creates different types of users (`Student`, `FacultyMember`, `NonFacultyStaff`, `Visitor`) based on input, encapsulating the instantiation logic.

- **Strategy**:  
  - The payment system uses the `PaymentStrategy` interface, with concrete strategies like `CreditCardPayment`, `DebitCardPayment`, and `MobilePayment` for flexible payment processing.

- **Facade** (implicit):  
  - `MainSystem` acts as a facade, providing a simplified interface to the app's core logic and data management.

- **MVC Principles**:  
  - The app separates views (Swing panels), models (user, lot, booking classes), and controllers (system logic), making the codebase modular and maintainable.

---

## Project Structure

```
3311D2-main/
├── src/         # Main source code (UI, logic, models)
├── test/        # Unit and regression tests
├── data/        # CSV files for persistent storage
├── lib/         # External libraries (javacsv, randoop)
└── .gitignore   # Excludes IDE and build files
```

---

## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

---