package pl.central;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class XarthasMain implements PlayerActionState{
    @Override
    public void action(ActionStateContext ctx)
    {
        System.out.println("\"Now you are in the middle of the city of Xarthas you have "+ playerWealth +
                " places where you can go include:\\n \"+\n" +
                 " [a] Tavern\n [b] Marketplace\n [c]City Outskirts ");

        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        switch (playerChoice)
        {
            case  "a":
                stateContext.setState(new TavernX());
                stateContext.action();
            case "b" :
                stateContext.setState(new MarketX());
                stateContext.action();
            case "c":
                stateContext.setState(new OutskirtsX());
                stateContext.action();

        }

    }
}
