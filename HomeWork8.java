import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        int[] arrayFilling = UserInputUtils.userInput();
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Введите номер задачи:\s
                 1. Среднее арифметическое значение.\s
                 2. Массив наоборот.
                 3. Искомое значение.\s
                 4. Подмассив.
                 5. Задача со страницами.
                 6. Високосность года.
                """);
        int input1 = scanner.nextInt();
        switch (input1) {
            case (1) ->
                    System.out.println("Среднее арифметическое значение.- " + ArrayUtils.averageValue(arrayFilling));
            case (2) ->
                    System.out.println("Массив наоборот - " + Arrays.toString(ArrayUtils.expandedArray(arrayFilling)));
            case (3) -> System.out.println("Искомое значение. - " + ArrayUtils.indexOf(arrayFilling, 123));
            case (4) -> System.out.println("Подмассив - " + Arrays.toString(ArrayUtils.subarray(arrayFilling, 0, 2)));
            case (5) -> ArrayUtils.numberPage(arrayFilling, 2);
            case (6) -> {
                System.out.println("Введите год;  \n");
                int input = scanner.nextInt();
                System.out.println("Этот " + input + " високосный? " + DateTimeUtils.isLeapYear(input));
            }
            default -> System.out.println("Ошибка!!!!");
        }
    }
}
