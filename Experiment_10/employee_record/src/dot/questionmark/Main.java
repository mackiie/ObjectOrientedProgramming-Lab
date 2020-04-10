package dot.questionmark;

import java.sql.*;

public class Main {

    public void App()
    {
      Connection c = null;
      try
      {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          c = DriverManager.getConnection("jdbc:odbc:emp","","");
          Statement s = c.createStatement();
          s.executeUpdate("CREATE TABLE emp" + "(EmpNo. INTEGER, name VARCHAR(10)"+ "(desig VARCHAR(5), basicpay FLOAT)");
      }
      catch (SQLException e)
      {
          e.getMessage();
      }
      catch (ClassNotFoundException e)
      {
          e.getMessage();
      }
      catch (Exception e)
      {
          System.err.println(e.getMessage());
      }
      finally {
          try {
              if(c!=null)
              {
                  c.close();
              }
          }
          catch (SQLException sq)
          {
              System.err.println(sq.getMessage());
          }
      }
    }

    public static void main(String[] args) {
        Main ct = new Main();
        ct.App();
    }
}
