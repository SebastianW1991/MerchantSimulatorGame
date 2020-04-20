package pl.central.marketX.wineshopX;

import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.marketX.MarketX;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class MarketXWineRedDryYearOld implements PlayerActionState {
    public double RedDryYearOldWinePriceX = 40.0;
    @Override
    public void action(ActionStateContext ctx) {
        System.out.println("You are about to buy Barrel of Red Dry Year Old Wine for 40 guldens " +
                "\n [a] Proceed and leave Shop" +
                "\n [b] Cancel and ask for something else " +
                "\n [c] Cancel and leave Shop");


        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("a")) {
            if (playerWealth >= RedDryYearOldWinePriceX) {
                playerWealth = playerWealth - RedDryYearOldWinePriceX;
                stateContext.setState(new MarketX());
                stateContext.action();
            } else {
                System.out.println(" You have not enough money, ashamed you ask for forgiveness and leave");
                stateContext.setState(new MarketX());
                stateContext.action();
            }

        }
        else if (playerChoice.equals("b")) {
            stateContext.setState(new MarketXWineShop());
            stateContext.action();
        }
        else if (playerChoice.equals("c")){
            stateContext.setState(new MarketX());
        stateContext.action();
            }
        else{
            System.out.println("There is no such option");
            stateContext.setState(new MarketXWineShop());
            stateContext.action();
        }
    }
}
