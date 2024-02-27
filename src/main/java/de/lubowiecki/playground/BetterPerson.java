package de.lubowiecki.playground;

public class BetterPerson {

    private String firstname;

    private String lastname;

    private int age;

    private boolean smoker;

    // Konstruktoren belegen Objekte mit Werten
    public BetterPerson(String firstname, String lastname, int age, boolean s) {
        // parameter firstname wird auf die Instanzvariable firstname von diesem Objekt zugewiesen
        this.firstname = firstname;
        this.lastname = lastname;
        //if(age > 0)
        //    this.age = age;
        setAge(age);
        smoker = s; // Wenn kein Namenskonflikt besteht kann auf this verzichtet werden
    }

    // Überladen = Parameterliste ist anders (Anzahl, Reihenfolge oder Typen)
    // Construktopr wird überladen = eine zweite Version wird bereitgestellt
    public BetterPerson(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        setAge(30);
        smoker = false;
    }

    // Objektkapselung = Alle Eigenschaften sind private
    // Lesen und Schreiben wird über Getter und Setter kontrolliert

    // Getter erlauben einen kontrollierten Zugriff auf private Eigenschaften
    // Setter erlauben einen kontrolliertes Schreiben in private Eigenschaften

    public String getFirstname() { // Zum Lesen privater Eigenschaften
        return firstname;
    }

    public void setFirstname(String firstname) { // Zum Schreiben privater Eigenschaften
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    // Nur Instanzmethoden können Instanzeigenschaften benutzen
    public void sayHello() {
        System.out.println("Hi! Ich heiße " + firstname + " " + lastname);
        System.out.println("Ich bin " + age + " Jahre alt.");
        if(smoker)
            System.out.println("Ich bin ein Raucher");
    }
}
