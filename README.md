# Restaurant Management System

This is a simple console-based Restaurant Management System written in Java. It allows administrators to manage user accounts, add and list dishes, and handle billing for orders placed at different tables.

## Features

- **User Authentication**: Admins can log in or sign up.
- **Dish Management**: Admins can add dishes to the menu and list available dishes.
- **Billing**: Manage orders for different tables, view ordered dishes, cancel orders, and print bills.
- **Analysis**: View total sales and the number of dishes delivered.

## Project Structure

- `userPass`: 2D array to store user credentials.
- `listDish`: 2D array to store the list of dishes and their prices.
- `table`: 3D array to store table orders, where each table can have up to 10 dishes.
- `totalDishadded`, `Totalsell`, `TotalDishdelivered`: Variables to track the total number of dishes added, total sales, and total dishes delivered.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- A code editor or IDE like IntelliJ IDEA or Eclipse.

### Running the Program

1. **Clone the repository or download the code**:
    ```sh
    git clone <repository-url>
    ```

2. **Navigate to the project directory**:
    ```sh
    cd <project-directory>
    ```

3. **Compile and run the program**:
    ```sh
    javac Main.java
    java Main
    ```

### Program Workflow

1. **Home Page**:
    - Options: Login, Signup, Exit.
    - Admins can log in with existing credentials or sign up for a new account.

2. **Main Menu**:
    - Options: List of dishes available today, Add today's dish, Bill, Analyse, Logout.
    - Admins can view available dishes, add new dishes, manage billing for tables, view total sales, and the number of dishes delivered.

3. **Billing**:
    - Select a table and manage orders:
        - Add dishes to the table's order.
        - View ordered dishes.
        - Cancel dishes within 45 seconds of ordering.
        - Print the bill, which clears the table's order and updates total sales and dishes delivered.

## Example Usage

### Adding a Dish

1. Choose "2. Add today's dish" from the main menu.
2. Enter the number of dishes to add.
3. Enter the dish name and price for each dish.

### Handling Billing

1. Choose "3. Bill" from the main menu.
2. Select a table number.
3. Manage orders for the selected table:
    - Add dishes to the order.
    - View ordered dishes.
    - Cancel dishes within 45 seconds.
    - Print the bill.

### Analyzing Sales

1. Choose "4. Analyse" from the main menu.
2. View the total sales and the number of dishes delivered.

## Code Explanation

### Main Class

The `Main` class contains all the methods for managing user authentication, adding and listing dishes, and handling billing.

- `homepg()`: Displays the home page and handles login, signup, and exit.
- `LoginPg()`: Handles user login.
- `SignupPg()`: Handles user signup.
- `MainMenu()`: Displays the main menu and handles dish management, billing, and analysis.
- `bill()`: Manages billing for selected tables, including adding, viewing, and canceling orders, and printing bills.

### Comments

Comments are added throughout the code to explain the purpose of each section and method, improving readability and maintainability.

## Contributions

Contributions are welcome! Feel free to submit a pull request or open an issue to improve the functionality or fix bugs.

## License

This project is licensed under the MIT License.
