package service;

import model.Customer;

import java.util.ArrayList;
import java.util.*;

public class CustomerService {

    private static final Map<String, Customer> mapOfCustomer = new HashMap<String, Customer>();

    public void addCustomer(String email, String firstName, String lastName){
        Customer customer = new Customer(firstName, lastName, email);
        mapOfCustomer.put(email, customer);
    }

    public Customer getCustomer(String email){
        return mapOfCustomer.get(email);
    }

    public Collection<Customer> getAllCustomers(){
        return mapOfCustomer.values();
    }



}
