package FibonachiNum;

import java.util.Scanner;

public class FibonacciSquareNumbers {
    public static void main(String[] args) {
        // Отримуємо inNum з командного рядка або з клавіатури
        int inNum;
        if (args.length > 0) {
            inNum = Integer.parseInt(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть номер числа: ");
            inNum = scanner.nextInt();
            scanner.close();
        }

        // Створюємо масив об'єктів FibonacciNumber для зберігання чисел Фібоначчі
        FibonacciNumber[] fibonacciNumbers = new FibonacciNumber[inNum];

        // Обчислюємо числа Фібоначчі та зберігаємо їх у масиві
        fibonacciNumbers[0] = new FibonacciNumber(1, 1);
        fibonacciNumbers[1] = new FibonacciNumber(2, 1);
        for (int i = 2; i < inNum; i++) {
            long value = fibonacciNumbers[i - 1].getValue() + fibonacciNumbers[i - 2].getValue();
            fibonacciNumbers[i] = new FibonacciNumber(i + 1, value);
        }

        // Виводимо інформацію про числа Фібоначчі та чи вони є квадратами
        for (FibonacciNumber num : fibonacciNumbers) {
            System.out.printf("Число Фібоначчі #%d: %d", num.getNumber(), num.getValue());
            if (num.isSquare()) {
                System.out.println(" - є квадратом.");
            } else {
                System.out.println(" - не є квадратом.");
            }
        }
    }
}
