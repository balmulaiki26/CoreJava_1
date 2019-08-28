package dataStructures.array;
import java.util.Random;
import java.util.ArrayList;
public class RandomNumbers {

    public static void main(String[] args) {

        int [] studentId = new int[5];
        studentId[0]=10;
        studentId[1]=132;

        Random random = new Random();
        for(int i=0;i<5;i++) {
            int newValue = random.nextInt(100);
            studentId[i] = newValue;
        }
        System.out.println(studentId.length);
        for(int i=0;i<studentId.length;i++) {
            System.out.println(studentId[i]);
        }
    }
}
