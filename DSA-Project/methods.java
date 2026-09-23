public class methods {
    public static int[] serviceTimes = new int[100];
    public static int servedCount = 0;
    public static void insertAtPosition(Student student, int position) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }
        Node newNode = new Node(student);
        if (position == 1) {
            newNode.next = front;
            front = newNode;
            if (rear == null) {
                rear = newNode;
            }
            System.out.println("Student inserted at position " + position);
            return;
        }
        Node current = front;
        for (int i = 1; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position does not exist.");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position does not exist.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
        if (newNode.next == null) {
            rear = newNode;
        }
        System.out.println(
            "Student inserted at position " + position);
    }
    public static void searchStudent(String studentNumber) {
        Node current = front;
        int position = 1;
        while (current != null) {
            if (current.student.studentNumber.equals(studentNumber)) {
                System.out.println("Student is currently in spot #" + position);
                current.student.displayStudent();
                return;
            }
            current = current.next;
            position++;
        }
        System.out.println("Student with number " +  studentNumber + " was not found.");
    }
    static class Student {
        String studentNumber;
        String name;
        String serviceType;
        int serviceTime;
        public Student(String studentNumber, String name,
                       String serviceType, int serviceTime) {
            this.studentNumber = studentNumber;
            this.name = name;
            this.serviceType = serviceType;
            this.serviceTime = serviceTime;
        }
        public void displayStudent() {
            System.out.println("Student Number : " + studentNumber);
            System.out.println("Name           : " + name);
            System.out.println("Service Type   : " + serviceType);
            System.out.println("Service Time   : " + serviceTime + " minutes");
            System.out.println("--------------------------------");
        }
    }
    static class Node {
        Student student;
        Node next;
        public Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }
    static Node front = null;
    static Node rear = null;
    public static int getServiceTime(String serviceType) {
        switch (serviceType.toLowerCase()) {
            case "registration":
                return 15;
            case "academic advice":
                return 20;
            case "fees":
                return 10;
            case "student card":
                return 5;
            case "general enquiry":
                return 10;
            default:
                return 0;
        }
    }
    public static void enqueue(Student student) {
        Node newNode = new Node(student);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Student added to the queue.");
    }
    public static void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        Student removedStudent = front.student;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        serviceTimes[servedCount] = removedStudent.serviceTime;
        servedCount++;
        System.out.println("\nStudent removed:");
        removedStudent.displayStudent();
    }
    public static void peek() {
        if (front == null) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("\nFirst student in queue:");
            front.student.displayStudent();
        }
    }
    public static void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        Node current = front;
        System.out.println("===== STUDENTS IN QUEUE =====");
        while (current != null) {
            current.student.displayStudent();
            current = current.next;
        }
    }
    public static void dailyStatistics() {
    if (servedCount == 0) {
        System.out.println("No students have been served yet.");
        return;
    }
    int totalServiceTime = 0;
    int highestServiceTime = serviceTimes[0];
    int lowestServiceTime = serviceTimes[0];
    int longerThan10 = 0;
    for (int i = 0; i < servedCount; i++) {
        int currentTime = serviceTimes[i];
        totalServiceTime += currentTime;
        if (currentTime > highestServiceTime) {
            highestServiceTime = currentTime;
        }
        if (currentTime < lowestServiceTime) {
            lowestServiceTime = currentTime;
        }
        if (currentTime > 10) {
            longerThan10++;
        }
    }
    double averageServiceTime = (double) totalServiceTime / servedCount;
    System.out.println("===== DAILY STATISTICS =====");
    System.out.println("Total students served: " + servedCount);
    System.out.println("Total service time: " + totalServiceTime + " minutes");
    System.out.println("Average service time: " + averageServiceTime + " minutes");
    System.out.println("Highest service time: " +highestServiceTime + " minutes");
    System.out.println("Lowest service time: " + lowestServiceTime + " minutes");
    System.out.println("Services longer than 10 minutes: " + longerThan10);
    }
        public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(array, low, high);
        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, high);
    }
}
public static int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (array[j] <= pivot) {
            i++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    return i + 1;
}

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
    public static void merge(
        int[] array,
        int left,
        int middle,
        int right) {

        int size1 = middle - left + 1;
        int size2 = right - middle;
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];
        for (int i = 0; i < size1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < size2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < size2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}