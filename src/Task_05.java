import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        System.out.println("Задание №5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        int i = scanner.nextInt();

        int mask = ~(1 << i); // создаем маску для сброса i-го бита
        N &= mask; // сбрасываем i-й бит

        System.out.println(Integer.toBinaryString(N)); // выводим результат в двоичном виде

    }
}
