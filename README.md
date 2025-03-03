# Self-Order Kiosk - Java Swing Application

## Overview
Self-Order Kiosk is a Java Swing-based application designed for self-service ordering in restaurants or cafés. It allows customers to browse menus, place orders, and process payments through an interactive GUI.

## Features
- **User-friendly Interface**: Built using Java Swing for seamless user interaction.
- **Database Integration**: Uses MySQL for storing menu items, orders, and user data.
- **Order Processing**: Customers can place and manage orders.
- **Admin Panel**: Allows restaurant staff to update menu items and track orders.

## Technologies Used
- **Programming Language**: Java (Swing for GUI)
- **Database**: MySQL
- **IDE**: NetBeans

## Installation
### Prerequisites
- Java Development Kit (JDK) 8+
- NetBeans IDE (or any Java-compatible IDE)
- MySQL Database Server

### Steps to Set Up Locally
1. **Load the Database:**
   - Create a MySQL database named `self_order_kiosk`.
   - Locate the database file in the `/database/` folder.
   - Import the database file into MySQL.
2. **Configure Database Connection:**
   - Navigate to `src/main/java/services/DatabaseService.java`.
   - Modify the `DatabaseService()` method to match your MySQL credentials.
3. **Open the Project in NetBeans:**
   - Run **Clean and Build** to compile the project.
   - Execute the project from the IDE.

## Usage
- Start the application to access the self-order kiosk system.
- Customers can browse the menu, place orders, and view order history.
- Admins can log in to manage menu items and process orders.

## Contributing
Contributions are welcome! Feel free to fork the repository and submit pull requests.

## License
This project is licensed under the MIT License.

---
For any issues or assistance, feel free to contact us.

