// Организовать ввод и хранение данных пользователей. ФИО возраст, пол и выход из режима ввода информации
// вывод в формате Фамилия И.О. возраст пол
// добавить возможность выхода или вывода списка отсортированного по возрасту!)
// *реализовать сортировку по возрасту с использованием индексов
// *реализовать сортировку по возрасту и полу с использованием индексов

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hw4 {

    public static void main(String[] args) {
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> secName = new ArrayList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> patr = new ArrayList<>();
        ArrayList<String> age = new ArrayList<>();
        ArrayList<String> gend = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i;
        i = 0;
        boolean menuActive = true;

        while (menuActive) {
            System.out
                    .println("Какое действие необходимо выполнить? \n 1- добавить данные.\n 2-отобразить \n 3- выйти.");
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    System.out.println("Введите фамилию сотрудника: ");
                    id.add(i, i);
                    secName.add(i, scanner.nextLine());
                    System.out.println("Введите имя сотрудника: ");
                    firstName.add(i, scanner.nextLine());
                    System.out.println("Введите отчетсво сотрудника: ");
                    patr.add(i, scanner.nextLine());
                    System.out.println("Введите возраст сотрудника: ");
                    age.add(i, scanner.nextLine());
                    System.out.println("Введите пол сотрудника (М или Ж): ");
                    gend.add(i, scanner.nextLine());
                    i += 1;
                    break;
                case "2":
                    if (i == 0)
                        System.out.println("Информации нет");
                    else {
                        for (i = 0; i < secName.size(); i++) {
                            System.out.printf("%s %s.%s. %s %s\n", secName.get(i),
                                    firstName.get(i), patr.get(i), age.get(i), gend.get(i));
                        }
                    }
                    break;
                case "3":
                    menuActive = false;
                    break;

                default:
                    System.out.println("Неверная команда");
                    break;
            }
        }

    }
}