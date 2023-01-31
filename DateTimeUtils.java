import java.util.Scanner;

public class DateTimeUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:  ");
        int  year = scanner.nextInt();
        dateTime(year);

    }
    public  static int dateTime(int year){
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println(" Год  '"  + year + "' высокосный.");
        else
            System.out.println(" Год  '"  + year + "' не высокосный.");
        return  year;
     }

    }
