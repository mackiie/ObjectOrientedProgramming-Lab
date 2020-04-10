package dot.questionmark;

import java.sql.*;

public class Main {

    public Main()
    {
    }
    public void ID()
    {
        Connection c = null;
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            c = DriverManager.getConnection("jdbc:odbc:emp","","");
            Statement s = c.createStatement();
            s.executeUpdate("INSERT INTO emp" + "VALUES (0,'Kshitiz')");
            s.executeUpdate("INSERT INTO emp" + "VALUES (1,'Saini')");
            s.executeUpdate("INSERT INTO emp" + "VALUES (2,'113')");
            s.executeUpdate("INSERT INTO emp" + "VALUES (3,'KSaini')");
            s.executeUpdate("INSERT INTO emp" + "VALUES (4,'kkkk')");
            s.executeUpdate("INSERT INTO emp" + "VALUES (5,'ssss')");
            s.executeUpdate("INSERT INTO emp" + "VALUES (6,'ks')");
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
        Main a = new Main();
        a.ID();
    }
}
