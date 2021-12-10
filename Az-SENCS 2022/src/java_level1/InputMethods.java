/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package java_level1;

import javax.swing.JOptionPane;

/**

 @author EMAM
 */
public class InputMethods {

          public static void main(String[] args) {
                    String name = JOptionPane.showInputDialog("Enter your name");
                    JOptionPane.showMessageDialog(null, name);
          }

}
