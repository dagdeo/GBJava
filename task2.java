import java.util.Arrays;
import java.util.Scanner;

public class task2 { //Домашнее задание к уроку 2

    public static boolean chekAr() {
        //** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны. Задание 6
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов (столбцов) целочисленного одномерного массива:");
        int n = in.nextInt();
        int[] chekArray = new int[n];
        for (int i = 0; i < n; i++) {
            int arryaElNumber = i + 1;
            System.out.print("Введите элемент массива под номером " + arryaElNumber + ": ");
            chekArray[i] = in.nextInt();
        }
        System.out.println("Получен массив из " + n + " элементов:");
        System.out.println(Arrays.toString(chekArray));

        //проверка массива на равенстов суммы левых и правых частей
        int summLeftSide = 0;//переменная для записи сумм элементов левой части
        int summRightSide = 0;//переменная для записи сумм элементов правой части
        for (int i = 0; i < n - 1; i++) {
            summLeftSide = summLeftSide + chekArray[i];
            summRightSide = 0; //обнуляем сумму правой части после каждого шага основного цикла
            for (int x = i + 1; x < n; x++) {
                summRightSide = summRightSide + chekArray[x];
            }
            // вывод на экран суммы правой и левой частей массива для проверки работы циклов
            System.out.println("сумма левой части = " + summLeftSide + " сумма правой части = " + summRightSide); // Эту строку можно взять в комментарий, на работоспособность программы не влияет.

            if (summLeftSide == summRightSide) {
                break; //при получении равенста левой и правой частей массива останавливаем цикл.
            }

        }
        System.out.print("Суммы левой и правой части массива равны? ");
        return (summLeftSide == summRightSide); //возвращает true или false, по условиям задачи false нас не интересует,
        //как сделать только вывод true?
    }



    public static void arrayShift(int[] userArray, int shift) { //Задача 7 *** (ЦИКЛИЧЕСКИЙ ВАРИАНТ)
        System.out.println("Исследуемый массив:");
        System.out.println(Arrays.toString(userArray));// выводим массив на печать

        System.out.println("Число n = " + shift);// выводим на печать число n

        int shiftProgram = 0;
        if (shift != 0) {//проверка на необходимость сдвига (n не равно 0)
            //при циклическом сдвиге, т.е. n > чем размер массива можем не тратить время на целые круги, а сразу
            // заняться просчетом последнего неполного круга. К примеру при длине массива 4 и n = 15,
            // нет смысла считать 15 / 4 = 3 круга, нам инетересен сдвиг 15 - 4 * 3 = 3 или остаток деления по модулю

            if (shift > userArray.length) {
                shiftProgram = Math.abs(shift % userArray.length);
            }
            else {
                shiftProgram = Math.abs(shift);
            }
        }

        //в заивисимости от знака n сдвиг будет происходить
        //слева на право при положительном значении n
        //справа на лево при отрицательном значениии n

        if (shift > 0) {
            for (int i = 0; i < shiftProgram; i++) {
                //Убираем первый (нулевой) элимент массива в буфер обмена varBuffer
                int varBuffer = userArray[0];
                //Записываем нна место нулевого эемента последний элемент userArray.length - 1
                userArray[0] = userArray [userArray.length - 1];

                //сдвигаем весь массив вправо
                for (int g = userArray.length - 1; g > 1; g--) {
                    userArray[g] = userArray[g - 1];
                }
                //записываем в ячейку 1 значение из буфера
                userArray[1] = varBuffer;

             }
        }
        else if (shift <0) {
            for (int i = 0; i < shiftProgram; i++) {
                //Убираем последний элемент массива в буфер обмена varBuffer
                int varBuffer = userArray[userArray.length - 1];
                //Записываем на место последнего эемента нулевой элемент userArray[0]
                userArray[userArray.length - 1] = userArray[0];

                //сдвигаем весь массив влево
                for (int g = 0; g < userArray.length - 1; g++) {
                    userArray[g] = userArray[g + 1];
                }
                //записываем в предпоследнюю ячейку значение из буфера
                userArray[userArray.length-2] = varBuffer;
            }
        }
            System.out.println("Массив после сдвига примет вид:");
            System.out.println(Arrays.toString(userArray));
    }


    public static void main(String[] args) {
        //** Задать одномерный массив и найти в нем минимальный и максимальный элементы. Задание 5.
        int[] minMaxArr = {5, 10, 12, 9, 34, 5, 11, 10};
        int max = minMaxArr[0]; // переменная для максмимального значения эл-та массива
        int min = minMaxArr[0]; // переменная для минимального значения эл-та массива
        for (int tempVar : minMaxArr) {
            if (tempVar > max) {
                max = tempVar;
            }
            if (tempVar > tempVar) {
                min = tempVar;
            }

        }
        //вывод решения задачи 5
        System.out.println("Решение задания №5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы:");
        System.out.println("Исследуемая таблица");
        System.out.println(Arrays.toString(minMaxArr));
        System.out.println("Максимальное значение массива = " + max);
        System.out.println("Минимальное значение массива = " + min);
        System.out.println();

        //вывод решения задачи 6
        System.out.println("Решение задания №6. **Написать метод, в который передается не пустой одномерный");
        System.out.println("целочисленный массив, метод должен вернуть true, если в массиве есть место, ");
        System.out.println("в котором сумма левой и правой части массива равны.");
        System.out.println();

        System.out.println(chekAr());

        System.out.println();
        System.out.println();

        //вывод решения задачи 7
        System.out.println("Решение задания 7. 6. **** Написать метод, которому на вход подается одномерный массив и");
        System.out.println("число n (может быть положительным, или отрицательным), при этом метод должен сместить");
        System.out.println("все элементы массива на n позиций");
        arrayShift(new int[] {1, 2, 3, 4, 5}, -4);
    }

}