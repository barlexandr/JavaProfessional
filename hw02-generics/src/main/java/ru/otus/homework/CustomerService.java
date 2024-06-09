package ru.otus.homework;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CustomerService {

    private final NavigableMap<Customer, String> customerStringMap = new TreeMap<>(Comparator.comparingLong(Customer::getScores));

    public Map.Entry<Customer, String> getSmallest() {
        var customerStringEntry = customerStringMap.firstEntry();
        return customerStringEntry != null
                ? Map.entry(customerStringEntry.getKey().clone(), customerStringEntry.getValue())
                : null;
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        var entry = customerStringMap.higherEntry(customer);
        return entry != null
                ? Map.entry(entry.getKey().clone(), entry.getValue())
                : null;
    }

    public void add(Customer customer, String data) {
        customerStringMap.put(customer, data);
    }
}
