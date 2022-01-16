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
                valid = user.isValidName(input.getString()); // takes input and validates name
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

    public static void main(String[] args) {
        welcome();
        while (true) {
            System.out.println("1 : to validate First Name ");
            System.out.println("Other number to quit.");

            switch (input.getInt()) {
                case 1:
                    isValid("First Name");
                    break;
                default:
                    exit(0);
            }
        }
    }
}
