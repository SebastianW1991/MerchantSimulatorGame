package pl.central.tavernX;

import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.XarthasMain;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class TavernX implements PlayerActionState {
    @Override
    public void action(ActionStateContext ctx)
    {
        System.out.println("\"You are in tavern 'Wicked Bull' in Xarthas, you have "+ playerWealth +" guldens " +
                "you sat next to  nearest free table.\n" +
                "  \" Barmaid just walked to you and asked what do you want. You can ask for " +
                "\\n[a] Beer for for 0.5 gulden\" +\n" +
                "  \"\\n[b] Hot meal for 1 gulden\\n" +
                "[c] food for your horses which will cost you whole 2 guldens\\n" +
                "[d] Rent a room, regenerate and sleep for 10 gulden\" " +
                "[e] Leave Tavern and return to main city;");

        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();
        switch (playerChoice)
        {
            case  "a":
                stateContext.setState(new TavernXBeer());
                stateContext.action();
            case "b" :
                stateContext.setState(new TavernXMeal());
                stateContext.action();
            case "c":
                stateContext.setState(new TavernXHorseFood());
                stateContext.action();
            case "d":
                stateContext.setState(new TavernXRest());
                stateContext.action();
            case "e":
                stateContext.setState(new XarthasMain());
                stateContext.action();

            default:
                stateContext.setState((new TavernX()));
                stateContext.action();
        }
    }
}
