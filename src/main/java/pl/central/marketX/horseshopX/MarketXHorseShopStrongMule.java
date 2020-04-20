package pl.central.marketX.horseshopX;

import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.marketX.MarketX;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class MarketXHorseShopStrongMule implements PlayerActionState {
    public double StrongMulePriceX = 10.0;
    @Override
    public void action(ActionStateContext ctx) {
        System.out.println("You are about to buy Strong Mule for 5 guldens " +
                "\n [a] Proceed and leave Stable" +
                "\n [b] Cancel and leave Stable ");


        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("a")) {
            playerWealth = playerWealth - StrongMulePriceX;
            stateContext.setState(new MarketX());
        }
        stateContext.setState(new MarketX());
    }}

