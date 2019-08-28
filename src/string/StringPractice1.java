package string;


public class StringPractice1 {

    public static void main(String[] args) {
        String a = "People";
        String b ="and";
        String c="tech";

        System.out.println(a+b+c);


        String x ="Rock";
        String y="star";

        String z = x.concat(y);
        System.out.println(z);

        //StringBuilder

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rock");
        stringBuilder.append("star");
        System.out.println(stringBuilder);


        String numbers ="";
        for(int i=0;i<5;i++) {
            numbers=numbers+=i;

        }
        System.out.println(numbers);
    }
}
