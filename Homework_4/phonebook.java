package Homework_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 1 Реализовать телефонный справочник
 * HashMap<Login, Список телефонов>
 * - добалять телефон
 * - удалять телефон
 * - находить по логину телефон/список телефонов
 */

public class phonebook {
    static HashMap<String, HashSet<String>> pb = new HashMap<>();

    public static void main(String[] args) {
        
        addPB("Ivanov", "8(800)555-35-35");
        addPB("Ivanov", "8(017)253-78-12");
        addPB("Ivanov", "8(029)123-78-12");
        addPB("Petrov", "8(495)415-82-82");
        addPB("Sidorov", "8(800)410-20-20");
        addPB("Perov", "8(800)474-58-58");
        addPB("Costenko", "8(496)274-16-79");
        addPB("Pechkin", "8(925)316-65-82");
        addPB("Ivanova", "8(903)155-20-90");
        addPB("Perova", "8(903)675-75-10");
        displayMenu();
        
    }

    // добавляет новый контакт в телефонную книгу
    public static void addPB(String login, String number) {
        HashSet<String> phones;
        if (pb.get(login) != null) {
            phones = pb.get(login);
        } else {
            phones = new HashSet<>();
        }
        phones.add(number);
        pb.put(login, phones);
    }

    // показывает все записи из телефонной книги
    public static void showPB() {
        for (String name : pb.keySet()) {
            String key = name.toString();
            String value = pb.get(name).toString();
            System.out.println(key + " " + value);
        }
    }

    // находит контакт по фамилии в телефонной книге 
    public static void findPB(String login) {
        if (pb.get(login) == null) {
            System.out.println("Контакт на найден");
        }else{
            System.out.println(pb.get(login));
        }
    }

    // удаляет контакт по фамилии из телефонной книги
    public static void delPB(String login) {
        pb.remove(login);
        System.out.printf("Запись [%s] удалена\n", login);
    }

    // заменяет один телефон на другой в телефонной книге 
    public static void replacePB(String login, String oldPhone , String newPhone) {
        HashSet<String> phones = pb.get(login);
        if (phones != null) {
            phones.remove(oldPhone);
            phones.add(newPhone);
            pb.put(login, phones);
        }
    }

    public static void displayMenu() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Показать все записи");
            System.out.println("2. Добавить новый контакт");
            System.out.println("3. Найти запись");
            System.out.println("4. Удалить контакт");
            System.out.println("5. Изменить номер телефона у контакта");
            System.out.println("6. Выход");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ваши контакты");
                    showPB();
                    break;
                case 2:
                    System.out.println("Добавление контакта");
                    System.out.println("Введите ФИО:");
                    String name = in.nextLine();
                    System.out.println("Введите телефон: ");
                    String phone = in.nextLine();
                    addPB(name, phone);
                    break;
                case 3:
                    System.out.println("Поиск контакта");
                    System.out.print("Введите ФИО для поиска: ");
                    String findName = in.nextLine();
                    findPB(findName);
                    break;
                case 4:
                    System.out.println("Удаление контакта");
                    System.out.print("Введите ФИО для удаления: ");
                    String delName = in.nextLine();
                    delPB(delName);
                    break;
                case 5:
                    System.out.println("Изменить номер телефона у контакта");
                    System.out.print("Введите ФИО для изменения: ");
                    String repName = in.nextLine();
                    System.out.println("Введите номер который необходимо изменить: ");
                    String oldPhone = in.nextLine();
                    System.out.println("Введите номер который необходимо записать: ");
                    String newPhone = in.nextLine();
                    replacePB(repName, oldPhone, newPhone);
                    break;    

                default:
                    break;
            }
            if (choice == 6) {
                break;
            }
            
        }in.close();
    }
}
