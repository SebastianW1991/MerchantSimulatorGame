package pl.central.marketX.horseshopX;

import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.marketX.MarketX;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class MarketXHorseShopMule implements PlayerActionState {
    public double MulePriceX = 8.0;
    @Override
    public void action(ActionStateContext ctx) {
        System.out.println("You are about to buy Old Mule for 8 guldens " +
                "\n [a] Proceed and leave Stable" +
                "\n [b] Cancel and leave Stable ");


        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("a")) {
            playerWealth = playerWealth - MulePriceX;
            stateContext.setState(new MarketX());
        }
        stateContext.setState(new MarketX());
    }
}
