/**
 * @author: Vinit Kumar
 * @Created on: 16/01/2022
 * Test User Registration with parameterized
 */
package userregistrationtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import userregistration.UserRegistration;

import static org.junit.Assert.assertEquals;

//declare Parameterized class
@RunWith(Parameterized.class)
public class UserRegistrationTestParameterized {
    //instance variable
    private String email;
    private Boolean expectedResult;
    private UserRegistration userRegistration;

    /**
     * Parameterized Parameters
     * returns Collections
     * Each Array item has input and expected value
     * @return
     */
    @Parameterized.Parameters
    public static Collection emails() {
        return Arrays.asList(new Object[][]{
                        {"abc@yahoo.com", true},
                        {"abc-100@yahoo.com", true},
                        {"abc.100@yahoo.com", true},
                        {"abc111@abc.com", true},
                        {"abc-100@abc.net", true},
                        {"abc.100@abc.com.au", true},
                        {"abc@1.com", true},
                        {"abc@gmail.com.com", true},
                        {"abc+100@gmail.com", true},
                        {"abc", false},
                        {"abc@.com.my", false},
                        {"abc123@gmail.a", false},
                        {"abc123@.com", false},
                        {"abc123@.com.com", false},
                        {".abc@abc.com", false},
                        {"abc()*@gmail.com", false},
                        {"abc@%*.com", false},
                        {"abc..2002@gmail.com", false},
                        {"abc.@gmail.com", false},
                        {"abc@abc@gmail.com", false},
                        {"abc@gmail.com.1a", false},
                        {"abc@gmail.com.aa.au", false},
                }
        );
    }

    /**
     * Initialize to be tested Class
     */
    @Before
    public void initialize() {
        userRegistration = new UserRegistration(); // object
}

    /**
     * constructor
     * @param email
     * @param expectedResult
     */
    public UserRegistrationTestParameterized(String email, Boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    /**
     * test emails
     * calls isValidMail
     * asserts expected value
     */
    @Test
    public void testEmail() {
        System.out.println("Email is: " + email + " "+expectedResult);
        assertEquals(expectedResult, userRegistration.isValidEmail(email));
    }
}
