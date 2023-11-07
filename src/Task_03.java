import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Задание №3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        int i = scanner.nextInt();

        int mask = 1 << i; // создаем маску для установки i-го бита
        N |= mask; // устанавливаем i-й бит в 1

        System.out.println(Integer.toBinaryString(N));

    }
}
