package ru.savrey.lesson04;
// Задание 1
// Создайте коллекцию мужских и женских имен с помощью интерфейса List
// Отсортируйте коллекцию в алфавитном порядке
// Отсортируйте коллекцию пол количеству букв в слове
// Разверните коллекцию
//
// Задание 2
// Создайте коллекцию мужских и женских имен с помощью интерфейса List -
// добавьте повторяющиеся значения
// Получите уникальный список Set на основании List
// Определите наименьший элемент (алфавитный порядок)
// Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
// Удалите все элементы содержащие букву ‘A’
//
// Задание 3
// Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
// Найдите человека с самым маленьким номером телефона
// Найдите номер телефона человека чье имя самое большое в алфавитном порядке

// Homework
// Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников -
// каждый сотрудник должен иметь следующие атрибуты:
// Табельный номер
// Номер телефона
// Имя
// Стаж
// Добавить метод, который ищет сотрудника по стажу (может быть список)
// Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
// Добавить метод, который ищет сотрудника по табельному номеру
// Добавить метод добавление нового сотрудника в справочник сотрудников

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("John");
//        names.add("Julie");
//        names.add("Alexander");
//        names.add("Alexander");
//        names.add("Tomas");
//        names.add("Isabella");
//        names.add("Julie");
//        names.add("Isabella");
//        names.add("Alexander");
//        names.add("Chandrasecar");
//        names.add("Isabella");
//        names.add("Sylith");
//        names.add("Dorotea");
//        names.add("Ardath");
//        names.add("Ardath");
//        names.add("Bathdeck");
//        names.add("Julie");
//        names.add("Julie");
//        System.out.println(names);
//
//        names.sort(String::compareTo);
//        System.out.println(names);
//
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length())
//                    return 1;
//                else if (o1.length() < o2.length()) {
//                    return -1;
//                }
//                return 0;
//            }
//        };
//        names.sort(comparator);
//        System.out.println(names);
//
//        names.sort(Comparator.reverseOrder());
//        System.out.println(names);
//
//        // Задание 2
//        Set<String> namesSet = new HashSet<>(names);
//        System.out.println(namesSet);
//
//        names.sort(String::compareTo);
//        System.out.println(names.get(0));
//
//        names.sort(comparator);
//        System.out.println(names.get(names.size() - 1));
//
//        names.removeIf(name -> name.contains("a"));
//        System.out.println(names);
//
//        // Задание 3
//        Map<Integer, String> phonebook = new HashMap<>();
//        phonebook.put(452674, "Andrey");
//        phonebook.put(452672, "Sergey");
//        phonebook.put(452690, "Timothy");
//        phonebook.put(452689, "Max");
//        phonebook.put(452695, "Kiros");
//
//        int smallestNumber = 1_000_000_000;
//        for (Integer phone : phonebook.keySet()) {
//            if (phone < smallestNumber) smallestNumber = phone;
//        }
//        System.out.println(phonebook.get(smallestNumber));
//
//        List<Map.Entry<Integer, String>> phonebookList = new ArrayList<>(phonebook.entrySet());
//        phonebookList.sort(Map.Entry.comparingByValue());
//        System.out.println(phonebookList.get(phonebookList.size() - 1).getValue());

        // Homework
        Employee employee1 = new Employee(1000,
                "+79559142374", "John Smith", 5);
        Employee employee2 = new Employee(1021,
                "+79558674374", "Jane Smith", 3);
        Employee employee3 = new Employee(1033,
                "+79558642834", "George Smith", 1);
        Employee employee4 = new Employee(1039,
                "+79558642311", "Jess Smith", 1);
        Employee employee5 = new Employee(1100,
                "+79558641111", "Igor Smith", 50);

        EmployeeDirectory employees = new EmployeeDirectory();
        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(employee3);
        employees.addEmployee(employee4);
        employees.addEmployee(employee5);

        System.out.println(employees);

        System.out.println(employees.searchByTableNumber(1033));
        System.out.println(employees.searchPhoneByName("Jess Smith"));
        System.out.println(employees.searchByExperience(1));


    }
}
