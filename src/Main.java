import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        //ЗАДАНИЕ 1
        System.out.println(max(5, 3));

        //ЗАДАНИЕ 2
        System.out.println(divide(11.08, 2));

        //ЗАДАНИЕ 3
        System.out.println(convert("20"));

        //ЗАДАНИЕ 4
        System.out.println(validateAge(50));

        //ЗАДАНИЕ 5
        System.out.println(sqrt(4));

        //ЗАДАНИЕ 6
        System.out.println(factorial(5));

        //ЗАДАНИЕ 7
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(checkForZero(array));

        // ЗАДАНИЕ 8
        System.out.println(power(2, 3));

        // ЗАДАНИЕ 9
        System.out.println(trim("Hello World", 5));

        // ЗАДАНИЕ 10
        int[] searchArray = {1, 2, 3, 4, 5};
        System.out.println(findElement(searchArray, 3));

        // ЗАДАНИЕ 11
        System.out.println(toBinary(10));

        // ЗАДАНИЕ 12
        System.out.println(isDivisible(10, 2));

        // ЗАДАНИЕ 13
        List<String> list = List.of("Семечки", "Тетрадка", "Диплом");
        System.out.println(getElement(list, 1));

        // ЗАДАНИЕ 14
        checkPassword("strongPass123)");

        // ЗАДАНИЕ 15
        validateDate("01.01.2024");

        // ЗАДАНИЕ 16
        System.out.println(concatenate("Hello", " World"));

        // ЗАДАНИЕ 17
        System.out.println(remainder(10, 3));

        // ЗАДАНИЕ 18
        System.out.println(squareRoot(9));

        // ЗАДАНИЕ 19
        System.out.println(celsiusToFahrenheit(25));

        // ЗАДАНИЕ 20
        validateString("NotEmpty");
    }

    //ЗАДАНИЕ 1
    public static int max(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("Числа равны");
        }
        return Math.max(a, b);
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 2
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 3
    public static int convert(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Невозможно конвертировать строку в число");
        }
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 4
    public static boolean validateAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        return true;
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 5
    public static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным");
        }
        return Math.sqrt(number);
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 6
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 7
    public static boolean checkForZero(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит нули");
            }
        }
        return true;
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 8
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не должна быть отрицательной");
        }
        return Math.pow(base, exponent);
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 9
    public static String trim(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки");
        }
        return str.substring(0, length);
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 10
    public static String findElement(int[] array, int element) {
        for (int j : array) {
            if (j == element) {
                return "Элемент найден";
            }
        }
        throw new IllegalArgumentException("Элемент не найден в массиве");
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 11
    public static String toBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным");
        }
        return Integer.toBinaryString(number);
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 12
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b == 0;
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 13
    public static <T> T getElement(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        return list.get(index);
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 14
    public static void checkPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Пароль слишком слабый");
        }
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 15
    public static void validateDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Неверный формат даты");
        }
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 16
    public static String concatenate(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null");
        }
        return str1 + str2;
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 17
    public static int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b;
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 18
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным");
        }
        return Math.sqrt(number);
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 19
    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
        }
        return celsius * 9 / 5 + 32;
    }
    ///////////////////////////////////////

    //ЗАДАНИЕ 20
    public static void validateString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или равна null");
        }
    }
    ///////////////////////////////////////
}