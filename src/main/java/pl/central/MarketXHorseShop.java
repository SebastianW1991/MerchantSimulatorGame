package pl.central;

import static pl.central.Main.getUserInput;

public class MarketXHorseShop implements PlayerActionState{

    @Override
    public void action(ActionStateContext ctx)
    {
        System.out.println("You can:\n" +
                "[a] Buy old mule for 5 guldens\n" +
                "[b] Buy mule for 8 guldens\n" +
                "[c] Buy strong mule for 10 guldens\n" +
                "[d] Return to the market");
        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        switch (playerChoice)
        {
            case  "a":
                stateContext.setState(new MarketXHorseShopOldMule());
                stateContext.action();
            case "b" :
                stateContext.setState(new MarketX());
                stateContext.action();
            case "c":
                stateContext.setState(new OutskirtsX());
                stateContext.action();
            case "d":
                stateContext.setState(new MarketX());
                stateContext.action();

        }


    }
}



