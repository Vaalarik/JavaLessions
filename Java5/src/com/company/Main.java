package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
    Employee[] EmpArray = new Employee[5];
    EmpArray[0] = new Employee("Ivanov Ivan Ivanovich", "Техник", "email1@mail.ru", "88005553535", 30000, 30);
    EmpArray[1] = new Employee("Sidorov Ivan Ivanovich", "Манагер", "email2@mail.ru", "88005553536", 35000, 35);
    EmpArray[2] = new Employee("Petrov Ivan Ivanovich", "Компутерщик", "email3@mail.ru", "88005553537", 300000, 31);
    EmpArray[3] = new Employee("Govnov Ivan Ivanovich", "Компьютер", "email4@mail.ru", "88005553538", 33000, 43);
    EmpArray[4] = new Employee("Baldurov Ivan Ivanovich", "Павел", "email5@mail.ru", "88005553539", 200, 92);
        for (Employee curEmp : EmpArray) {
            System.out.print(curEmp.getAge() >= 40 ? "\n" + curEmp.info() + "\n" : "");
        }
    }

}
class Employee{
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullname, String position, String email, String phone, int salary, int age){
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public String info(){
        return "Досье на работника сформировано:\n ФИО: " + fullname + "\n Должность: " + position + "\n E-mail: " + email + "\n Телефон: " + phone + "\n Зарплата: " + salary + "\n Возраст: " + age + "\n";
    }
    public int getAge() {
        return age;
    }
}
