/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlconnection;
import java.sql.*;


/**
 *
 * @author master
 */
public class sqlconnection {
    
    Connection conn=null;
    PreparedStatement prep = null;
    ResultSet res =null;

    public sqlconnection()
{
            
    try
        {

            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/master/library.db");
            
            prep = conn.prepareStatement("Select * from catalog");

            //return conn;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

    //return conn;
    }
    
     public ResultSet getBooks(){
     
            try
            {  
                res = prep.executeQuery();

            }catch(SQLException e)
            {
                    e.printStackTrace();
            }

    return res;
        }
    
    
}
