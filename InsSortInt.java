import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class InsSortInt {
    public static void main(String[] args) {
        int[] numsArray = new int[1000];
        
        try (Scanner scan = new Scanner(new File("randInts.txt"))) {
            for (int i = 0; i < numsArray.length; i++) {
                numsArray[i] = scan.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        sort(numsArray);
        System.out.println(numsArray[0] + ":" + numsArray[999]);
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}
