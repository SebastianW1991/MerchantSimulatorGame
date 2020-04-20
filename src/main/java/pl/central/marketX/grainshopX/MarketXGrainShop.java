package pl.central.marketX.grainshopX;

import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.marketX.MarketX;
import pl.central.marketX.wineshopX.MarketXWineRedDryFresh;
import pl.central.marketX.wineshopX.MarketXWineRedDryTenYearsOld;
import pl.central.marketX.wineshopX.MarketXWineRedDryYearOld;

import static pl.central.Main.getUserInput;

public class MarketXGrainShop implements PlayerActionState {
    @Override
    public void action(ActionStateContext ctx)
    {
        System.out.println("You can:\n" +
                "[a] Buy 10 kg bag of rye for 5 guldens\n" +
                "[b] Buy 10 kg bag of barley for 8 guldens\n" +
                "[c] Buy 10 kg bag of wheat for 10 guldens\n" +
                "[d] Return to the market");
        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        switch (playerChoice)
        {
            case  "a":
                stateContext.setState(new MarketXRye());
                stateContext.action();
            case "b" :
                stateContext.setState(new MarketXBarley());
                stateContext.action();
            case "c":
                stateContext.setState(new MarketXWheat());
                stateContext.action();
            case "d":
                stateContext.setState(new MarketX());
                stateContext.action();

        }


    }
}
