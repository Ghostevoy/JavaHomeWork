import java.util.ArrayList;
import java.util.Random;

/**
 * hw3
 */
public class hw3 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++)
            numList.add(new Random().nextInt(100));

        System.out.println(numList);

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 == 0) {
                numList.remove(i--);
            }
        }

        System.out.println(numList);

        int min = numList.get(0);
        int max = numList.get(0);

        for (int i = 1; i < numList.size(); i++) {
            if (numList.get(i) < min)
                min = numList.get(i);
            if (numList.get(i) > max)
                max = numList.get(i);
        }

        System.out.println("минимальное значение = " + min);
        System.out.println("максимальное значение = " + max);

        int aver = 0;
        for (int i = 0; i < numList.size(); i++)
            aver += numList.get(i);

        System.out.println("среднее значение = " + aver / numList.size());
    }

}