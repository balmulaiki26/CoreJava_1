package JavaPractice;

public class ExceptionHandling {
    public static void main(String[] args) {
//Array --[] index starts from 0
        String[] name = {"Mr X", "Mr Y", "Mr Z", "Mr A"};

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
//try -- keyword (-- try block starts
// body of the try blocks
// } -- try block ends catch -- keyword( exceptions name which we are trying to catch e --
// body of the catch block
//}-- catch block ends
//finally-keyword--finally block always gets excuted
// mostly used fro DB connectivity closing
        //file reader closing
//if
        try {
            System.out.println(name[5]);
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("caught the exception");
            ex.printStackTrace();
        }
        finally {


        }

    }

}

