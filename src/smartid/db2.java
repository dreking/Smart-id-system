
package smartid;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class db2 {
public static Connection java_db(){
    try{
        Class.forName("org.sqlite.JDBC");    
        Connection con=DriverManager.getConnection("jdbc:sqlite:smart.sqlite");        
        //JOptionPane.showMessageDialog(null,"success");
        return con;   
    }catch(Exception e){
        //JOptionPane.showMessageDialog(null,e);
        return null;
    }
} 
public static void main(String []args){
    java_db();
}
}
