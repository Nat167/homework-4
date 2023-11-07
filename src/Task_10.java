import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Задание №10");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число M: ");
        int M = scanner.nextInt();
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int min = M & N; // создаем маску для поиска минимального числа
        while ((min & 1) == 0) { // проверяем, является ли минимальное число нулевым битом
            min >>= 1; // сдвигаем минимальное число на один бит вправо
        }
        System.out.println("Минимальное число: " + min); // выводим минимальное число на консоль

    }
}
