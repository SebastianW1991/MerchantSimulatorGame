package pl.central.marketX.wineshopX;

import pl.central.ActionStateContext;
import pl.central.marketX.MarketX;
import pl.central.OutskirtsX;
import pl.central.PlayerActionState;
import pl.central.marketX.horseshopX.MarketXHorseShopOldMule;

import static pl.central.Main.getUserInput;

public class MarketXWineShop implements PlayerActionState {

    @Override
    public void action(ActionStateContext ctx)
    {
        System.out.println("You can:\n" +
                "[a] Buy barrel of fresh red dry wine for 20 guldens\n" +
                "[b] Buy barrel of 1 year old  red dry wine for 40 guldens\n" +
                "[c] Buy barrel of  10 years old red dry wine for 120 guldens\n" +
                "[d] Return to the market");
        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        switch (playerChoice)
        {
            case  "a":
                stateContext.setState(new MarketXWineRedDryFresh());
                stateContext.action();
            case "b" :
                stateContext.setState(new MarketXWineRedDryYearOld());
                stateContext.action();
            case "c":
                stateContext.setState(new MarketXWineRedDryTenYearsOld());
                stateContext.action();
            case "d":
                stateContext.setState(new MarketX());
                stateContext.action();

        }


    }
}