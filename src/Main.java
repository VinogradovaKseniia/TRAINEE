import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"солнце", "лес", "любовь", "книга", "вода", "солнце", "друзья", "путь", "мир", "снег", "счастье", "вода", "время", "поиск", "солнце", "книга", "дождь", "мечта", "звезда", "путь"};
        List<String> list = Arrays.asList(words);
        System.out.println(list);
        System.out.println();

        HashSet<String> uniqueWords = new HashSet<>(list);
        System.out.println(uniqueWords);
        System.out.println();

        HashMap<String, Integer> countMap = new HashMap<>();

        for (String word : words) {
            Integer count = countMap.get(word);
            if (count == null) {
                countMap.put(word, 1);
            } else {
                countMap.put(word, count + 1);
            }
        }
        System.out.println(countMap);
        System.out.println();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "89000000000");
        phoneBook.add("Петров", "89107654321");
        phoneBook.add("Смирнова", "89215543210");
        phoneBook.add("Кузнецов", "89319987654");
        phoneBook.add("Михайлова", "89422334455");
        phoneBook.add("Михайлова", "89422334455");
        phoneBook.add("Иванов", "89012345678");
        phoneBook.add("Михайлова", "89123456789");

        String lastName = "Михайлова";
        System.out.println(lastName + ": " + phoneBook.get(lastName));
    }
}