package com.collections;

public class Customer {

    String name;
    int id;
    String organisation;

    public Customer(String name, int id, String organisation) {
        this.name = name;
        this.id = id;
        this.organisation = organisation;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }




}
