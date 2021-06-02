package com.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public void add(HashMap<Integer, Customer> map, Scanner sc){
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter organization:");
        String organization = sc.nextLine();
        Customer customer = new Customer(name,id,organization);
        map.put(id, customer);
    }

    public void update(HashMap<Integer, Customer> map, Scanner sc){
        System.out.println("Enter id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter organization:");
        String organization = sc.nextLine();
        Customer customer = new Customer(name,id,organization);
        map.replace(id,customer);
    }

    public void delete(HashMap<Integer, Customer> map, Scanner sc){
        System.out.println("Enter id to delete:");
        int id = sc.nextInt();
        map.remove(id);
    }

    public void display(HashMap<Integer, Customer> map){
        for(Customer obj: map.values()){
            System.out.println("name :"+obj.name+" organisation :"+obj.organisation);
        }
    }

    @SuppressWarnings("SpellCheckingInspection")
    public static void main(String[] args) {
        HashMap<Integer, Customer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        Customer customer1 = new Customer("james", 1, "tcs");
        Customer customer2 = new Customer("sam", 2, "hcl");
        map.put(customer1.getId(),customer1);
        map.put(customer2.getId(),customer2);
        main.display(map);
//        main.add(map);
        main.update(map,sc);
//        main.delete(map);


        /*Customer customer3 = new Customer("jebinesh", 3,"kumaran");
        Customer customer4 = new Customer("rohit", 4,"tcs");*/

       /* map.put(customer3.getId(),customer3);
        map.put(customer4.getId(),customer4);*/


        main.display(map);

    }
}
