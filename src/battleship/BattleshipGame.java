package battleship;

import java.util.Scanner;

public class BattleshipGame {

        private static final int BOARD_SIZE = 10;

        private static final char EMPTY_CELL = '-';
        private static final char SHIP_CELL = 'S';
        private static final char HIT_CELL = 'X';
        private static final char MISS_CELL = 'O';

        private char[][] player1Board;
        private char[][] player2Board;

        private String player1Name;
        private String player2Name;

        private Scanner scanner;

        public BattleshipGame() {
            player1Board = new char[BOARD_SIZE][BOARD_SIZE];
            player2Board = new char[BOARD_SIZE][BOARD_SIZE];

            initializeBoards();

            scanner = new Scanner(System.in);
        }

        public void play() {
            System.out.println("Добро пожаловать в игру Морской бой!");

            // Ввод имен игроков
            System.out.print("Введите имя первого игрока: ");
            player1Name = scanner.nextLine();
            System.out.print("Введите имя второго игрока: ");
            player2Name = scanner.nextLine();

            // Расстановка кораблей
            System.out.println("\n" + player1Name + ", расставьте свои корабли.");
            placeShips(player1Board);

            System.out.println("\n" + player2Name + ", расставьте свои корабли.");
            placeShips(player2Board);

            System.out.println("\nПриготовьтесь к битве!\n");

            // Игровой цикл
            while (true) {
                System.out.println(player1Name + ", ваш ход:");
                boolean isPlayer1TurnSuccess = playerTurn(player1Name, player2Board);

                if (isGameOver(player2Board)) {
                    System.out.println("\n" + player1Name + ", вы победили! Поздравляем!");
                    break;
                }

                System.out.println("\n" + player2Name + ", ваш ход:");
                boolean isPlayer2TurnSuccess = playerTurn(player2Name, player1Board);

                if (isGameOver(player1Board)) {
                    System.out.println("\n" + player2Name + ", вы победили! Поздравляем!");
                    break;
                }

                if (!isPlayer1TurnSuccess && !isPlayer2TurnSuccess) {
                    System.out.println("\nОба игрока промахнулись.");
                }

                System.out.println();
            }
        }

        private void initializeBoards() {
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    player1Board[i][j] = EMPTY_CELL;
                    player2Board[i][j] = EMPTY_CELL;
                }
            }
        }

        private void placeShips(char[][] board) {
            int[] shipCounts = {4, 3, 2, 1};

            for (int size = 4; size >= 1; size--) {
                int count = shipCounts[size - 1];
                System.out.println("\nРасставьте " + count + " кораблей размером " + size + ".");

                for (int i = 0; i < count; i++) {
                    boolean isPlacementValid = false;

                    while (!isPlacementValid) {
                        System.out.print("Введите координаты корабля (формат: x y): ");
                        String[] coordinates = scanner.nextLine().split(" ");
                        int x = Integer.parseInt(coordinates[0]);
                        int y = Integer.parseInt(coordinates[1]);

                        System.out.print("Введите направление корабля (h - горизонтальное, v - вертикальное): ");
                        String direction = scanner.nextLine();

                        isPlacementValid = validateShipPlacement(board, x, y, size, direction.charAt(0));

                        if (isPlacementValid) {
                            placeShip(board, x, y, size, direction.charAt(0));
                            printBoard(board);
                        } else {
                            System.out.println("Невозможно разместить корабль в указанных координатах. Попробуйте еще раз.");
                        }
                    }
                }
            }
        }

        private boolean validateShipPlacement(char[][] board, int x, int y, int size, char direction) {
            if (x < 0 || x >= BOARD_SIZE || y < 0 || y >= BOARD_SIZE) {
                return false;
            }

            if (direction == 'h') {
                if (y + size > BOARD_SIZE) {
                    return false;
                }

                for (int i = y; i < y + size; i++) {
                    if (board[x][i] != EMPTY_CELL) {
                        return false;
                    }
                }
            } else if (direction == 'v') {
                if (x + size > BOARD_SIZE) {
                    return false;
                }

                for (int i = x; i < x + size; i++) {
                    if (board[i][y] != EMPTY_CELL) {
                        return false;
                    }
                }
            } else {
                return false;
            }

            return true;
        }

        private void placeShip(char[][] board, int x, int y, int size, char direction) {
            if (direction == 'h') {
                for (int i = y; i < y + size; i++) {
                    board[x][i] = SHIP_CELL;
                }
            } else if (direction == 'v') {
                for (int i = x; i < x + size; i++) {
                    board[i][y] = SHIP_CELL;
                }
            }
        }

        private void printBoard(char[][] board) {
            System.out.print("  ");
            for (int i = 0; i < BOARD_SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            for (int i = 0; i < BOARD_SIZE; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < BOARD_SIZE; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }

        private boolean playerTurn(String playerName, char[][] targetBoard) {
            System.out.print(playerName + ", введите координаты выстрела (формат: x y): ");
            String[] coordinates = scanner.nextLine().split(" ");
            int x = Integer.parseInt(coordinates[0]);
            int y = Integer.parseInt(coordinates[1]);

            if (targetBoard[x][y] == SHIP_CELL) {
                System.out.println("Попадание!");
                targetBoard[x][y] = HIT_CELL;
                return true;
            } else {
                System.out.println("Мимо!");
                targetBoard[x][y] = MISS_CELL;
                return false;
            }
        }

        private boolean isGameOver(char[][] board) {
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    if (board[i][j] == SHIP_CELL) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {
            BattleshipGame game = new BattleshipGame();
            game.play();
        }
    }

