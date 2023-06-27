package battleship;

import java.io.IOException;
import java.util.Scanner;

public class Battleship {
    static String playerName1;
    static String playerName2;
    static Scanner scan = new Scanner(System.in);
    static int[][] battleField1 = new int[10][10];
    static int[][] battleField2 = new int[10][10];
    static int[][] monitor1 = new int[10][10];
    static int[][] monitor2 = new int[10][10];

    public static void main(String[] args) {
//        System.out.println("Player#1, please enter your name:");
//        playerName1 = scan.nextLine();
//        System.out.println("Player#2, please enter your name:");
//        playerName2 = scan.nextLine();
        placeShips(playerName1, battleField1);
        placeShips(playerName2, battleField2);

        while (true) {
            makeTurn(playerName1, monitor1, battleField2);
            if (isWinCondition()) {
                break;
            }
            makeTurn(playerName2, monitor2, battleField1);
            if (isWinCondition()) {
                break;
            }
        }

    }

    public static void placeShips(String playerName, int[][] battleField) {
        int deck = 4;
        while (deck >= 1) {
            System.out.println();
            System.out.println(playerName + ", please place your " + deck + "-deck ship ships on the battlefield");
            System.out.println();
            drawField(battleField);
            System.out.println("Please enter OX coordinate:");
            int x = scan.nextInt();
            System.out.println("Please enter OY coordinate:");
            int y = scan.nextInt();
            System.out.println("Choose direction:");
            System.out.println("1. Vertical");
            System.out.println("2. Horizontal");
            int orientation = scan.nextInt();
            if(!isAvailable(x, y, deck, orientation, battleField)){
                System.out.println("Wrong coordinates!");
                continue;
            }
            for (int i = 0; i < deck; i++) {
                if (orientation == 1) {
                    battleField[x][y + i] = 1;
                } else {
                    battleField[x + i][y] = 1;
                }
            }
            deck--;;
        }
    }

    public static void drawField(int[][] battleField) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < battleField.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < battleField[i].length; j++) {
                if (battleField[j][i] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void makeTurn(String playerName, int[][] monitor, int[][] battleField) {
        while (true) {
            System.out.println(playerName + ", please, make your turn");
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < monitor.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < monitor[i].length; j++) {
                    if (monitor[j][i] == 0) {
                        System.out.print("- ");
                    } else if (monitor[j][i] == 1) {
                        System.out.print(". ");
                    } else {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
            System.out.println("Please enter OX coordinate:");
            int x = scan.nextInt();
            System.out.println("Please enter OY coordinate:");
            int y = scan.nextInt();
            if (battleField[x][y] == 1) {
                System.out.println("Hit! Make your turn again!");
                monitor[x][y] = 2;
            } else {
                System.out.println("Miss, Your opponents turn!");
                monitor[x][x] = 1;
                break;
            }
        }
    }

    public static boolean isWinCondition() {
        int counter1 = 0;
        for (int i = 0; i < monitor1.length; i++) {
            for (int j = 0; j < monitor1[i].length; j++) {
                if (monitor1[i][j] == 2) {
                    counter1++;
                }
            }
        }

        int counter2 = 0;
        for (int i = 0; i < monitor2.length; i++) {
            for (int j = 0; j < monitor2[i].length; j++) {
                if (monitor1[i][j] == 2) {
                    counter2++;
                }
            }
        }

        if (counter1 >= 10) {
            System.out.println(playerName1 + "WIN!!!");
            return true;
        }

        if (counter2 >= 10) {
            System.out.println(playerName2 + "WIN!!!");
            return true;
        }

        return false;
    }

    public static boolean isAvailable(int x, int y, int deck, int rotation, int[][] battleField) {

        if (rotation == 1) {
            if (y + deck > battleField.length) {
                return false;
            }
        }
        if (rotation == 2) {
            if (x + deck > battleField.length) {
                return false;
            }
        }


        while (deck != 0) {
            for (int i = 0; i < deck; i++) {
                int xi = 0;
                int yi = 0;
                if (rotation == 1) {
                    yi = i;
                } else {
                    xi = i;
                }

                if (x + 1 + xi < battleField.length && x + 1 + xi >= 0) {
                    if (battleField[x + 1 + xi][y + yi] != 0) {
                        return false;
                    }
                }

                if (x - 1 + xi < battleField.length && x - 1 + xi >= 0) {
                    if (battleField[x - 1 + xi][y + yi] != 0) {
                        return false;
                    }
                }

                if (y + 1 + yi < battleField.length && y + 1 + yi >= 0) {
                    if (battleField[x + xi][y + 1 + yi] != 0) {
                        return false;
                    }
                }

                if (y - 1 + yi < battleField.length && y - 1 + yi >= 0) {
                    if (battleField[x + xi][y - 1 + yi] != 0) {
                        return false;
                    }
                }
            }
            deck--;
        }

        return true;
    }

}
