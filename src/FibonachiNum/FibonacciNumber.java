package FibonachiNum;

class FibonacciNumber {
    private int number;
    private long value;

    // Конструктор класу
    public FibonacciNumber(int number, long value) {
        this.number = number;
        this.value = value;
    }

    // Метод для перевірки, чи є число квадратом
    public boolean isSquare() {
        double sqrtValue = Math.sqrt(value);
        return sqrtValue == Math.floor(sqrtValue);
    }

    // Геттер для отримання номера числа Фібоначчі
    public int getNumber() {
        return number;
    }

    // Геттер для отримання значення числа Фібоначчі
    public long getValue() {
        return value;
    }
}

