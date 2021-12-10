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
public class Task4 {

          public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);
                    System.out.print("Enter task numbers :: \n"
                            + "1. solve 2 x 2 linear equations\n"
                            + "2. calculate tips\n"
                            + "3. sum the digits in an integer\n"
                            + "4. find the number of years\n"
                            + "5. sample calculator\n"
                            + " >>> ");
                    int num = in.nextInt();
                    System.out.println("\t===============");
                    System.out.println("\t   =========   ");
                    System.out.println("\t      ===      ");
                    switch ( num ) {
                              case 1:
                                        //                    Task 1
                                        System.out.print("Enter a >>> ");
                                        double a = in.nextDouble();
                                        System.out.print("Enter b >>> ");
                                        double b = in.nextDouble();
                                        System.out.print("Enter c >>> ");
                                        double c = in.nextDouble();
                                        System.out.print("Enter d >>>  ");
                                        double d = in.nextDouble();
                                        System.out.print("Enter e >>>  ");
                                        double e = in.nextDouble();
                                        System.out.print("Enter f >>>  ");
                                        double f = in.nextDouble();
                                        double x = (e * d - b * f) / (a * d - b * c);
                                        double y = (a * f - e * c) / (a * d - b * c);
                                        System.out.println("x = " + x + ", y = " + y);
                                        break;
                              case 2:
                                        //                    Task 2
                                        System.out.print("Enter the subtotal and gratuity rate \n >>> ");
                                        double subtotal = in.nextDouble();
                                        double gratuityRate = in.nextDouble();

                                        double gratuity = ( gratuityRate * subtotal / 100 );
                                        double total = ( gratuity + subtotal );

                                        System.out.println("The gratuity is $" + gratuity
                                                + " and total is $" + (total));
                                        break;
                              case 3:
                                        //                    Task 3
                                        System.out.print("Enter a number between 0 and 1000 :: \n >>> ");
                                        int integer = in.nextInt();
                                        int digit1 = integer / 100;
                                        int digit2 = (integer / 10) % 10;
                                        int digit3 = integer % 10;
                                        int sum = digit1 + digit2 + digit3;
                                        System.out.println(digit1 + "+" + digit2 + "+" + digit3 + " = " + sum);
                                        break;
                              case 4:
                                        //                    Task 4
                                        System.out.print("Enter the number of minutes \n >>> ");
                                        int totalMinutes = in.nextInt();
                                        int minutesInYear = 365 * 24 * 60;
                                        int years = totalMinutes / minutesInYear;
                                        int minutes = totalMinutes % minutesInYear;
                                        int minutesInDay = 24 * 60;
                                        int days = minutes / minutesInDay;
                                        System.out.println(totalMinutes + " minutes is approximately " + years + " years and " + days + " days");
                                        break;
                              case 5:
                                        //                    Task 5
                                        System.out.println("Enter 2 numbers :: ");
                                        double num1 = in.nextDouble();
                                        double num2 = in.nextDouble();
                                        System.out.print("Enter an operator :\n"
                                                + "1. +\n"
                                                + "2. -\n"
                                                + "3. *\n"
                                                + "4. /\n"
                                                + "5. %\n"
                                                + " >>> ");
                                        char op = in.next().charAt(0);
                                        switch ( op ) {
                                                  case '1':
                                                  case '+':
                                                            System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
                                                            break;
                                                  case '2':
                                                  case '-':
                                                            System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
                                                            break;
                                                  case '3':
                                                  case '*':
                                                            System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
                                                            break;
                                                  case '4':
                                                  case '/':
                                                            System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
                                                            break;
                                                  case '5':
                                                  case '%':
                                                            System.out.println(num1 + "%" + num2 + " = " + (num1 % num2));
                                                            break;
                                                  default:
                                                            System.out.println("invalid input " + op);
                                        }
                                        break;
                              default:
                                        System.out.println("invalid input " + num);
                    }

          }

}
