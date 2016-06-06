import java.io.*;
import java.net.URL;

import oracle.sql.*;
import java.sql.*; 
import java.util.*; 
public class StorePicture 
{ 
    public static void test(Connection con) throws Exception 
    { 
        Statement s; 
        FileInputStream fis; 
        PreparedStatement ps; 
        File file; 
       
        try 
        { 
            file=new File("e:/foto.jpeg"); 
            fis=new FileInputStream(file); 

             
            URL a = file.toURL();
            String str="insert into Image values(2,BFILENAME ('e:/foto.jpeg','foto'))"; 
            ps=con.prepareStatement(str); 
           
            ps.execute(); 

            ps.close(); 
             
        } 
            catch(SQLException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 