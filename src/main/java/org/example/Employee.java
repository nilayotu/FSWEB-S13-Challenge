package org.example;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public void addHealthplan(int index, String name){
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Hata: Geçersiz index.");
            return;
        }

        if (healthPlans[index] == null || healthPlans[index].isEmpty()) {
            healthPlans[index] = name;
            System.out.println("Çalışan eklendi: " + name);
        } else {
            System.out.println("Hata: Bu index zaten dolu. Mevcut çalışan: " + healthPlans[index]);
        }
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName  = fullName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String[] getHealthPlans(){
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans){
        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
