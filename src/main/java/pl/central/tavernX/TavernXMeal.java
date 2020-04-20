package pl.central.tavernX;

import pl.central.ActionStateContext;
import pl.central.marketX.MarketX;
import pl.central.PlayerActionState;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class TavernXMeal extends TavernX implements PlayerActionState {
    public double TavernXMealPrice = 2.0;
    @Override
    public void action(ActionStateContext ctx) {

        System.out.println("You are about to buy Beer for 0.5 guldens, " +
                "\n [a] Proceed" +
                "\n [b] Cancel and leave Tavern ");


        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("a")) {
            playerWealth = playerWealth - TavernXMealPrice;
            stateContext.setState(new MarketX());
        }
        stateContext.setState(new MarketX());
    }

}

