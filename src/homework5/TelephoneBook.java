package homework5;

import com.sun.source.tree.Tree;

import java.util.*;

public class TelephoneBook {
    private Map<String, List<Integer>> phoneBook;

    public void PhoneBook(){
        phoneBook = new HashMap<>();
    }

    public void add(String name, int phone) {
        List<Integer> phones = phoneBook.getOrDefault(name, new ArrayList<Integer>());

        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public List<Integer> get(String name) {
        return phoneBook.get(name);
    }

    public Map<String, List<Integer>> findAll(){
        return phoneBook;
    }
}
