/*
 To change this license header; choose License Headers in Project Properties.
 To change this template file; choose Tools | Templates
 and open the template in the editor.
 */
package java_level1;

/**

 @author EMAM
 */
public class StringColor {

          public static void main(String[] args) {

                    String colorRed = "\033[31m";
                    String colorGreen = "\033[32m";
                    String colorYellow = "\033[33m";
                    String colorBlue = "\033[34m";
                    String colorPurple = "\033[35m";
                    String colorCyan = "\033[36m";
                    String colorWhite = "\033[37m";
                    String backgroundRed = "\033[41m";
                    String backgroundGreen = "\033[42m";
                    String backgroundYellow = "\034[43m";
                    String backgroundBlue = "\033[44m";
                    String backgroundPurple = "\033[45m";
                    String backgroundCyan = "\033[46m";
                    String backgroundWhite = "\033[47m";

                    System.out.println("\033[0m" + colorBlue + "Mohamed");
                    System.out.println("\033[40m" + "Mohamed");
                    System.out.println("\033[2m" + colorBlue + "Mohamed");
          }

}
