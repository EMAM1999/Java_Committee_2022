/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package java_level1;

/**

 @author EMAM
 */
public class ControllStatments {

          public static void main(String[] args) {
                    int x = -1;
                    if ( x > 100 | x < 0 ) {
                              System.err.println("wrong input");
                    } else if ( x >= 85 ) {
                              System.out.println("A");
                    } else if ( x >= 75 ) {
                              System.out.println("B");
                    } else if ( x >= 65 ) {
                              System.out.println("C");
                    } else if ( x >= 50 ) {
                              System.out.println("D");
                    } else {
                              System.out.println("F");
                    }

          }

}
