/**
 * @author: Vinit Kumar
 * @Created on: 16/01/2022
 * User Registration
 */
package userregistration;

import static java.lang.System.exit;

public class UserRegistrationMain {
    //instance variable
    public static final UtilityClass input = new UtilityClass();
    public static final UserRegistration user = new UserRegistration();

    /**
     * checks if details is Valid
     * based on option selected in menu displays field to enter
     * calls relative method to check if details are valid
     * Displays if value is valid
     *
     * @param check
     */
    public static void isValid(String check) {
        System.out.println("Enter " + check + ": "); //Displays field to input
        boolean valid = false; // variable
        switch (check) {    //calls function to validate
            case ("First Name"):
            case ("Last Name"):
                valid = user.isValidName(input.getString()); // takes input and validates name
                break;
            case ("Email"):
                valid = user.isValidEmail(input.getString()); // takes input and validates email
                break;
        }
        if (valid == true) {
            System.out.println("Valid " + check); // Displays valid message
        } else
            System.out.println("Invalid " + check); // Displays invalid message
    }

    //welcome message
    public static void welcome() {
        System.out.println("Welcome to User Registration System Problem");
    }

    /**
     * Displays welcome message and menu
     * Based on user input, calls valid method with field to check till quit
     */
    public static void main(String[] args) {
        welcome();
        while (true) {
            System.out.println("1 : to validate First Name ");
            System.out.println("2 : to validate Last Name ");
            System.out.println("3 : to validate Email ");
            System.out.println("Other number to quit.");

            switch (input.getInt()) {
                case 1:
                    isValid("First Name");
                    break;
                case 2:
                    isValid("Last Name");
                    break;
                case 3:
                    isValid("Email");
                    break;
                default:
                    exit(0);
            }
        }
    }
}
