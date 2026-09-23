import java.util.Scanner;

public class Main extends methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== STUDENT SERVICE QUEUE =====");
            System.out.println("1. Add to Queue");
            System.out.println("2. Remove From Queue");
            System.out.println("3. Show Next Student");
            System.out.println("4. Show Full Queue");
            System.out.println("5. Insert Student In Place");
            System.out.println("6. Search Queue");
            System.out.println("7. Daily Sta tistics");
            System.out.println("8. Exit Program");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print(
                        "Enter 9-digit student number: "
                    );
                    String studentNumber = input.nextLine();
                    if (studentNumber.length() != 9 ||
                        !studentNumber.matches("\\d+")) {
                        System.out.println(
                            "Invalid student number. " +
                            "It must contain exactly 9 digits."
                        );
                        break;
                    }
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    System.out.println("Available Services:");
                    System.out.println("1. Registration");
                    System.out.println("2. Academic Advice");
                    System.out.println("3. Fees");
                    System.out.println("4. Student Card");
                    System.out.println("5. General Enquiry");
                    System.out.print("Select service: ");
                    int serviceChoice = input.nextInt();
                    input.nextLine();
                    String serviceType;
                    switch (serviceChoice) {
                        case 1:
                            serviceType = "Registration";
                            break;
                        case 2:
                            serviceType = "Academic Advice";
                            break;
                        case 3:
                            serviceType = "Fees";
                            break;
                        case 4:
                            serviceType = "Student Card";
                            break;
                        case 5:
                            serviceType = "General Enquiry";
                            break;
                        default:
                            System.out.println(
                                "Invalid service choice."
                            );
                            continue;
                    }
                    int serviceTime =
                        getServiceTime(serviceType);
                    Student student = new Student(
                        studentNumber,
                        name,
                        serviceType,
                        serviceTime
                    );
                    enqueue(student);
                    System.out.println(
                        "Service Type: " + serviceType
                    );
                    System.out.println(
                        "Service Time: " +
                        serviceTime + " minutes"
                    );
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.print("Enter 9-digit student number: ");
                    studentNumber = input.nextLine();
                    if (studentNumber.length() != 9 ||
                        !studentNumber.matches("\\d+")) {
                        System.out.println("Invalid student number.");
                        break;
                        }
                System.out.print("Enter student name: ");
                name = input.nextLine();
                System.out.println("Available Services:");
                System.out.println("1. Registration");
                System.out.println("2. Academic Advice");
                System.out.println("3. Fees");
                System.out.println("4. Student Card");
                System.out.println("5. General Enquiry");
                System.out.print("Select service: ");
                serviceChoice = input.nextInt();
                serviceType = input.nextLine();
                switch (serviceChoice) {
                    case 1:
                        serviceType = "Registration";
                        break;
                    case 2:
                        serviceType = "Academic Advice";
                        break;
                    case 3:
                        serviceType = "Fees";
                        break;
                    case 4:
                        serviceType = "Student Card";
                        break;
                    case 5:
                        serviceType = "General Enquiry";
                        break;
                    default:
                        System.out.println("Invalid service.");
                        break;
                }
                if (serviceChoice < 1 || serviceChoice > 5) {
                    break;
                }
                serviceTime = getServiceTime(serviceType);
                Student newStudent = new Student(
                    studentNumber,
                    name,
                    serviceType,
                    serviceTime
                );
                System.out.print("Enter position: ");
                int position = input.nextInt();
                input.nextLine();
                insertAtPosition(newStudent, position);
                break;
            case 6:
                System.out.print(
                    "Enter student number to search: "
                );
                String searchNumber = input.nextLine();
                searchStudent(searchNumber);
                break;
            case 7:
                dailyStatistics();
                break;
            case 8:
                System.out.println("Thanks for using Student Kiosk");
                break;
            }
        }
        while (choice != 8);
        input.close();
    }
}