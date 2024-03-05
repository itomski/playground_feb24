package de.lubowiecki.uebung3;

import java.util.Scanner;

import static de.lubowiecki.uebung3.UiUtils.*; // Statisches Inventar von UiUtils wird importiert
import static de.lubowiecki.uebung3.Direction.*;

public class Game {

    private final Scanner scanner;

    private final Board board = new Board(10);

    private final Bot bot = new Bot(board);

    public Game() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Game().start();
    }

    private void start() {

        String input;

        // app ist ein Label
        app: while(true) {

            System.out.println(KEYS);
            input = scanner.next().trim().toLowerCase();

            if(input.equals("exit")) {
                break app; // Break bezieht sich auf die Struktur mit dem Label
            }
            else if(input.equals("go")) {

                String[] directions = scanner.next().trim().toLowerCase().split("");

                for (String d : directions) {

                    if(d.equals("d")) {
                        bot.move(DOWN);
                    }
                    else if (d.equals("t")) {
                        bot.move(TOP);
                    }
                    else if (d.equals("l")) {
                        bot.move(LEFT);
                    }
                    else if (d.equals("r")) {
                        bot.move(RIGHT);
                    }
                    else {
                        System.out.println(ERR_INPUT);
                    }
                }
                board.print();
            }
            else {
                System.out.println(ERR_INPUT);
            }
        }

        System.out.println(THE_END);

    }
}
