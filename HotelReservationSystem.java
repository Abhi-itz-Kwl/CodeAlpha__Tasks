import java.util.ArrayList;
import java.util.Scanner;

class Room {
    int roomNumber;
    String roomType;
    boolean isAvailable;
    double price;

    Room(int roomNumber, String roomType, boolean isAvailable, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.price = price;
    }
}

class Booking {
    String customerName;
    int roomNumber;
    String roomType;
    double totalPrice;

    Booking(String customerName, int roomNumber, String roomType, double totalPrice) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.totalPrice = totalPrice;
    }
}

public class HotelReservationSystem {
    static ArrayList<Room> rooms = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initializeRooms();
        
        int choice;
        do {
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Make a Reservation");
            System.out.println("3. View Booking Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    viewAvailableRooms();
                    break;
                case 2:
                    makeReservation();
                    break;
                case 3:
                    viewBookings();
                    break;
                case 4:
                    System.out.println("Thank you for using the Hotel Reservation System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);
        
        sc.close();
    }
    
   
    public static void initializeRooms() {
        rooms.add(new Room(101, "Single", true, 100.0));
        rooms.add(new Room(102, "Double", true, 150.0));
        rooms.add(new Room(103, "Suite", true, 250.0));
        rooms.add(new Room(104, "Single", true, 100.0));
        rooms.add(new Room(105, "Double", true, 150.0));
    }
    
    
    public static void viewAvailableRooms() {
        System.out.println("\n--- Available Rooms ---");
        for (Room room : rooms) {
            if (room.isAvailable) {
                System.out.println("Room Number: " + room.roomNumber + ", Type: " + room.roomType + ", Price: $" + room.price);
            }
        }
    }
    
    
    public static void makeReservation() {
        System.out.println("\nEnter your name: ");
        String customerName = sc.nextLine();
        
        viewAvailableRooms();
        
        System.out.println("\nEnter room number to book: ");
        int roomNumber = sc.nextInt();
        
        for (Room room : rooms) {
            if (room.roomNumber == roomNumber && room.isAvailable) {
                room.isAvailable = false;
                bookings.add(new Booking(customerName, roomNumber, room.roomType, room.price));
                System.out.println("Reservation successful! Room " + roomNumber + " booked for " + customerName);
                return;
            }
        }
        System.out.println("Sorry, the selected room is not available.");
    }
    
    
    public static void viewBookings() {
        System.out.println("\n--- Booking Details ---");
        if (bookings.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            for (Booking booking : bookings) {
                System.out.println("Customer: " + booking.customerName + ", Room: " + booking.roomNumber + ", Type: " + booking.roomType + ", Total Price: $" + booking.totalPrice);
            }
        }
    }
}
