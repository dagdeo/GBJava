
public class task1 {//Домашнее задание
    public static float calculate(float a, float b, float c, float d) {// пункт 3. Метод a*(b+(c/d))
        //возвращаем значение a * (b + (c / d))
        return a * (b + (c / d));}

    public static boolean more10less20(int number1, int number2) { // пункт 4. Метод проверки от 10 до 20 включительно
        if (number1 + number2 >= 10 && number1 + number2 <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void positiveNegative (int x1) { //пункт 5. Число больше или меньше 0
        if (x1 >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean negativeNumber(int number) { //пункт 6. Проверка числа на отрицательность
        return (number < 0);
        }


    public static void helloMyFriend(String name) { //пункт 7. Приветствие
        System.out.println("Приветствую тебя учитель " + name + "!");
    }

    public static void yearschek(int year) { // проверка на высокосность
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " высокосный год");
        }
        else {
            System.out.println(year + " не высокосный год");
        }

        }



    public static void main(String[] args) {
        //Пункт 1 начало
        byte dendy8byte = 8; // 8-битное знаковое целое число
        short segaMegaDrive = 16; // 16-битное знаковое целое число
        int g = 85; // 32-битное знаковое целое число
        long nintendo64 = -989523645L; // 64-битное знаковое целое число
        float amgE = 5.5f; // 32-битное знаковое число с плавающей запятой одинарной точности
        double highPrecision = 156.654; // 64-битное знаковое число с плавающей запятой двойной точности
        char symbolUnicode = '\u262a'; // 16-битный тип данных, предназначенный для хранения символов в кодировке Unicode
        boolean believeDontBelieve = false; // логический тип данных
        //Пункт 1 конец

        // в качестве проверки себя по пункту 1
        System.out.println(dendy8byte);
        System.out.println(segaMegaDrive);
        System.out.println(g);
        System.out.println(nintendo64);
        System.out.println(amgE);
        System.out.println(highPrecision);
        System.out.println(symbolUnicode);
        System.out.println(believeDontBelieve);
        // конец проверки

        System.out.println(calculate(100f,200f,300f,400f)); // Выводим значение метода из пункта 3

        System.out.println(more10less20(10,5)); // выводим результат метода из пункта 4

        positiveNegative(-5); // результат метода из пункта 5

        System.out.println(negativeNumber(30)); // результат метода 6

        helloMyFriend("Михаил"); //результат метода 7

        yearschek(2020); //результат метода 8
    }



}

