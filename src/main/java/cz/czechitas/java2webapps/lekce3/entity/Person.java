package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.Period;

public class Person {
//fieldy
    private String givenName;
    private String surname;
    private LocalDate birthDate;
    private int age;

    //    prázdný konstruktor
    public Person() {
    }

//    konstruktor s parametry pro nastavení všech fieldů


    public Person(String givenName, String surname, LocalDate birthDate) {
        this.givenName = givenName;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
//        kontrola, že vstupní jméno není nulové
        if (givenName == null) {
//            když je jméno nulové, tak se vrátí výjimka
            throw new IllegalArgumentException();
        }
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        Period period = birthDate.until(LocalDate.now());
        return period.getYears();
    }

}
