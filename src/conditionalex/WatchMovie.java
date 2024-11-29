/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author JanJoris
 */
public class WatchMovie {

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        int moviePrice = sc.nextInt();
        int movieRating = sc.nextInt();
        if (moviePrice >= 12 && movieRating == 5) {
        	System.out.println("yes im very interested");
        }
        else {
        System.out.println("im not interested");	
        }
        
        sc.close();
    }
}
