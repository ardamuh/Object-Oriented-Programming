package com.ardamuh;

public class Main {
    public static void main(String[] args) {
        User users = new User("Anton01");
        users.setPassword("anton123");
        users.setLogin_status(true);

        System.out.println("=========================================");
        System.out.println("User ID = " + users.getUser_id());
        System.out.println("Password = " + users.getPassword());
        System.out.println("Login status = " + users.verify_login() );
        System.out.println("=========================================");

        Customer customers = new Customer("Nana01");
        customers.register("Nana01", "nana123");
        customers.setCustomer_name("Nana Shihab");
        customers.setAddress("Perum. Beverly blok AC 12");
        customers.setEmail("nanashihab@gmail.com");
        customers.update_credit_card_info("4554242315501997", "2025-03-16", "20");
        customers.update_shipping_info(250000, 12500, 262500);
        customers.setLogin_status(true);

        System.out.println("\n=========================================");
        System.out.println("Customer Name = " + customers.getCustomer_name());
        System.out.println("User ID = " + customers.getUser_id());
        System.out.println("Password = " + customers.getPassword());
        System.out.println("Login status = " + customers.verify_login());
        System.out.println("Address = " + customers.getAddress());
        System.out.println("Email = " + customers.getEmail());
        System.out.println("=========================================");
        System.out.println("Credit card info :");
        customers.show_credit_card_info();
        System.out.println("=========================================");
        System.out.println("Shipping info :");
        customers.show_shipping_info();
        System.out.println("=========================================\n");

        Admin admins = new Admin("Agus01");
        admins.setAdmin_name("Agus Erlangga");
        admins.setEmail("aguseng@gmail.com");
        admins.setPassword("admin01");
        admins.setLogin_status(true);

        System.out.println("=========================================");
        System.out.println("User ID = " + admins.getUser_id());
        System.out.println("Password = " + admins.getPassword());
        System.out.println("Email = " + admins.getEmail());
        System.out.println("Login status = " + admins.verify_login());
        System.out.println("Admin name = " + admins.getAdmin_name());
        System.out.println("=========================================");
    }
}
