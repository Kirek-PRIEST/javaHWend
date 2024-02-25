import java.util.*;

public class PhoneBook {
    private static HashMap<String, Set<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

// Добавление записи в телефонную книгу

        if (phoneBook.containsKey(name)) {
            Set<Integer> numbers = new HashSet<>();
            numbers = phoneBook.get(name);
            numbers.add(phoneNum);
            phoneBook.put(name, numbers);
        } else {
            Set<Integer> numbers = new HashSet<>();
            numbers.add(phoneNum);
            phoneBook.putIfAbsent(name, numbers);
        }
    }

    public static void printSortedPhoneBook(HashMap<String, Set<Integer>> phoneBook) {
        List<Map.Entry<String, Set<Integer>>> list = new ArrayList<>(phoneBook.entrySet());

        // Сортировка по убыванию числа телефонов
        list.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, Set<Integer>> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void print() {
        printSortedPhoneBook(phoneBook);
    }
}