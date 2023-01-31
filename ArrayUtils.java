import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] a =new  int []{ 1, 2, 3, 123 , 323, 43, 44};
        array(a);
        System.out.println("\n");
        revers(a);
        System.out.println( "\n Искомое значение. ");
        System.out.println(indexOf(a, 123));
        System.out.println("\n Подмассив.");
        sub(a , 0, 4);
        System.out.println();
        numberPage(a, 2);

    }
    public static int[] array (int[] mas){

        double sum = 0;
        for (int i : mas) {
            sum += i;
        }
        System.out.print("Среднее арифметическое значение. \n" +  sum/mas.length);
        return mas;
    }
    public static int[] revers (int[] mas){
        for (int i = 0; i < mas.length / 2; i++) {
            int tmp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = tmp;
        }
        System.out.println("Массив наоборот.");
        System.out.println(Arrays.toString(mas));
        return mas;
    }
    public static int indexOf(int[] mas, int value){

        for(int i = 0; i < mas.length; ++i){
            if(mas[i] == value)
                return i;
        }
        System.out.println(indexOf(mas, value));
        return -1;
    }

    public  static int[] sub(int[] mas, int index1, int index2){
        int[] subarray = new int[index2 - index1 + 1];
        for (int i = 0; i < subarray.length; i++) {
            subarray[i] = mas[index1 + i];
        }
        System.out.println(Arrays.toString(subarray));
        return  subarray;
    }

    public static int numberPage(int[] mas, int page){
       if (page == 1){
           System.out.println("Страница № 1:  ");
           sub(mas, 0,2);

       }
       else if (page == 2){
           System.out.println("Страница № 2:  ");
           sub(mas, 3, 5);
       }
       else  {
           System.out.println("Страница № 3:  ");

           for (int i = 6; i <=  mas.length; i++){
               sub(mas, 6, i - 1);
           }
       }
       return page;
    }

}
