public class Main {
    public static void main(String[] arg){
        String name1 = "Ivanov";
        String name2 = "Petrov";
        String name3 = "Sidorov";
        String name4 = "Khasanov";
        int phone1 = 123456;
        int phone2 = 254321;
        int phone3 = 354321;
        int phone4 = 454321;
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name2, phone3);
        myPhoneBook.add(name3, phone1);
        myPhoneBook.add(name4, phone2);
        myPhoneBook.add(name4, phone4);
        myPhoneBook.add(name4, phone1);

        PhoneBook.print();
    }
}
