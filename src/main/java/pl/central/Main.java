package pl.central;

import pl.central.tavernX.TavernX;

import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Double playerWealth = 20.50;

    public static void main(String[] args) {
        if (playerWealth <= 0.0) {
            gameOver();
        }
        Player player = new Player();
        System.out.println("Insert your name");
        player.setPlayerName(getUserInput());
        System.out.println("Hello " + player.getPlayerName() + " After long time abroad where you were " +
                "apprentice at local merchant shop, you were called to your hometown, because of your father death. " +
                "\nUnfortunately, after return, you found that house of your parents was destroyed by fire. " +
                "All you have now is " + playerWealth + "guldens and old cart with couple of donkeys. " +
                "Now you are in the middle of the city of Xarthas and your possibilities, where you can go include:\n " +
                "[a] Tavern\n [b] Marketplace\n [c] City Outskirts ");

        ActionStateContext stateContext = new ActionStateContext();
        String playerChoice = getUserInput();
        switch (playerChoice) {
            case "a":
                stateContext.setState(new TavernX());
                stateContext.action();
            case "b":
                stateContext.setState(new MarketX());
                stateContext.action();
            case "c":
                stateContext.setState(new OutskirtsX());
                stateContext.action();

            default:
                stateContext.setState((new XarthasMain()));
                stateContext.action();
        }


    }

    public static String getUserInput() {
        return scanner.nextLine().trim();
    }

    public static String gameOver() {
        return "You have just bankrupted and lost the game";
    }

}

