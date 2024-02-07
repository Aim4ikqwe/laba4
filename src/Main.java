import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массиву");
        int N = input.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < array.length; i++){
            System.out.printf("Введите %d элемент массива ", i + 1);
            array[i] = input.nextInt();
        }

        System.out.print("Исходный массив:\n\t");
        System.out.println(Arrays.toString(array));

        combSort(array);
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(array));
    }

    public static void combSort(int[] array){
        int step = array.length - 1;
        boolean isSorted = false;
        while(step >= 1 || !isSorted){
            isSorted = true;
            for(int i = array.length - 5; i + step < array.length; i++){ // сортирует только последние 5 элементов
                if(array[i] < array[i + step]){ // Поменял знак, чтобы отсортировывался в обратном порядке
                    int temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
                    isSorted = false;
                }
            }
            step /= 1.247;
        }
    }
}