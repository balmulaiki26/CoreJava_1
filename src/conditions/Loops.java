package conditions;

public class Loops {
    public static void main(String[] args) {

        for (int a = 0; a < 5; a++) {
            System.out.println(a+"Books");
        }
        for(int g=0;g<5;g++) {
            System.out.println("Selenium");
            for (int z = 0; z < 2; z++) {
                System.out.println("Java");
            }
        }
        int x = 0;
        while (x < 5) {
            // System.out.println("Java Books");
            x++;
        }
        int s = 0;
        do {
            System.out.println("I love Java");
            s++;

        }
        while(s<5);

    }

    }