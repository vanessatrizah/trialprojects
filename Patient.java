import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private String name;
    private int id;

    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Hospital {
    private ArrayList<Patient> admittedPatients;

    public Hospital() {
        admittedPatients = new ArrayList<>();
    }

    public void admitPatient(Patient patient) {
        admittedPatients.add(patient);
        System.out.println("Patient " + patient.getName() + " admitted successfully.");
    }

    public void dischargePatient(int patientId) {
        for (Patient patient : admittedPatients) {
            if (patient.getId() == patientId) {
                admittedPatients.remove(patient);
                System.out.println("Patient " + patient.getName() + " discharged successfully.");
                return;
            }
        }
        System.out.println("Patient with ID " + patientId + " not found.");
    }

    public void displayAdmittedPatients() {
        System.out.println("Admitted Patients:");
        for (Patient patient : admittedPatients) {
            System.out.println("ID: " + patient.getId() + ", Name: " + patient.getName());
        }
    }
}