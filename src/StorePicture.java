import java.io.*; 
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

             

            String str="insert into Img1 values(?,?)"; 
            ps=con.prepareStatement(str); 
            ps.setInt(1,(int)file.length()); 
            ps.setBinaryStream(2,fis,(int)file.length()); 

            //System.out.println("success"); 
            ps.execute(); 

            ps.close(); 
             
        } 
            catch(SQLException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 