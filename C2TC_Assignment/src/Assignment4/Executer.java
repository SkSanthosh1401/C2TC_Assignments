package Assignment4;

public class Executer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();

        Airfare airline;

        switch (choice) {
            case 1:
                airline = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airline = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airline = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        airline.display(); // Prints total amount with 2 decimal places
        sc.close();
	}

}