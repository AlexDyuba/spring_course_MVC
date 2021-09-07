package com.alexdyuba.spring.mvc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "YOUR NAME VERY SHORT")
    private String name;
    @NotBlank(message = "Try again")
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String brandCar;
    private Map<String, String> brandCars;
    private String[] languages;
    private Map<String, String> containerLanguages;
    @Pattern(regexp = "375-\\d{2}-\\d{3}-\\d{2}-\\d{2}", message = "error number")
    private String phone;

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getContainerLanguages() {
        return containerLanguages;
    }

    public void setContainerLanguages(Map<String, String> containerLanguages) {
        this.containerLanguages = containerLanguages;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public Map<String, String> getBrandCars() {
        return brandCars;
    }

    public void setBrandCars(Map<String, String> brandCars) {
        this.brandCars = brandCars;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technologies");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        brandCars = new HashMap<>();
        brandCars.put("BMW", "BMW");
        brandCars.put("Audi", "Audi");
        brandCars.put("Mercedes-Benz", "MB");

        containerLanguages = new HashMap<>();
        containerLanguages.put("English", "EN");
        containerLanguages.put("Deutch", "DE");
        containerLanguages.put("French", "FR");
    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
