package com.ardamuh;

import java.util.HashMap;
import java.util.Map;

public class Customer extends User {
    private String customer_name;
    private String address;
    private String email;
    private HashMap<String, String> credit_card_info = new HashMap<String, String>();
    private HashMap<String, Integer> shipping_info = new HashMap<String, Integer>();

    Customer(String user_id) {
        super(user_id);
    }

    //setter method
    public void setCustomer_name(String customer_name){
        this.customer_name = customer_name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //getter method
    public String getCustomer_name(){
        return this.customer_name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail(){
        return this.email;
    }

    public void bill(){ }

    public void register(String user_id, String password){
        setUser_id(user_id);
        setPassword(password);
    }

    public void login(boolean login_status){
        setLogin_status(login_status);
    }

    public void update_profile(String user_id, String password,String customer_name, String address,
                               String email, String credit_card_info, String shipping_info){
        setUser_id(user_id);
        setPassword(password);
        this.customer_name = customer_name;
        this.address = address;
        this.email = email;
    }

    public void update_credit_card_info(String cardNumber, String validthru, String member){
        credit_card_info.put("Card Number", cardNumber);
        credit_card_info.put("Valid Thru", validthru);
        credit_card_info.put("Member Since", member);
    }

    public void show_credit_card_info(){
        for(Map.Entry item: credit_card_info.entrySet()){
            System.out.println("    " + item.getKey() + " : "+ item.getValue());
        }
    }

    public void update_shipping_info(Integer subtotal, Integer tax, Integer total){
        shipping_info.put("Subtotal", subtotal);
        shipping_info.put("Tax", tax);
        shipping_info.put("Total", total);
    }

    public void show_shipping_info(){
        for(Map.Entry item: shipping_info.entrySet()){
            System.out.println("    " + item.getKey() + " : "+ item.getValue());
        }
    }

    private int calculate_next_bill_amount(){
        return 1;
    }

    private void generate_invoice_pdf_version(){ }
}