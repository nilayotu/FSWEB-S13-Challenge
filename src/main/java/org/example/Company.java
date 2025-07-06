package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro < 0 ? 0 : giro; // giro sıfırın altında olamaz
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hata: Geçersiz index.");
            return;
        }

        if (developerNames[index] == null || developerNames[index].isEmpty()) {
            developerNames[index] = name;
            System.out.println("Çalışan eklendi: " + name);
        } else {
            System.out.println("Hata: Bu index zaten dolu. Mevcut çalışan: " + developerNames[index]);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getGiro(){
        return giro;
    }

    public void setGiro(double giro){
        if (giro < 0) {
            System.out.println("Giro 0'dan küçük olamaz.");
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
