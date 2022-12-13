package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int top = scanner.nextInt();
        logger.log("Создаем и наполняем список");
        List<Integer> list = generateList(size, top);
        System.out.print("Вот случайный список: ");
        list.forEach(p -> System.out.print(p + " "));
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filter = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        List<Integer> filtredList = new Filter(filter).filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        filtredList.forEach(p -> System.out.print(p + " "));
        System.out.println();
        logger.log("Завершаем программу");
    }

    private static List<Integer> generateList(int size, int top) {
        List<Integer>  result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(top));
        }
        return result;
    }
}