/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5;

/**
 *
 * @author noorm
 */
public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        // validate the state letters
        if (state == "CT" || state == "MA" || state == "ME" || state == "NH" 
                || state == "NJ" || state == "NY" || state == "PA" 
                || state == "VT"){
            this.state = state;
        } else {
            System.out.printf("Invalid state: %s.", state);
        }
    }

    public String getState() {
        return state;
    }

    
    public boolean isNoFaultState(){
        boolean noFaultState;
        
        // determine whether state has no-fault auto insurance
        switch (getState()){
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
} // end class AutoPolicy
