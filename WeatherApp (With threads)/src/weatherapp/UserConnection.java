/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static weatherapp.UserLogin.s;

/**
 *
 * @author Daleh
 */

public class UserConnection {
    
    
    public static void main(String[] args) {
        
        // TODO code application logic here
    
        try{
            s = new Socket("127.0.0.1",1201);
            JOptionPane.showMessageDialog (null,"Connection Established");
            new UserLogin().setVisible(true);

       
            
            
            //here the ip address is local because im running the client locally
        }catch (Exception e){
            JOptionPane.showMessageDialog (null,"Connection Failed");
        }
    }
    
}
