package pl.central.tavernX;

import pl.central.ActionStateContext;

import pl.central.PlayerActionState;
import pl.central.XarthasMain;


import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class TavernXBeer extends TavernX implements PlayerActionState {
    public double TavernXBeerPrice = 0.5;
    @Override
    public void action(ActionStateContext ctx) {

        System.out.println("You are about to buy Beer for 0.5 guldens, " +
                "\n [a] Proceed" +
                "\n [b] Cancel and leave Tavern ");


        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("a")) {
            playerWealth = playerWealth - TavernXBeerPrice;
            stateContext.setState(new TavernX());
        }
        stateContext.setState(new XarthasMain());
    }

}


