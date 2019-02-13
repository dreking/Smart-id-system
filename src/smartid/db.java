
package smartid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class db {
public static Connection java_db(){
    try{   
        Connection con=DriverManager.getConnection("jdbc:mysql://theafricanboss.com/u347086212_smart","u347086212_dre","thesmartcard");        
        //JOptionPane.showMessageDialog(null,"success");
        System.out.println("connection successful");
        return con;   
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
} 
public static void main(String []args){
    java_db();
}    
}
