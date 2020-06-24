import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class task3 { //Домашнее задание к уроку №3 "Игра угадай слово"

    public static void compare(String firstWord, String secondWord) {//метод для сравнения двух слов
            if (firstWord.equals(secondWord)) {
            System.out.println("Поздравляю! Вы правильно угадали слово " + firstWord);
        }
        else {
            System.out.print("К сожалению Вы не отгадали слово, но совпали следующие буквы: ");
            for (int i = 0; i < firstWord.length() && i < secondWord.length(); i++) {//поиск и вывод одинаковых букв в словах.
                char firstWordLetter  = firstWord.charAt(i);
                char secondWordLetter = secondWord.charAt(i);
                if (firstWordLetter == secondWordLetter)
                    System.out.print(firstWordLetter);
                else {
                    System.out.print("#");
                }
            }
            for (int i = 0; i < 15 - firstWord.length() || i < 15 - secondWord.length(); i++) {//заполнение #
                System.out.print("#");
            }
        }
    }


    public static void main(String[] args) {
        String[] arrayWords = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        int compWordNumber = rand.nextInt(arrayWords.length); //задаем случайный номер элемента массива arrayWords
        //в диапазоне чисел от 0 до arrayWords.length

        //System.out.println(compWordNumber + " номер случайной ячейки из массива слов"); //писал для теста, можно удалить
        String computerWord = arrayWords[compWordNumber]; //задаем компьютеру слово из массива под номером compWordNumber
                                                          //которое будет угадывать игрок
        //System.out.println(computerWord + " само слово, которое загадал компьютер"); //писал для теста, можно удалить

        System.out.println("Игра 'Угадай слово'");
        System.out.println("Выбирете одно слово из нижеперечисленнных");
        System.out.println(Arrays.toString(arrayWords));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выбранное Вами слово, используя только маленькие буквы латинского алфавита");
        String userWord = sc.next();
        compare(computerWord, userWord);

        while (computerWord.equals(userWord) == false) {
            System.out.println();
            System.out.println();
            System.out.println("Попробуйте еще раз!");
            System.out.println("Выбирете одно слово из нижеперечисленнных");
            System.out.println(Arrays.toString(arrayWords));
            System.out.println("Введите выбранное Вами слово, используя только маленькие буквы латинского алфавита");
            userWord = sc.next();
            compare(computerWord, userWord);
        }

        }
    }

