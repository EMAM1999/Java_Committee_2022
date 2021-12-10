/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package java_level1;

import java.util.Scanner;

/**

 @author EMAM
 */
public class LoopStatments {

          public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);
//        1.
                    for ( int i = 1 ; i < 11 ; i++ ) {
                              System.out.println(i);
                    }
//        2.
                    for ( int i = 1 ; i <= 10 ; i++ ) {
                              if ( i == 5 ) {
                                        break;
                              }
                              System.out.println(i);
                    }
//        3.
                    for ( int i = 1 ; i <= 10 ; i++ ) {
                              if ( i == 5 ) {
                                        continue;
                              }
                              System.out.println(i);
                    }
//        4.
                    for ( int i = 1 ; i <= 4 ; i++ ) {
                              for ( int j = 0 ; j < i ; j++ ) {
                                        System.out.print("*");
                              }
                              System.out.println();
                    }
//        5.
                    for ( String i = "*" ; i.length() < 5 ; i += "*" ) {
                              System.out.println(i);
                    }
//        6.  divide 2 numbers The seconds one is NOT 0
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    while ( num2 == 0 ) {
                              System.out.println("Invalid input");
                              num2 = in.nextInt();
                    }
                    System.out.println(num1 / num2);
                    num1 = in.nextInt();
                    do {
                              num2 = in.nextInt();
                    } while ( num2 == 0 );
                    System.out.println(num1 / num2);
//        7.
                    System.out.print("X >> ");
                    int x = in.nextInt();
                    System.out.print("Y >> ");
                    int y = in.nextInt();
                    int power = 1;
                    for ( int i = 0 ; i < y ; i++ ) {
                              power *= x;
                    }
                    System.out.println("X^y = " + power);
                    int factorial = 1;
                    for ( int i = x ; i > 0 ; i-- ) {
                              factorial *= i;
                    }
                    System.out.println("X! = " + factorial);
                    int p = 1;
                    for ( int i = x ; i > (x - y) ; i-- ) {
                              p *= i;
                    }
                    System.out.println("XpY = " + p);
//        8.
                    for ( int i = 7 ; i < 100 ; i += 7 ) {
                              System.out.println(i);
                    }
//        9.
                    for ( int i = 1 ; i < 1000 ; i *= 2 ) {
                              System.out.println(i);
                    }
          }

}

