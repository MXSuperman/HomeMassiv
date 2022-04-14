package MXN;
// import java.util.Arrays;

//public class Main {
        // Не работет Этот код

        // First exercise
        //  int[] arr = generateRandomArray();
        //     public static int[] generateRandomArray() {
        //         java.util.Random random = new java.util.Random();
        //      int[] arr = new int[30];
        //      for (int i = 0; i < arr.length; i++) {
        //      arr[i] = random.nextInt(100_000) + 100_000;
        //      }
        //      return arr;
        //     }

        public class Main {
            public static void main(String[] args) {

                //Первое Задание

                int[] money = new int[30];
                int number = 0;
                for (int i = 0; i < money.length; i++) {
                    money[i] = (int) Math.round((Math.random() * 100_000) + 100_000);
                    number = number + money[i];
                    {
                    }
                    // System.out.println("Сумма: " + number);
                }

                int[] costs = new int[30];
                int sum = 0;
                for (int index = 0; index < costs.length; index++) {
                    sum += money[index];
                }
                System.out.println("Сумма трат за месяц составила  " + sum + " рублеиӣ");

                // Second exercise

                int mахPrice = 100_000;
                for (int i = 0; i < money.length; i++) {
                    if (money[i] > mахPrice) {
                        mахPrice = money[i];
                    }
                }
                System.out.println("Максимальная сумма трат за день составила " + mахPrice + " рублеӣ");

                int minPrice = 6_000_000;
                for (int i = 0; i < money.length; i++) {
                    if (money[i] < minPrice) {
                        minPrice = money[i];
                    }
                }
                System.out.println("Минимальная сумма трат за день составила " + minPrice + " рублеӣ");


                // Задание 3

                int oneMonth = 30;
                int[] total = new int[30];
                float summa = 0f;
                for (int index = 0; index < total.length; index++) {
                    summa += money[index];
                }
                System.out.println("Средняя сумма трат за месяц составила " + summa / oneMonth + " рублеӣ");


                // Задание 4

                char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int i = reverseFullName.length -1 ; i >= 0 ; i--) {
                    System.out.print(reverseFullName[i] + " ");
                }
            }
        }

