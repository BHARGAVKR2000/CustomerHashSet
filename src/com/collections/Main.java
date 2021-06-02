package com.collections;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Customer> map = new HashMap<>();
        Customer customer1 = new Customer("bhargav", 1, "kumaran");
        Customer customer2 = new Customer("sam", 2, "hcl");
        Customer customer3 = new Customer("jebinesh", 3,"kumaran");
        Customer customer4 = new Customer("rohit", 4,"tcs");
        map.put(customer1.getId(),customer1);
        map.put(customer2.getId(),customer2);
        map.put(customer3.getId(),customer3);
        map.put(customer4.getId(),customer4);


        for(Customer obj: map.values()){
            System.out.println("name :"+obj.name+" organisation :"+obj.organisation);
        }
    }
}
