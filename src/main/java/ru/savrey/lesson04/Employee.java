package ru.savrey.lesson04;
// каждый сотрудник должен иметь следующие атрибуты:
// Табельный номер
// Номер телефона
// Имя
// Стаж
public class Employee {
    private int tableNumber;
    private String phone;
    private String name;
    private int experience;

    public Employee(int tableNumber, String phone, String name, int experience) {
        this.tableNumber = tableNumber;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "tableNumber=" + tableNumber +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
