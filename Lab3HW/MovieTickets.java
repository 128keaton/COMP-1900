import java.util.Scanner;

// Calculates ticket cost for a group of people attending a movie theater based off age and showing time,

public class MovieTickets{
    final static double REG_TICKET_PRICE_MATINEE = 8.00;
    final static double REG_TICKET_PRICE_EVENING = 10.50;
    final static double CHI_TICKET_PRICE_MATINEE = 0.00;
    final static double CHI_TICKET_PRICE_EVENING = 4.00;
    final static double SEN_TICKET_PRICE_MATINEE = 6.50;
    final static double SEN_TICKET_PRICE_EVENING = 8.00;

    final static int CHILD_TYPE = 0;
    final static int REGULAR_TYPE = 1;
    final static int SENIOR_TYPE = 2;

    final static int EVENING_SHOWING_TIME = 1700;
    final static int FIRST_SHOWING_TIME = 1130;
    final static int FINAL_SHOWING_TIME = 0;
    final static int INVALID = -1;

    static Scanner scnr = new Scanner(System.in);
    static int timeShowing = 0;
    static String timeShowingString = "Matinee";

    static int numGuests = 0;

    static int numSeniors = 0;
    static int numChildren = 0;
    static int numRegular = 0;

    static double totalTicketCost = 0.00;

    public static void main(String[] args){
        System.out.println("Welcome to TheatreCo Movie Ticket Calculating System!");
        getShowingTime();
    }

    public static void getShowingTime(){
        System.out.print("What time is your showing: ");
        timeShowing = scnr.nextInt();
        if (timeShowing >= FIRST_SHOWING_TIME || timeShowing == FINAL_SHOWING_TIME){
            // If the showing time is valid then we can go ahead and add guests
            addGuestToParty();
        }else{
            System.out.println("There are no showings after midnight or before 11:30. Please re-enter your showtime.");
            // Call the same function if the showing time is invalid
            getShowingTime();
        }
    }

    // Adds a guest going to the theatre
    public static void addGuestToParty(){
        // We typically don't reference the first guest as 'Guest number 0'
        System.out.print("Please enter the age of party member " + (numGuests + 1) + " (enter a negative value to exit): ");
        int age = scnr.nextInt();

        if(age < 0){
            printFinalCosts();
        }else{
            numGuests++;
            determineAge(age);
        }
    }

    // Determines the age of a guest from a number
    public static void determineAge(int age){
        if (age <= 10){
                // Guest is child
            numChildren++;
        }else if ((age > 10) && (age < 65)){
                // Guest is regular
            numRegular++;
        }else{
                // Guest is Senior
            numSeniors++;
        }

        addGuestToParty();
    }

    // Outputs the final cost to the terminal window
    public static void printFinalCosts(){
        if (numGuests > 0){

            boolean isEveningShowing = isEveningShowing();

            System.out.println("Order Summary:");
            System.out.println("(" + timeShowingString + " rates)");

            
            double regularTicketCost = calcCostForGuest(isEveningShowing, REGULAR_TYPE);
            double regularTotalCost = (numRegular * regularTicketCost);
            totalTicketCost += regularTotalCost;

            System.out.println("Regular:     $" + regularTicketCost + "   x   " + numRegular + "   = $" + regularTotalCost);


            double childTicketCost = calcCostForGuest(isEveningShowing, CHILD_TYPE);
            double childTotalCost = (numChildren * childTicketCost);
            totalTicketCost += childTotalCost;

            System.out.println("Child:       $" + childTicketCost + "   x   " + numChildren + "    = $" + childTotalCost);



            double seniorTicketCost = calcCostForGuest(isEveningShowing, SENIOR_TYPE);
            double seniorTotalCost = (numSeniors * seniorTicketCost);
            totalTicketCost += seniorTotalCost;

            System.out.println("Senior:      $" + seniorTicketCost + "   x   " + numSeniors + "    = $" + seniorTotalCost);

            System.out.println("TOTAL:                         $" + totalTicketCost);

        }else{
            System.out.println("No guests added");
        }
    }

    // Boolean which is determined if its an evening showing
    public static Boolean isEveningShowing(){
        if (timeShowing >= EVENING_SHOWING_TIME || timeShowing == FINAL_SHOWING_TIME){
            timeShowingString = "Evening";
            return true;
        }

        return false;
    }

    // Calculates ticket cost of guest depending on showing time AND guest type (child, senior, or regular)
    public static double calcCostForGuest(boolean isEveningShowing, int guestType){
        switch (guestType){
            case CHILD_TYPE:
            // Guest is a child guest
            if (isEveningShowing){
                // Movie is an evening showing before midnight
                return CHI_TICKET_PRICE_EVENING;
            }else{
                // Movie is a matinee showing
                return CHI_TICKET_PRICE_MATINEE;
            }

            case REGULAR_TYPE:
            // Guest is a regular guest
            if (isEveningShowing){
                // Movie is an evening showing before midnight
                return REG_TICKET_PRICE_EVENING;
            }else{
                // Movie is a matinee showing
                return REG_TICKET_PRICE_MATINEE;
            }

            case SENIOR_TYPE:
            // Guest is a senior
            if (isEveningShowing){
                // Movie is an evening showing before midnight
                return SEN_TICKET_PRICE_EVENING;
            }else{
                // Movie is a matinee showing
                return SEN_TICKET_PRICE_MATINEE;
            }

            default:
            // If nothing else returns then you've selected an invalid showing time
            return INVALID;
        }
    }


}