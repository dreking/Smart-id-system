/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartid;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class sendMail {

    public static void main(String []args){
        try{
            final String username="thesmartcardsystem@gmail.com";
            final String password="thesmartcard";
            Properties props =new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port","587");
            Session session= Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication(){
                            return new PasswordAuthentication(username,password);
                        }
                    });            
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress("thesmartcardsystem@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("leajapo@gmail.com"));
            message.setSubject("done");
            message.setContent("<h:body style=background-color:white;font-family:verdana;color:#0066CC;>"
                    +"DearWe are informing you to attend the due on regarding Sport"
                    +"</body>","text/html;charset=utf-8");
            Transport.send(message);
            System.out.println("Was sent:Done");
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
        } 
    }
}
