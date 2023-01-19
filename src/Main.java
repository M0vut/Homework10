import java.util.random.RandomGenerator;
public class Main {
    public static void main(String[] args) {
        // дз1
        System.out.println("Домашнее задание 1");
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int count = 0;
        int j;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            count = count + arr[i];

        }
        System.out.println("Сумма трат за месяц составила " + count + " рублей");
        //дз2
        System.out.println("Домашнее задание 2");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила" + min + " рублей. Максимальная сумма трат за день составила" + max + " рублей");
        //дз3
        System.out.println("Домашнее задание 3");
        double averageNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            j = i + 1;

            double sum = count;

            averageNumber = sum / j;
        }

        System.out.println("Средняя сумма трат за месяц составила" + Math.round(averageNumber) + " рублей");
        //дз 4
        System.out.println("Домашнее задание 4 ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}



