/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;
import java.util.Scanner;
/**
 *
 * @author noorm
 */
public class InvoiceTest {
    public static void main(String[] args){
        // create a new Scanner for user interactions
        Scanner input = new Scanner(System.in);
        
        // create a new invoice object
        Invoice myInvoice = new Invoice();
        myInvoice.setPartNumber("JAC123K");
        myInvoice.setPartDescription("A fancy object that is expensive.");
        myInvoice.setQuantityPurchased(2);
        myInvoice.setPricePerItem(10.2);
        
        // display invoice amount
        System.out.printf("Invoice amount: $%.2f%n", myInvoice.getInvoiceAmount());
        
        // Get user input for the next invoice
        System.out.print("Enter a part number: ");
        String partNumber = input.nextLine();
        myInvoice.setPartNumber(partNumber);
        System.out.print("Enter a part description: ");
        String partDescription = input.nextLine();
        myInvoice.setPartDescription(partDescription);
        System.out.print("Enter quantity purchased: ");
        int quantityPurchased = input.nextInt();
        myInvoice.setQuantityPurchased(quantityPurchased);
        System.out.print("Enter price per item: ");
        double pricePerItem = input.nextDouble();
        myInvoice.setPricePerItem(pricePerItem);
        
        System.out.printf("Invoice amount: $%.2f%n", myInvoice.getInvoiceAmount());
        
    }
}
