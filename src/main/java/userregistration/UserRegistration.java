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
    public Boolean isValidName(String name) {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public Boolean isValidEmail(String email) {
        String regex ="^[a-zA-Z0-9_+-]+([.][a-zA-Z0-9]+)*@[0-9a-zA-Z]+[.][a-zA-Z]{2,}+([.][a-zA-Z]{2,})?$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        return m.matches();
    }
    public boolean isValidPhoneNumber(String number) {
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(number);
        return m.matches();
    }

}
