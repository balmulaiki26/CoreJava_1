package assertion;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int value = calculator.addition(10, 22);
        Assert.assertEquals(value,32,"Calculator Assertion Failed");


        int value2 = calculator.addition(6,3);
        int value3 = calculator.addition(2,2);
        int value4=calculator.addition(1,5);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(value2,9,"1st Custom message assertion failed");
        softAssert.assertEquals(value3,4,"2nd Custom message assertion failed");
        softAssert.assertEquals(value3,4,"3rd Custom message assertion failed");
        softAssert.assertAll();



    }
}
