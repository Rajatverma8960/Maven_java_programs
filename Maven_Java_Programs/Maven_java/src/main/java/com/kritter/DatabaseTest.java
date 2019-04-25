package com.kritter;

import java.sql.*;

public class DatabaseTest {

    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Java_DB","root","9335");

            Statement st=con.createStatement();
            // Inserting records in the database
            String sql= "insert into Employee values ('07','Thomas','300000','4')";
            st.executeUpdate(sql);
            // update Query in mysql
            String sql_update = "update Employee SET emp_name='bugga' where emp_id='38'";
            st.executeUpdate(sql_update);
            // Selecting all the records from the database
            ResultSet result= st.executeQuery("select * from Employee");
            while(result.next())
            {
                System.out.println(result.getString("emp_id")+" "+result.getString("emp_name"));
            }

        }
        catch (Exception e)
        {
               System.out.println(e);
        }
    }
}
