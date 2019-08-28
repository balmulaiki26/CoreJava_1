package string;


public class StringCompare {
    public static void main(String[] args) {
        String value = "peoplentech";
        String value2 = "people";
        String value3= "PEOPLE";
        System.out.println(value.compareTo(value2));
        //Ignorecase used to ignore the lower/upper case
        System.out.println(value.compareToIgnoreCase(value3));

        //end with
        System.out.println(value.startsWith("h"));
        System.out.println(value.endsWith("d"));

        //replace
        System.out.println(value.replace('n','&'));
        System.out.println(value.replace('e', 'E'));

        //to upper-lower case
        System.out.println(value.toUpperCase());


    }
}
