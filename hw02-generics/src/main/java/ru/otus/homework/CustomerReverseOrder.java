package ru.otus.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class CustomerReverseOrder {

    private final Deque<Customer> customerStack = new ArrayDeque<>();

    public void add(Customer customer) {
        customerStack.addLast(customer);
    }

    public Customer take() {
        return customerStack.removeLast();
    }
}
