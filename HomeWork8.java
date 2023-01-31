import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
      int[] a = UserInputUtils.userInput();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задачи: " +
                "\n 1. Среднее арифметическое значение. " +
                "\n 2. Массив наоборот." +
                "\n 3. Искомое значение. " +
                "\n 4. Подмассив." +
                "\n 5. Задача со страницами." +
                "\n 6. Високосность года.\n");
        int input1 = scanner.nextInt();
        switch (input1) {
            case (1) : ArrayUtils.array(a);
                break;
            case (2) : ArrayUtils.revers(a);
                break;
            case (3) :   System.out.println(ArrayUtils.indexOf(a, 123));
                break;
            case (4) : ArrayUtils.sub(a, 0,2);
                break;
            case (5) : ArrayUtils.numberPage(a, 2);
                break;
            case (6) :
                System.out.println("Введите год;  \n");
                int input = scanner.nextInt();
                DateTimeUtils.dateTime(DateTimeUtils.dateTime(input));
            break;
            default : break;
        }
    }
}
