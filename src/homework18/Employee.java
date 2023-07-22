package homework18;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("John Smith", "Sales", 50000, "Sales Representative"));
        personList.add(new Person("Emily Johnson", "Marketing", 60000, "Marketing Manager"));
        personList.add(new Person("Michael Williams", "IT", 70000, "IT Analyst"));

        personList.add(new Person("Emma Brown", "Sales", 55000, "Sales Coordinator"));
        personList.add(new Person("William Davis", "Marketing", 65000, "Marketing Specialist"));
        personList.add(new Person("Olivia Jones", "IT", 75000, "IT Engineer"));

        personList.add(new Person("James Taylor", "Sales", 60000, "Sales Manager"));
        personList.add(new Person("Sophia Martinez", "Marketing", 70000, "Marketing Coordinator"));
        personList.add(new Person("Benjamin Anderson", "IT", 80000, "IT Specialist"));

        Map<String, List<Person>> groupPersonDepartment = personList.stream().collect(Collectors.groupingBy(Person::getDepartment, Collectors.toList()));

        System.out.println("Department: " + groupPersonDepartment);

        double averageSalary = personList.stream().mapToDouble(Person::getSalary).average().orElse(0);
        System.out.println("Средняя зарплата: " + averageSalary);


        List<Person> salaryMore70000 = personList.stream().filter(person -> person.getSalary() > 70000).toList();
        System.out.println("Сотрудники с зарплатой > 70000:" + salaryMore70000);

        List<Person> salaryForIT = personList.stream().filter(person -> person.getDepartment().equals("IT")).peek(person -> person.setSalary(person.getSalary() * 1.15)).toList();
        System.out.println("Сотрудники с увеличенной зарплатой:" + salaryForIT);

        Person lowSalary = personList.stream().min(Comparator.comparing(Person::getSalary)).get();
        System.out.println("С самой низкой зарплатой: " + lowSalary);

        Map<String, Optional<Person>> personByMaxSalary = personList.stream().collect(Collectors.groupingBy(Person::getDepartment, Collectors.maxBy(Comparator.comparing(Person::getSalary))));
        System.out.println("С самой высокой зарплатой по отделам: " + personByMaxSalary);
    }
}
