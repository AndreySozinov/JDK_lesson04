package ru.savrey.lesson04;

import java.util.*;

// Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников -
// Добавить метод, который ищет сотрудника по стажу (может быть список)
// Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
// Добавить метод, который ищет сотрудника по табельному номеру
// Добавить метод добавление нового сотрудника в справочник сотрудников
public class EmployeeDirectory {
    private static ArrayList<Employee> directory;

    public EmployeeDirectory() {
        directory = new ArrayList<>() {
        };
    }

    public EmployeeDirectory(int size) {
        directory = new ArrayList<>(size) {
        };
    }

    public List<Employee> searchByExperience(int exp) {
        List<Employee> employees = new ArrayList<>();
        for (Employee employee : directory) {
            if (employee.getExperience() == exp) {
                employees.add(employee);
            }
        }
        return employees;
    }

    public List<String> searchPhoneByName(String name) {
        List<String> phones = new ArrayList<>();
        for (Employee employee : directory) {
            if (employee.getName() == name) {
                phones.add(employee.getPhone());
            }
        }
        return phones;
    }

    public Employee searchByTableNumber(int number) {
        for (Employee employee : directory) {
            if (employee.getTableNumber() == number)
                return employee;
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        directory.add(employee);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Employee employee : directory) {
            if (employee != null) {
                result.append(employee).append("\n");
            }
        }
        return result.toString();
    }
}
