import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {
    static private final int SIZE = 5;
    private final static char Dot_X = 'X';
    private final static char Dot_0 = '0';
    private final static char Dot_Empty = '.';
    private final static int CHARtoWIN = 4;
    static char[][] map = new char[SIZE][SIZE];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            checkWin(Dot_X);
            if (checkWin(Dot_X)) {
                System.out.println("YOU WIN!!!");
                break;
            }
            if (fullMap()) {
                System.out.println("DRAW");
                break;
            }
            aiTurn();
            printMap();
            checkWin(Dot_0);
            if (checkWin(Dot_0)) {
                System.out.println("AI WINS");
                break;
            }
            if (fullMap()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Game Over");
    }

    static void initMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = Dot_Empty;
            }
        }
    }

    static void printMap() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            {
                for (int j = 0; j < map.length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

    static void humanTurn() {
        int x;
        int y;
        do {
            x = -1;
            y = -1;
            System.out.println("Введите координаты x и y!");
            if (in.hasNextInt()) {
                x = in.nextInt() - 1;
            }
            if (in.hasNextInt()) {
                y = in.nextInt() - 1;
            }
            in.nextLine();
        }
        while (!iscell(x, y));
        map[x][y] = Dot_X;
    }

    static boolean iscell(int x, int y) {
        if (x < 0 || x >= 5 || y < 0 || y >= 5) {
            return false;
        }
        if (map[x][y] == Dot_Empty) {
            return true;
        } else {
            return false;
        }
    }

    static void aiTurn() {
        System.out.println("Компьютер походил");
        Random rand = new Random();
        int x = 0;
        int y = 0;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }
        while (!iscell(x, y));
        map[x][y] = Dot_0;
    }

    static boolean checkWin(char a) {
        int sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == a) {
                    sum++;
                } else {
                    sum = 0;
                }
                if (sum == CHARtoWIN) {
                    return true;
                }
            }
            sum = 0;
        }
        sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == a) {
                    sum++;
                } else {
                    sum = 0;
                }
                if (sum == CHARtoWIN) {
                    return true;
                }
            }
            sum = 0;
        }
        sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j && map[i][j] == a) {
                    sum++;
                }
                if (i == j && map[i][j] != a) {
                    sum = 0;
                }
            }
            if (sum == CHARtoWIN) {
                return true;
            }

        }
        sum = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - 1 - i] == a) {
                sum++;
            } else {
                sum = 0;
            }
            if (sum == CHARtoWIN) {
                return true;
            }
        }
        sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i + 1 == j && map[i][j] == a) {
                    sum++;
                }
                if (i + 1 == j && map[i][j] != a) {
                    sum = 0;
                }
            }
            if (sum == CHARtoWIN) {
                return true;
            }

        }
        sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j + 1 && map[i][j] == a) {
                    sum++;
                }
                if (i == j + 1 && map[i][j] != a) {
                    sum = 0;
                }
            }
            if (sum == CHARtoWIN) {
                return true;
            }

        }
        sum = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            if (map[i + 1][SIZE - 1 - i] == a) {
                sum++;
            } else {
                sum = 0;
            }
            if (sum == CHARtoWIN) {
                return true;
            }
        }
        sum = 0;
        for (int i = 1; i < SIZE; i++) {
            if (map[i - 1][SIZE - 1 - i] == a) {
                sum++;
            } else {
                sum = 0;
            }
            if (sum == CHARtoWIN) {
                return true;
            }
        }
        return false;
    }

    static boolean fullMap() {
        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == Dot_Empty) {
                    return false;
                }
            }
        }
        return true;
    }

}

