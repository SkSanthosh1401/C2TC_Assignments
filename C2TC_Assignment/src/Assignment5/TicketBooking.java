package Assignment5;

public class TicketBooking {

	private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default Constructor
    public TicketBooking() {}

    // Parameterized Constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Payment Method 1 - Cash
    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid in cash\n", amount);
    }

    // Payment Method 2 - Wallet
    public void makePayment(double amount, String walletNumber) {
        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
    }

    // Payment Method 3 - Credit Card
    public void makePayment(String holderName, double amount, String creditCardType, String ccv) {
        System.out.println("Holder name:" + holderName);
        System.out.printf("Amount %.1f paid using %s card\n", amount, creditCardType);
        System.out.println("CCV:" + ccv);
    }
}