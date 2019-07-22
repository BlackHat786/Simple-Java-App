/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juwipseudo;
import java.util.*;
/**
 *
 * @author Mo'Ameen
 */
public class JuwiPseudo {

    static String[] Products;
    static double[] price;
    static double total=0.0, subtotal;
    static int numProducts=0;
    /*Declare Product as an array
      Declare price as an array
      Initialze total to 0 and Declare Subtotal Variable
    Initialze numProducts*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        
        System.out.println("Enter number of Products Purchased: ");
        numProducts=kb.nextInt();
       //Prompt user to enter the number of products purchased
        Products= new String[numProducts];
        //Save the number of products as the size of the product array
        price = new double[numProducts];
         //Save the number of products as the size of the price array
        
         for (int i = 0; i < numProducts; i++) //for loop: index equals 0 and index less than the number of products and increment index
         {
            System.out.print("Name of Product: ");
            Products[i] =kb.next();
             //Prompt user for the product name and save the products in the product array
            System.out.print("Enter The Price of The Product: R");
            price[i]= kb.nextDouble();
            //Prompt user for the price and save the price in the price array
            subtotal+= price[i];
            //increment the subtotal for each price
            total=subtotal; 
            //save the subtotal to the Total price
         }
 
        System.out.println("===============================");
        
            System.out.println("Willson & Son");// Print Willsons & So
            System.out.println("Products             Price"); //Print Prodcut And Price
            for (int i = 0; i < numProducts; i++) //For loop to displaying the product name and price
            {
            System.out.println(Products[i]+"            "+price[i]);
            }
            System.out.println("___________________________");//Print Line
            System.out.println("Total                    R"+total);//Print Total
       
              
               
    }
    
}
