import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберте, что переводить: 1-масса, 2-расстояние");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        switch (value) {
            case (1):
                System.out.println("Выберте единицу измерения: 1-кг, 2-граммы, 3-тонн, 4-центнер");
                int weight = scanner.nextInt();
                System.out.println("Введите число: ");
                int num1 = scanner.nextInt();
                if (weight == 1) {
                    System.out.println("Результат: ");
                    System.out.println("Килограммы: " + num1);
                    System.out.println("Граммы: " + num1 * 1000);
                    System.out.printf("Тонны: " + "%.2f%n",num1 / 1000.0);
                    System.out.printf("Центнеры: " + "%.1f%n",num1 / 100.0);
                } else if (weight == 2) {
                    System.out.println("Результат: ");
                    System.out.printf("Килограммы: " + "%.2f%n",num1 / 1000.0);
                    System.out.println("Граммы: " + num1);
                    System.out.printf("Тонны: " + "%.5f%n",num1 / 1000000.0);
                    System.out.printf("Центнеры: " + "%.4f%n",num1 / 100000.0);
                } else if (weight == 3) {
                    System.out.println("Результат: ");
                    System.out.println("Килограммы: " + num1 * 1000);
                    System.out.println("Граммы: " + num1 * 1000000);
                    System.out.println("Тонны: " + num1);
                    System.out.println("Центнеры: " + num1 * 10);
                } else {
                    System.out.println("Результат: ");
                    System.out.println("Килограммы: " + num1 * 100);
                    System.out.println("Граммы: " + num1 * 100000);
                    System.out.println("Тонны: " + num1 / 10);
                    System.out.println("Центнеры: " + num1);
                }
                break;
            case (2):
                System.out.println("Выберте единицу измерения: 1-метры, 2-мили, 3-ярды, 4-футы");
                int unit = scanner.nextInt();
                System.out.println("Введите число: ");
                int num2 = scanner.nextInt();
                if (unit == 1) {
                    System.out.println("Результат: ");
                    System.out.println("Метры: " + num2);
                    System.out.printf("Мили: " + "%.3f%n",num2 * 0.000621);
                    System.out.printf("Ярды: " + "%.2f%n",num2 / 0.9144);
                    System.out.printf("Футы: " + "%.2f%n",num2 / 0.3048);
                } else if (unit == 2) {
                    System.out.println("Результат: ");
                    System.out.printf("Метры: " + "%.2f%n",num2 * 1609.344);
                    System.out.println("Мили: " + num2);
                    System.out.println("Ярды: " + num2 * 1760);
                    System.out.printf("Футы: " + "%.0f%n",num2 * 5280.002);
                } else if (unit == 3) {
                    System.out.println("Результат: ");
                    System.out.printf("Метры: " + "%.2f%n",num2 / 1.093613);
                    System.out.printf("Мили: " + "%.4f%n",num2 / 1760.0);
                    System.out.println("Ярды: " + num2);
                    System.out.println("Футы: " + num2 * 3);
                } else {
                    System.out.println("Результат: ");
                    System.out.printf("Метры: " + "%.2f%n",num2 / 3.28084);
                    System.out.printf("Мили: " + "%.4f%n",num2 / 5280.002);
                    System.out.printf("Ярды: " + "%.2f%n",num2 * 0.33333234018318);
                    System.out.println("Футы: " + num2);
                }
                break;
        }
    }
}