import java.security.SecureRandom;

public class Main {
    private static void Example1() {
        int array[] = new int[10];
        int sum = 0;

        SecureRandom random = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
            sum += array[i];

        }
        if (sum >= 50) {
            System.out.println("Прошел ");
        } else {
            System.out.println("Не прошел");
        }
    }

    private static void Example2() {
        int array[] = new int[18];
        SecureRandom securerandom = new SecureRandom();

        for (int i = 0; i < array.length; i++) {
            array[i] = securerandom.nextInt(10) + 1;
        }

        int firstSum = 0;
        int secondSum = 0;
        int thirdSum = 0;

        for (int i = 0; i < 6; i++) {
            firstSum += array[i];
        }
        for (int i = 6; i < 12; i++) {
            secondSum += array[i];
        }
        for (int i = 12; i < 18; i++) {
            thirdSum += array[i];
        }

        if (firstSum > secondSum && firstSum > thirdSum) {
            System.out.println("Больше всего баллов по обязательной программе " + firstSum);

        } else if (secondSum > firstSum && secondSum > thirdSum) {
            System.out.println("Больше всего баллов по дополнительной программе " + secondSum);

        } else {
            System.out.println("Больше всего баллов по произвольной программе " + thirdSum);
        }
    }

    private static void Example3() {
        int array[] = new int[20];
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < array.length; i++) {
            array[i] = secureRandom.nextInt(11) - 5;
            System.out.print(array[i] + " ");
        }

        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                count++;
            } else {
                if (count >= maxcount) {
                    maxcount = count;
                }
                count = 0;
            }
        }
        System.out.println("\n" + maxcount);
    }

    private static void Example4() {
        int array[] = new int[10];
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < array.length; i++) {
            array[i] = secureRandom.nextInt(10);
            System.out.print(array[i] + " ");
        }

        int minValue = array[0];
        int minIndex = 0;
        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
                minIndex = i;
            }
            if (array[i] >= maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        array[minIndex] = 0;
        array[maxIndex] = 0;

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        //Example1();
        //Example2();
        //Example3();
        //Example4();
    }
}
