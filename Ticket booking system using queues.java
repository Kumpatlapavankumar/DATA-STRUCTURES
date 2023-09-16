import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ticket {
    private String passengerName;
    private int seatNumber;

    public Ticket(String passengerName, int seatNumber) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "passengerName='" + passengerName + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Queue<Ticket> ticketQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Book a ticket");
            System.out.println("2. Cancel a ticket");
            System.out.println("3. Display booked tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter passenger name: ");
                    String passengerName = scanner.nextLine();
                    System.out.print("Enter seat number: ");
                    int seatNumber = scanner.nextInt();
                    Ticket ticket = new Ticket(passengerName, seatNumber);
                    ticketQueue.offer(ticket); // Add the ticket to the queue
                    System.out.println("Ticket booked successfully!");
                    break;
                case 2:
                    System.out.print("Enter the seat number to cancel the ticket: ");
                    int cancelSeatNumber = scanner.nextInt();
                    boolean canceled = false;
                    for (Ticket t : ticketQueue) {
                        if (t.getSeatNumber() == cancelSeatNumber) {
                            ticketQueue.remove(t);
                            System.out.println("Ticket for seat " + cancelSeatNumber + " canceled.");
                            canceled = true;
                            break;
                        }
                    }
                    if (!canceled) {
                        System.out.println("Ticket for seat " + cancelSeatNumber + " not found.");
                    }
                    break;
                case 3:
                    System.out.println("Booked Tickets:");
                    for (Ticket t : ticketQueue) {
                        System.out.println(t);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    
            }
        }
    }
}
  
