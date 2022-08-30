public class Main {
    public static void main(String[] args) {

        int[] mass = { 5, 6, 3, 2, 5, 1, 4, 9 };
        int n = mass.length;

        Sort(mass, 0, n - 1);

        for (int i = 0; i < n; i++)
            System.out.print(mass[i] + " ");
    }

    // алгоритм сортировки
    public static void Sort(int[] mass, int low, int high) {
        for (int h = low; h <= high; h++)
            change(mass, h, Smallest(mass, h, high));
    }

    public static int Smallest(int[] mass, int low, int high) {
        int small = low;
        for (int i = low + 1; i <= high; i++)
            if (mass[i] < mass[small])
                small = i;
        return small;
    }
    public static void change(int[] mass, int i, int j) {
        int temp = mass[i];
        mass[i] = mass[j];
        mass[j] = temp;
    }

}


