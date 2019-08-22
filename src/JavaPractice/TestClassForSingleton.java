package JavaPractice;

public class TestClassForSingleton {

    String x;


  private static TestClassForSingleton getTestClassForSingleton=null;
    private  TestClassForSingleton() {
        x = " this is a singleton class";
    }
    public static TestClassForSingleton getInstance(){
        if(getTestClassForSingleton==null) {
            getTestClassForSingleton= new TestClassForSingleton();
        }
        return getTestClassForSingleton;
    }


}
