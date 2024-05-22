package ru.otus.homework;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    private final Map<Customer, String> customerStringMap = new TreeMap<>(Comparator.comparingLong(Customer::getScores));

    public Map.Entry<Customer, String> getSmallest() {
        var customerStringEntry = customerStringMap.entrySet().stream()
                .findFirst()
                .orElse(null);
        return customerStringEntry != null
                ? Map.entry(customerStringEntry.getKey().clone(), customerStringEntry.getValue())
                : null;
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        for (var entry : customerStringMap.entrySet()) {
            if (entry != null && entry.getKey().getScores() > customer.getScores()) {
                return Map.entry(entry.getKey().clone(), entry.getValue());
            }
        }
        return null;
    }

    public void add(Customer customer, String data) {
        customerStringMap.put(customer, data);
    }
}
