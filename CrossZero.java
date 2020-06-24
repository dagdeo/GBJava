import java.util.Random;
import java.util.Scanner;
public class CrossZero {

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {//бесконечноый цикл
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {//заполнение Х
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {//заполнение всех клеток
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {//
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static int SIZE = 5; // размер игрового поля
    public static int DOTS_TO_WIN = 4; // количество символов О или Х для победы
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map; // массив игровое поле
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();


    public static boolean checkWin(char symb) {
        // проверка заполнения ряда по вертикали, горизонтали и диагоналям.
        //методом перебора строк, вертикалей и горизонталей из методички
        /*
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
        */

        //Проверка через цикл for
        //Горизонталь по оси Х
        for(int i = 0; i < SIZE; i++) {
            int symbCountX = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) symbCountX++;
                if (symbCountX == DOTS_TO_WIN) return true;

            }
        }
        //Вертикаль
        for(int i = 0; i < SIZE; i++) {
            int symbCountY = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb) symbCountY++;
                if (symbCountY == DOTS_TO_WIN) return true;
            }
        }
        //Диагональ слева на право вверх
        int symbCountDiag1 = 0;//переменная для первой диагонали
        for(int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - 1 - i] == symb) symbCountDiag1++;
            if (symbCountDiag1 == DOTS_TO_WIN) return true;
        }
        //Диагональ слева на право вниз
        int symbCountDiag2 = 0;//переменная для второй диагонали
        for(int i = 0; i < SIZE; i++) {
            if (map[i][i] == symb) symbCountDiag2++;
            if (symbCountDiag2 == DOTS_TO_WIN) return true;
        }
        return false;
    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {//инициализация игрового поля и заполнение его пустыми элементами "."
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
