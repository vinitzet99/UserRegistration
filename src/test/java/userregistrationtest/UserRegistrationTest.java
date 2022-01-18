/**
 * @author: Vinit Kumar
 * @Created on: 16/01/2022
 * Test User Registration
 */
package userregistrationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import userregistration.UserRegistration;

public class UserRegistrationTest {
    //variable declaration
    private static final UserRegistration user = new UserRegistration();

    /**
     *Test First Name
     *asserts Value
     */
    @Test
    public void isValidFirstName() {
        Assertions.assertTrue(user.isValidName("First"));
        Assertions.assertFalse(user.isValidName("Fi"));
        Assertions.assertFalse(user.isValidName("first"));
    }

    /**
     *Test Last Name
     *asserts Value
     */
    @Test
    public void isValidLastName() {
        Assertions.assertTrue(user.isValidName("Last"));
        Assertions.assertFalse(user.isValidName("La"));
        Assertions.assertFalse(user.isValidName("last"));
    }

    /**
     *Test Email
     *asserts Value
     */
    @Test
    public void isValidEmail() {
        Assertions.assertTrue(user.isValidEmail("abc@gmail.com"));
        Assertions.assertTrue(user.isValidEmail("abc+100@gmail.com"));
        Assertions.assertFalse(user.isValidName("abc..@gmail.com"));
        Assertions.assertFalse(user.isValidName("abc.10@gmail.com.co.cu"));
    }

    /**
     *Test Phone Number
     *asserts Value
     */
    @Test
    public void isValidPhoneNumber() {
        Assertions.assertTrue(user.isValidPhoneNumber("91 1234567890"));
        Assertions.assertFalse(user.isValidPhoneNumber("911234567890"));
        Assertions.assertFalse(user.isValidPhoneNumber("9 1234567890"));
        Assertions.assertFalse(user.isValidPhoneNumber(" 1234567890"));
    }

    /**
     *Test Password
     *asserts Value
     */
    @Test
    public void isValidPassword() {
        Assertions.assertTrue(user.isValidPassword("abcA@123"));
        Assertions.assertTrue(user.isValidPassword("@Aabc1234"));
        Assertions.assertFalse(user.isValidPassword("abc@123"));
        Assertions.assertFalse(user.isValidPassword("abc@@123A"));
        Assertions.assertFalse(user.isValidPassword("Abc@abcui"));

    }
}