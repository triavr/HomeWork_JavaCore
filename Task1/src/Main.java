/*Создать двумерный массив  из случайных
 целых чисел. Вывести массив на экран. После на отдельной
 строке вывести на экран значение максимального  и минимальногои элемента этого массива
 */
public class Main {
    public static void main(String[] args) {
        int[][] m = new int[8][7];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j <m[i].length ; j++) {
                m[i][j] = (int) ((Math.random() *200));
            }
        }

        for (int i = 0; i < m.length; i++) {
            System.out.println();
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");

            }

        }
        System.out.println();
        int counter = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (counter < m[i][j]) {
                    counter = m[i][j];
                }

            }

        }
        System.out.println();
        int min = counter;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (min > m[i][j]) {
                    min = m[i][j];
                }

            }

        }

        int max = m[0][0];
        int min2 = m[0][0];
        int avg = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (max < m[i][j])
                    max = m[i][j];
                if (min2 > m[i][j])
                    min2 = m[i][j];
                avg = avg + m[i][j] / 56;
            }
        }





        System.out.println("Max значение элемента массива = " +counter);
        System.out.println("Min значение элемента массива = " +min);
        System.out.println("Среднее = " + avg);
    }

}