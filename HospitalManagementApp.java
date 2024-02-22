import java.util.Scanner;

public class HospitalManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        boolean running = true;
        while (running) {
            System.out.println("Hospital Management System");
            System.out.println("1. Admit Patient");
            System.out.println("2. Discharge Patient");
            System.out.println("3. Display Admitted Patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.next();
                    System.out.print("Enter patient ID: ");
                    int patientId = scanner.nextInt();
                    Patient patient = new Patient(patientName, patientId);
                    hospital.admitPatient(patient);
                    break;
                case 2:
                    System.out.print("Enter patient ID to discharge: ");
                    int dischargeId = scanner.nextInt();
                    hospital.dischargePatient(dischargeId);
                    break;
                case 3:
                    hospital.displayAdmittedPatients();
                    break;
                case 4:
                    running = false; // Exit the loop
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        // Close the scanner
        scanner.close();
    }
} 