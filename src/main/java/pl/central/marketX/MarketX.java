package pl.central.marketX;

import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.XarthasMain;
import pl.central.marketX.armorshopX.MarketXArmorShop;
import pl.central.marketX.grainshopX.MarketXGrainShop;
import pl.central.marketX.horseshopX.MarketXHorseShop;
import pl.central.marketX.weaponshopX.MarketXWeaponShop;
import pl.central.marketX.wineshopX.MarketXWineShop;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class MarketX implements PlayerActionState {
    @Override
    public void action(ActionStateContext ctx)
    {
        System.out.println("\"You arrived on  market place of Xarthas, apart of small shops selling non trade\" \n" +
                "  utilities such as meat or fish, you can see big merchant shops. Having "+playerWealth+
                " you can go to:\n" +
                "                [a] Go to horse merchant.\n" +
                "                [b] Go to armor merchant.\n" +
                "                [c] Go to wine merchant.\n" +
                "                [d] Go to weapon merchant.\n" +
                "                [e] Go to grain merchant.\n" +
                "                [f] Leave the market");

        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        switch (playerChoice){
            case "a":
                stateContext.setState(new MarketXHorseShop());
                stateContext.action();
            case "b":
                stateContext.setState(new MarketXArmorShop());
                stateContext.action();
            case "c":
                stateContext.setState(new MarketXWineShop());
                stateContext.action();
            case "d":
                stateContext.setState(new MarketXWeaponShop());
                stateContext.action();
            case "e":
                stateContext.setState(new MarketXGrainShop());
                stateContext.action();
            case "f":
                stateContext.setState(new XarthasMain());
                stateContext.action();
        }

    }
}
