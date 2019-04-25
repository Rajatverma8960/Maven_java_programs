package com.kritter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prepared_statement_exmp {

    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Java_DB","root","9335");
            // Insert Query from prepared statement
            /*
            PreparedStatement pstm = con.prepareStatement("insert into Employee values (?,?,?,?)");
            pstm.setInt(1,31);
            pstm.setString(2,"gubber");
            pstm.setString(3,"500000");
            pstm.setString(4,"1");
            */
            //update the records with prepared Statement
            PreparedStatement pstm=con.prepareStatement("update Employee Set emp_id=?, emp_name=?,empl_salary=?, emp_level=? where emp_id=?");
            pstm.setInt(1,31);
            pstm.setString(2,"gubber");
            pstm.setString(3,"500000");
            pstm.setString(4,"1");
            pstm.setInt(5,31);
            int i = pstm.executeUpdate();
            System.out.println(i+" Records updated");

            //Select all the records from the database
            String sql="select * from Employee";
            PreparedStatement pstmt= con.prepareStatement(sql);
            ResultSet r= pstmt.executeQuery();
            while (r.next())
            {
                System.out.println(r.getString("emp_id")+ " "+r.getString("emp_name"));
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
