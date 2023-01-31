import java.util.Arrays;
import java.util.Scanner;

public class UserInputUtils {
    public static void main(String[] args) {
        userInput();

    }

    public static int[] userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int input = scanner.nextInt();
        int[] a =  new int[input];
        System.out.println("Заполните его числами: ");
        for (int i = 0; i < input; i++) {
            a[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println(Arrays.toString(a));
        return  a;
    }
}
