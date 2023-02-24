import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr3 = new int[3];
        double[] arrDouble = {1.57, 7.654, 9.986};
        int [] arrAny = new int[537290];
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int [] arr3 = new int[3];
        arr3 [0] = 1;
        arr3 [1] = 2;
        arr3 [2] = 3;

        double [] arrDouble = {1.57, 7.654, 9.986};
        int [] arrAny = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arrDouble));
        System.out.println(Arrays.toString(arrAny));
        // Ничего не знаю, в задании не сказано нельзя в квадратных скобках, сказано через запятую! А что в третьем задании, то в третьем задании.
    }


    public static void task3 () {
        System.out.println("Задача 3");
        int [] arr3 = new int[3];
        arr3 [0] = 1;
        arr3 [1] = 2;
        arr3 [2] = 3;
        String separator = "";
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.printf(separator + arr3[i]);
            separator = ",";
        }
        System.out.println(" ");


        String comma = "";
        double [] arrDouble = {1.57, 7.654, 9.986};
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            System.out.printf(comma + arrDouble[i]);
            comma = ",";
        }
        System.out.println(" ");


        int [] arrAny = {1, 2, 3, 4, 5, 6, 7, 8};
        String commaSep = "";
        for (int i = arrAny.length - 1; i >= 0; i--) {
            System.out.printf(commaSep + arrAny[i]);
            commaSep = ",";
        }
        System.out.println(" ");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int [] arr3 = new int[3];
        arr3 [0] = 1;
        arr3 [1] = 2;
        arr3 [2] = 3;
        for (int i = arr3.length-1; i >= 0; i--){
            if (arr3[i] % 2 != 0){
                arr3[i]++;
            }
        }
        System.out.println(Arrays.toString(arr3));

    }
}
