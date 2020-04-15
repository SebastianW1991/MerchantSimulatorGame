package pl.central;

import pl.central.horseshopX.MarketXHorseShop;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class MarketX implements PlayerActionState {
    @Override
    public void action(ActionStateContext ctx)
    {
        System.out.println("\"You arrived on  market place of Xarthas, apart of small shops selling non trade\" \n" +
                "  utilities such as meat or fish, you can see big merchant shops. Having "+playerWealth+
                " you can go to:\n" +
                "              \"[a] Go to horse merchant.\n" +
                "                \"[b] Go to armor merchant.\n" +
                "                \"[c] Go to wine merchant.\n" +
                "                \"[d] Go to weapon merchant.\n" +
                "                \"[e] Go to wheat merchant.\n" +
                "                \"[f] Leave the market\";");

        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        switch (playerChoice){
            case "a":
                stateContext.setState(new MarketXHorseShop());
                stateContext.action();
            case "b":
            case "c":
            case "d":
            case "e":
            case "f":
                stateContext.setState(new XarthasMain());
                stateContext.action();
        }

    }
}
