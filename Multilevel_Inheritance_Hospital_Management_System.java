// Base class
class Person {
    String name;
    int age;

    void getPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Doctor extends Person {
    String specialization;

    void getDoctorDetails(String specialization) {
        this.specialization = specialization;
    }

    void displayDoctorDetails() {
        displayPersonDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Further derived class (Multilevel)
class Surgeon extends Doctor {
    String surgeryType;

    void getSurgeonDetails(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    void displaySurgeonDetails() {
        displayDoctorDetails();
        System.out.println("Surgery Type: " + surgeryType);
    }
}

// Main class
public class Multilevel_Inheritance_Hospital_Management_System {
    public static void main(String[] args) {
        Surgeon s = new Surgeon();
        s.getPersonDetails("Dr. Mehta", 45);
        s.getDoctorDetails("Cardiology");
        s.getSurgeonDetails("Heart Bypass");

        System.out.println("Hospital Management System - Multilevel Inheritance");
        s.displaySurgeonDetails();
    }
}