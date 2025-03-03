package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {

  private final String url;
  private final String username;
  private final String password;
  public Connection conn;

  DatabaseService() {
    url = "jdbc:mysql://localhost/self_order_kiosk?serverTimezone=UTC";
    username = "root";
    password = "mysql123";
  }

  public void connect() {
    try {
      conn = DriverManager.getConnection(url, username, password);
    } catch (SQLException e) {
      System.out.println(e);
    }
  }

  public void disconnect() {
    try {
      conn.close();
    } catch (SQLException e) {
      System.out.println(e);
    }
  }

}
