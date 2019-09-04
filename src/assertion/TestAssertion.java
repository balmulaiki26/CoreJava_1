package assertion;


import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestAssertion {

    public static void main(String[] args) {
        int x=10;
        int z=12;
        int a= 11;
        int b=12;

//Hard Assert
        //(ActualValue, expectedValue)
        Assert.assertEquals(a, b);
        Assert.fail();

        SoftAssert softAssert = new SoftAssert();
        System.out.println("test");
        softAssert.assertEquals(x,z,"1st Custom message assertion failed");
        softAssert.assertEquals(a,b,"2nd Custom message assertion failed");

       softAssert.assertAll();


        }
    }

