import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOperations {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add element at the end");
            System.out.println("2. Add element at the beginning");
            System.out.println("3. Remove element from the end");
            System.out.println("4. Remove element from the beginning");
            System.out.println("5. Display elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add at the end: ");
                    int elementEnd = scanner.nextInt();
                    linkedList.addLast(elementEnd);
                    System.out.println("Element added at the end.");
                    break;
                case 2:
                    System.out.print("Enter element to add at the beginning: ");
                    int elementBeginning = scanner.nextInt();
                    linkedList.addFirst(elementBeginning);
                    System.out.println("Element added at the beginning.");
                    break;
                case 3:
                    if (!linkedList.isEmpty()) {
                        linkedList.removeLast();
                        System.out.println("Element removed from the end.");
                    } else {
                        System.out.println("The list is empty. No elements to remove.");
                    }
                    break;
                case 4:
                    if (!linkedList.isEmpty()) {
                        linkedList.removeFirst();
                        System.out.println("Element removed from the beginning.");
                    } else {
                        System.out.println("The list is empty. No elements to remove.");
                    }
                    break;
                case 5:
                    System.out.println("Linked List Elements: " + linkedList);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
