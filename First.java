package sample;

import java.awt.*;  
class First extends Frame{  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
First(){  
Button b1=new Button("CSE");  
b1.setBounds(250,100,80,30);// setting button position 
b1.setBackground(Color.yellow);
add(b1);//adding button into frame  
Button b2=new Button("CIVIL");  
b2.setBounds(500,100,80,30);// setting button position 
b2.setBackground(Color.yellow);
add(b2);
Button b3=new Button("EE");  
b3.setBounds(250,180,80,30);// setting button position 
b3.setBackground(Color.yellow);
add(b3);
Button b4=new Button("MECHANICAL");  
b4.setBounds(500,180,80,30);// setting button position 
b4.setBackground(Color.yellow);
add(b4);
setSize(3000,3000);//frame size 300 width and 300 height  
setBackground(Color.blue);
setForeground(Color.red);
setLayout(null);//no layout manager
setVisible(true);//now frame will be visible, by default not visible  
}  
public static void main(String args[]){ 
First f=new First();
f.setTitle("  S I T  ");
}}  