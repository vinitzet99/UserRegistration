/**
 * @author: Vinit Kumar
 * @Created on: 16/01/2022
 * Regex to validate User Details
 */
package userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {

    /**
     * All methods return true or false if Regex matches
     * takes parameter to match
     * matches with regex expression
     * returns true or false
     */

    /**
     * checks if Start name is Caps and is at least of 3 length
     * @param name
     * @return
     */
    public Boolean isValidName(String name) {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        return m.matches();
    }

    /**
     * check email is form of abc.xyz@bl.co.in
     * abc,bl,co is mandatory
     * xyz,in is not mandatory
     * @param email
     * @return
     */
    public Boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+-]+([.][a-zA-Z0-9]+)*@[0-9a-zA-Z]+[.][a-zA-Z]{2,}+([.][a-zA-Z]{2,})?$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * check if there is 2 digit country code
     * then checks space
     * then checks 10 digits number
     * @param number
     * @return
     */
    public boolean isValidPhoneNumber(String number) {
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(number);
        return m.matches();
    }

    /**
     * Validate Password
     * Password of length 8
     * should have at least 1 CAPS
     * should have at least 1 NUMBER
     * @param password
     * @return
     */
    public boolean isValidPassword(String password) {
        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[0-9a-zA-Z@#$%_!^&*]{8,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
