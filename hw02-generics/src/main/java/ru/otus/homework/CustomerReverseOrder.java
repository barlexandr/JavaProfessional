package ru.otus.homework;

import java.util.*;

public class CustomerReverseOrder {

    private final Stack<Customer> customerStack = new Stack<>();

    public void add(Customer customer) {
        customerStack.add(customer);
    }

    public Customer take() {
        return customerStack.pop();
    }
}
