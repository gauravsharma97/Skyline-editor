/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author GAURAV-PC
 */
public class text extends JTextArea{
        char c='a';
 public  String name=null,address=null;
   
    int c1,r1,caretposition;

public text()
{

    setFont(new Font("Tahoma",0,11));
addKeyListener( new java.awt.event.KeyAdapter(){
          public void keyReleased(java.awt.event.KeyEvent evt) {
              c='f';  
              getcoordinates();
                editor.row_label.setText(r1+1+"");
                editor.col_label.setText(c1+"");
               }
 });       
addMouseListener(new java.awt.event.MouseAdapter() {
public void mousePressed(MouseEvent e)
{
  getcoordinates();
                editor.row_label.setText(r1+1+"");
                editor.col_label.setText(c1+"");
}
}
);

}
        
 public void set_font(String f_name,int f_style,int f_size){
 
 this.setFont(new Font(f_name,f_style,f_size));
 } 
   
   

 public void set(String n,String a)
 {
 name=n;
 address=a;
 }
 
 public String get_name()
 {
    return name;
 }
 
 public String get_address()
 {
    return address;
 }
 
 public void getcoordinates()
 {
     try {
         caretposition=this.getCaretPosition();
         r1=this.getLineOfOffset(caretposition);
         c1=caretposition-this.getLineStartOffset(r1);
         } 
     catch (Exception ex) {
         Logger.getLogger(text.class.getName()).log(Level.SEVERE, null, ex);
          }
 }
}
