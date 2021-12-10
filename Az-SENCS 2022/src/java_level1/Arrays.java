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
public class Arrays {

          public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);
//        1.
                    int[] array1 = new int[10];
                    int[] array2 = new int[] { 9 , 5 , 7 };
                    int[] array3 = { 9 , 5 , 7 };
//                    int[] x, y;

//        2. Displey
//                    for ( int i = 0 ; i < array2.length ; i++ ) {
//                              System.out.println(array2[i]);
//                    }
//        3. Set
//                    for ( int i = 0 ; i < array1.length ; i++ ) {
//                              array1[i] = in.nextInt();;
//                    }
//                    for ( int i = 0 ; i < array1.length ; i++ ) {
//                              System.out.println(array1[i]);
//                    }
//        4. For each
//                    for ( int ele : array1 ) {
//                    }
//        5. Max, Min
//                    int max = array2[0];
//                    for ( int ele : array2 ) {
//                              if ( ele > max ) {
//                                        max = ele;
//                              }
//                    }
//                    System.out.println(max);
//                    int min = array2[0];
//                    for ( int ele : array2 ) {
//                              if ( ele < min ) {
//                                        min = ele;
//                              }
//                    }
//                    System.out.println(min);
//                    int max1 = array2[0];
//                    int min1 = array2[0];
//                    for ( int ele : array2 ) {
//                              if ( ele < min1 ) {
//                                        min1 = ele;
//                              }
//                              if ( ele > max1 ) {
//                                        max1 = ele;
//                              }
//                    }
//                    System.out.println(max1);
//                    System.out.println(min1);
//        6. Sum, Average
                    int sum = 0;
                    for ( int ele : array3 ) {
                              sum += ele;
                    }
                    System.out.println(sum);
                    System.out.println(sum / array3.length);
//        7. Frequances
                    int grades[] = { 1 , 9 , 5 , 0 , 4 , 6 , 0 , 7 , 9 , 6 , 4 , 8 , 5 , 1 , 3 , 5 , 2 , 4 , 6 , 7 , 1 , 9 , 2 , 5 , 4 , 8 };
                    int[] freq = new int[10];
                    for ( int i = 0 ; i < grades.length ; i++ ) {
                              int index = grades[i];
                              freq[index] += 1;
                    }
                    for ( int i = 0 ; i < freq.length ; i++ ) {
                              System.out.println(i+"  "+freq[i]);
                    }
//        8. Insert
//        9. Delete
//        10. Sort
          }

}
