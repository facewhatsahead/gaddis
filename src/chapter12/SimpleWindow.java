/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;
import javax.swing.*;

/**
 *
 * @author calmp
 */
public class SimpleWindow extends JFrame
{
public SimpleWindow(){
    final int WINDOWWIDTH=350;
    final int WINDOWHEIGHT= 250;
    
     setTitle("a simple window");
     
     setSize(WINDOWWIDTH, WINDOWHEIGHT);
     
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     setVisible(true);
             }}
