/**
 * @author: Vinit Kumar
 * @Created on: 16/01/2022
 * Test User Registration
 */
package userregistrationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import userregistration.UserRegistration;
import userregistration.UserRegistrationException;

public class UserRegistrationTest {
    //variable declaration
    private static final UserRegistration user = new UserRegistration();

    /**
     * Test First Name
     * asserts Value
     */
    @Test
    public void isValidFirstName() {
        try {
            Assertions.assertTrue(user.isValidName("First"));
            Assertions.assertFalse(user.isValidName("Fi"));
            Assertions.assertFalse(user.isValidName("first"));
            Assertions.assertEquals("Invalid Input", user.isValidName(null));
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    /**
     * Test Last Name
     * asserts Value
     */
    @Test
    public void isValidLastName() {
        try {
            Assertions.assertTrue(user.isValidName("Last"));
            Assertions.assertFalse(user.isValidName("La"));
            Assertions.assertFalse(user.isValidName("last"));
            Assertions.assertEquals("Invalid Input", user.isValidName(""));
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    /**
     * Test Email
     * asserts Value
     */
    @Test
    public void isValidEmail() {
        try {
            Assertions.assertTrue(user.isValidEmail("abc@gmail.com"));
            Assertions.assertTrue(user.isValidEmail("abc+100@gmail.com"));
            Assertions.assertFalse(user.isValidEmail("abc..@gmail.com"));
            Assertions.assertFalse(user.isValidEmail("abc.10@gmail.com.co.cu"));
            Assertions.assertEquals("Invalid Input", user.isValidEmail(null));
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    /**
     * Test Phone Number
     * asserts Value
     */
    @Test
    public void isValidPhoneNumber() {
        try {
            Assertions.assertTrue(user.isValidPhoneNumber("91 1234567890"));
            Assertions.assertFalse(user.isValidPhoneNumber("911234567890"));
            Assertions.assertFalse(user.isValidPhoneNumber("9 1234567890"));
            Assertions.assertFalse(user.isValidPhoneNumber(" 1234567890"));
            Assertions.assertEquals("Invalid Input", user.isValidPhoneNumber(""));
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    /**
     * Test Password
     * asserts Value
     */
    @Test
    public void isValidPassword() {
        try {
            Assertions.assertTrue(user.isValidPassword("abcA@123"));
            Assertions.assertTrue(user.isValidPassword("@Aabc1234"));
            Assertions.assertFalse(user.isValidPassword("abc@123"));
            Assertions.assertFalse(user.isValidPassword("abc@@123A"));
            Assertions.assertFalse(user.isValidPassword("Abc@abcui"));
            Assertions.assertEquals("Invalid Input", user.isValidPassword(null));
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }
}