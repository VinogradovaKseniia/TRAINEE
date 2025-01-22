import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> map = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        Set<String> phoneList = map.get(lastName);
        if (phoneList == null) {
            phoneList = new HashSet<>();
            phoneList.add(phoneNumber);
            map.put(lastName, phoneList);
        } else {
            phoneList.add(phoneNumber);
            map.put(lastName, phoneList);
        }
    }

    public Set<String> get(String lastName) {
        Set<String> phoneList = map.get(lastName);
        if (phoneList == null) {
            return new HashSet<String>();
        } else {
            return phoneList;
        }
    }
}