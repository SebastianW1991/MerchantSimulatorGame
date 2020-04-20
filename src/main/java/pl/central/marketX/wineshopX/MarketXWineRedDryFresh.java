package pl.central.marketX.wineshopX;

import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.marketX.MarketX;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class MarketXWineRedDryFresh implements PlayerActionState {
    public double RedDryFreshWinePriceX = 20.0;
    @Override
    public void action(ActionStateContext ctx) {
        System.out.println("You are about to buy Barrel of Red Dry Fresh Wine for 40 guldens " +
                "\n [a] Proceed and leave Shop" +
                "\n [b] Cancel and leave Shop " +
                "\n [c] Cancel and ask for something else");


        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("a")) {
            if (playerWealth>= RedDryFreshWinePriceX){
            playerWealth = playerWealth - RedDryFreshWinePriceX;
            stateContext.setState(new MarketX());
            stateContext.action();}
            else {
                System.out.println(" You have not enough money, you may buy something cheaper though.");
                stateContext.setState(new MarketXWineShop());
                stateContext.action();
            }
        }
        else if(playerChoice.equals("c")){
            stateContext.setState(new MarketXWineShop());
            stateContext.action();
        }
        else{
            stateContext.setState(new MarketX());
            stateContext.action();
        }

    }}

