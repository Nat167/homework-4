import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Задание №11");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int count = 0; // создаем переменную для подсчета количества единичных битов
        while (N!= 0) { // проверяем, не равно ли число нулю
            if ((N & 1) == 1) { // проверяем, является ли текущий бит единицей
                count++; // увеличиваем счетчик единичных битов
            }
            N >>= 1; // сдвигаем число на один бит вправо
        }

        System.out.println("Количество единичных битов: " + count); // выводим количество единичных битов на консоль
        System.out.println("Исходное число в двоичном виде: " + Integer.toBinaryString(N)); // выводим исходное число в двоичном виде на консоль
    }

}

