import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 123, 323, 43, 44};
        System.out.println("Среднее арифметическое значение.- " + averageValue(array) + "\n");
        System.out.println("Массив наоборот - " + Arrays.toString(expandedArray(array)) + "\n");
        System.out.println("Искомое значение. - " + indexOf(array, 123) + "\n");
        System.out.println("Подмассив - " + Arrays.toString(subarray(array, 0, 4)) + "\n");
        System.out.println(numberPage(array, 2));

    }

    public static double averageValue(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("There is no value in 0 array");
        }
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;

    }

    public static int[] expandedArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }

        return array;
    }

    public static int indexOf(int[] array, int value) {

        for (int i = 0; i < array.length; ++i) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    public static int[] subarray(int[] array, int index1, int index2) {
        if (index1 < 0 || index2 > array.length || index1 > index2) {
            throw new IllegalArgumentException("Invalid array bounds");
        }
            int[] arrays = new int[index2 - index1 + 1];
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = array[index1 + i];
            }
            return arrays;
        }

        public static int numberPage ( int[] array, int page){
            if (page == 1) {
                System.out.println("Страница № 1:  ");
                subarray(array, 0, 2);

            } else if (page == 2) {
                System.out.println("Страница № 2:  ");
                subarray(array, 3, 5);
            } else {
                System.out.println("Страница № 3:  ");

                for (int i = 6; i <= array.length; i++) {
                    subarray(array, 6, i - 1);
                }
            }
            return page;
        }

    }
