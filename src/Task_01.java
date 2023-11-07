public class Task_01 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int N = 3; // исходное число
        int mask = ~(1); // маска для обнуления бита в нулевом разряде
        int result = N & mask; // обнуление бита в нулевом разряде
        System.out.println(Integer.toBinaryString(result)); // вывод результата в двоичном виде

    }
}
