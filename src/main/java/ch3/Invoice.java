/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

/**
 *
 * @author noorm
 */
public class Invoice {
    // instance variables of class Invoice
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double pricePerItem;
    
    // get methods for instance variables
    public String getPartNumber(){
        return partNumber;
    }
    
    public String getPartDescription(){
        return partDescription;
    }
    
    public int getQuantityPurchased(){
        return quantityPurchased;
    }
    
    public double getPricePerItem(){
        return pricePerItem;
    }
    
    // set methods for instance variables
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public void setQuantityPurchased(int quantityPurchased){
        if (quantityPurchased < 0)
            this.quantityPurchased = 0;
        this.quantityPurchased = quantityPurchased;
    }
    public void setPricePerItem(double pricePerItem){
        if (pricePerItem < 0.0)
            this.pricePerItem = 0.0;
        this.pricePerItem = pricePerItem;
    }
    
    public double getInvoiceAmount(){
        return quantityPurchased * pricePerItem;
    }
}
