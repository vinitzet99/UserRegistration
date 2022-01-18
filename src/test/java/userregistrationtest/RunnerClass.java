/**
 * @author: Vinit Kumar
 * @Created on: 16/01/2022
 * Run Parameterized class
 */
package userregistrationtest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass{
    //main method
    public static void main(String[] args){
        Result result= JUnitCore.runClasses(UserRegistrationTestParameterized.class); //runs class return object
        for (Failure failure : result.getFailures()) { // iterate failure
            System.out.println(failure.toString()); // print Failure
        }
        System.out.println(result.wasSuccessful()); //returns all test case passed
    }
}
