package Assignment5;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        String[] details = sc.nextLine().split(",");
        String stageEvent = details[0];
        String customer = details[1];
        int noOfSeats = Integer.parseInt(details[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        int choice = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        // Output booking details
        System.out.println("Stage event:" + booking.getStageEvent());
        System.out.println("Customer:" + booking.getCustomer());
        System.out.println("Number of seats:" + booking.getNoOfSeats());

        switch (choice) {
            case 1:
                double amount1 = sc.nextDouble();
                booking.makePayment(amount1);
                break;

            case 2:
                double amount2 = sc.nextDouble();
                sc.nextLine(); // consume newline
                String wallet = sc.nextLine();
                booking.makePayment(amount2, wallet);
                break;

            case 3:
                String holderName = sc.nextLine();
                double amount3 = sc.nextDouble();
                sc.nextLine(); // consume newline
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, amount3, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
	}

}