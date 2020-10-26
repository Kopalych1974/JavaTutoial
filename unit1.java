// Задача 1. Сумматор
// Описание
// Напишите программу для подсчета суммы 3х целых чисел.

// Функционал программы
// Ввод первого числа;
// Ввод второго числа;
// Ввод третьего числа;
// Вывести на экран сумму этих чисел.
// Пример
// Программа расчета суммы трех чисел
// Введите первое число:
// 10 <enter>
// Введите второе число:
// 15 <enter>
// Введите третье число:
// 20 <enter>
// Сумма чисел = 45
package Simple;
import java.util.Scanner;

public class unit1 {

    static int sum(int value1, int value2, int value3) {
        return value1 * value2 + value3;
    }

    public static float delenie(int value1, int value2, int value3) {
        if (value2 != 0 && value3 != 0)
            return (value1 / value2 / value3);
        else
            return 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int value1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int value2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int value3 = scanner.nextInt();

        // Добавьте код для чтения еще 2х значений из консоли
        int result  = sum(value1,value2,value3);
        System.out.println("Сумма чисел = " + result);
        System.out.println("Деление чисел равно: " + delenie(value1, value2, value3));
        System.out.println("All Done....");

    }

}