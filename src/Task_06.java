import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        System.out.println("Задание №6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        int i = scanner.nextInt();

        int mask = (1 << i) - 1; // создаем маску для обнуления всех битов, кроме i-го
        N &= mask; // обнуляем все биты, кроме i-го

        System.out.println(Integer.toBinaryString(N)); // выводим результат в двоичном виде

    }
}
