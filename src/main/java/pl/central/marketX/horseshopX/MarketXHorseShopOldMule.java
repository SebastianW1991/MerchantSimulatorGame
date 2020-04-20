package pl.central.marketX.horseshopX;


import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.marketX.MarketX;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class MarketXHorseShopOldMule implements PlayerActionState {
    public double OldMulePriceX = 5.0;
    @Override
    public void action(ActionStateContext ctx) {
        System.out.println("You are about to buy Old Mule for 5 guldens " +
                "\n [a] Proceed and leave Stable" +
                "\n [b] Cancel and leave Stable ");


        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("a")) {
            playerWealth = playerWealth - OldMulePriceX;
            stateContext.setState(new MarketX());
        }
        stateContext.setState(new MarketX());
    }
}
