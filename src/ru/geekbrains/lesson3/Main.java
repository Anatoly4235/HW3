package ru.geekbrains.lesson3;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        questNumber();
//        questWord();

    }

    static void questNumber() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Написать программу Угадай число\n ");
        System.out.println("Программой загадано число от 0 до 9\nпопробуйте угадать это число с трёх попыток");

        int maxLenght = 3;
        int number;
        int repeat = 1;

        for (int j = 0; j < repeat; j++) {
            int x = random.nextInt(10);


            for (int i = 0; i < maxLenght; i++) {


                System.out.println("Попытка " + (i + 1) + " из " + maxLenght + ". Введите число");
                number = scanner.nextInt();
                if (number < 0 || number > 9) {
                    System.out.println("Вы ввели число, не входящее в диапазон от 0 до 9. Повторите попытку");
                } else if (number == x) {
                    System.out.println("Поздравляю, вы угадали. загаданное число: " + x);
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет(1 – повторить, 0 – нет)");
                    number = scanner.nextInt();
                    if (number == 1) {
                        repeat++;
                    } else {
                        break;
                    }

                } else if (number > x) {
                    System.out.println("Мимо, вы ввели слишком большое число");
                } else if (number < x) {
                    System.out.println("Мимо, вы ввели слишком маленькое число");
                }

                if (i == maxLenght - 1) {
                    System.out.println("Ваши попытки закончились");
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет(1 – повторить, 0 – нет)");
                    number = scanner.nextInt();
                    if (number == 1) {
                        repeat++;
                    } else {
                        break;
                    }
                }

            }


        }
        scanner.close();
    }

//    static void questWord() {

//        Компьютер загадывает слово
//        Запрашиваем ответ пользователя
//        Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//        Играем до тех пор, пока игрок не отгадает слово
//        Используем только маленькие буквы

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        String x;
//        int y;
//
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
//                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
//                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
//                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//
//        for (int i = 0; i < words.length; i++) {
//                if(i % 8 ==0){
//                System.out.println();
//            }
//            System.out.print(words[i] + " ");
//        }   //печатаем в читаемом виде список слов
//            y = random.nextInt(words.length); // рандомим элемент массива
//            System.out.println();
//            System.out.println(words[y]);
//            System.out.println("Угадайте слово загаданное компьютером из списка выше");
//            x = scanner.nextLine();
//            if (words[y] == x){
//                System.out.println("Верно! Вы угадали");
//            } else System.out.println("Попробуйте ещё раз");
//

//        System.out.println(Arrays.toString(words));

//    }

}

