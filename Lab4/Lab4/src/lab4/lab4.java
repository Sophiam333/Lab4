package lab4;

import java.util.Random;
import java.util.Scanner;

public class lab4 {
    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock");
            System.out.println("Please select rock/paper/scissors/lizard/spock");
            String user = keyboard.nextLine();
            int num = (int) (5 * Math.random()) + 1;
            String comp = "";

            if (num == 1) {
                comp = "rock";
            } else if (num == 2) {
                comp = "paper";
            } else if (num == 3) {
                comp = "scissors";
            } else if (num == 4) {
                comp = "lizard";
            } else if (num == 5) {
                comp = "smock";
            }

            if (user.equals("rock") || user.equals("Rock")) {
                System.out.println("you choose rock");
            } else if (user.equals("paper") || user.equals("Paper")) {
                System.out.println("you chose paper");
            } else if (user.equals("scissors") || user.equals("Scissors")) {
                System.out.println("you chose scissors");
            } else if (user.equals("lizard") || user.equals("Lizard")) {
                System.out.println("you chose lizard");
            } else if (user.equals("smock") || user.equals("Smock")) {
                System.out.println("you chose smock");
            }
            System.out.println("I choose " + comp);

            if (user.equals(comp)) {
                System.out.println("Its a tie.");
            } else if (user.equals("Rock")) {
                if (comp.equals("scissors") || comp.equals("lizard")) {
                    System.out.println("You win!");
                } else if (comp.equals("spock") || comp.equals("paper")) {
                    System.out.println("You lose!");
                }
            } else if (user.equals("Paper")) {
                if (comp.equals("rock") || comp.equals("spock")) {
                    System.out.println("You win!");
                } else if (comp.equals("lizard") || comp.equals("scissors")) {
                    System.out.println("You lose!");
                }
            } else if (user.equals("Scissors")) {
                if (comp.equals("lizard") || comp.equals("paper")) {
                    System.out.println("You win!");
                } else if (comp.equals("spock") || comp.equals("rock")) {
                    System.out.println("You lose!");
                }
            } else if (user.equals("Lizard")) {
                if (comp.equals("spock") || comp.equals("paper")) {
                    System.out.println("You win!");
                } else if (comp.equals("rock")) {
                    System.out.println("You lose!");
                }
            } else if (user.equals("Spock")) {
                if (comp.equals("scissors") || comp.equals("rock")) {
                    System.out.println("You win!");
                } else if (comp.equals("lizard") || comp.equals("paper"))
                    System.out.println("You lose!");
            }
        }

        {
            System.out.println("Do you want to play again? y/n ");
        }
    }

    }