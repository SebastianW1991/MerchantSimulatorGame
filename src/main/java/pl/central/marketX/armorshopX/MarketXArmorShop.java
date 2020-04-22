package pl.central.marketX.armorshopX;

import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.marketX.MarketX;
import pl.central.marketX.weaponshopX.MarketXWeaponShop;

import static pl.central.Main.getUserInput;

public class MarketXArmorShop implements PlayerActionState {
    @Override
    public void action(ActionStateContext ctx)
    {
        System.out.println("You can:\n" +
                "[a] Buy  10 round shields for 120 guldens\n" +
                "[b] Buy 10 kite shields for 150 guldens\n" +
                "[c] Buy chest of infantry helmets for 200 guldens\n" +
                "[d] Buy chest of chainmails for 300 guldens\n" +
                "[e] Buy chest of gauntlets for 250 guldens\n" +
                "[f] Buy chest of plate armours for 1000 guldens\n" +
                "[g] Buy chest of KnightHelmets for 700 guldens\n" +
                "[h] Leave shop and return to market");
        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        switch (playerChoice)
        {
            case  "a":
                stateContext.setState(new MarketXRoundShield());
                stateContext.action();
            case "b" :
                stateContext.setState(new MarketXKiteShield());
                stateContext.action();
            case "c":
                stateContext.setState(new MarketXInfantryHelmet());
                stateContext.action();
            case "d":
                stateContext.setState(new MarketXChainmail());
                stateContext.action();
            case  "e":
                stateContext.setState(new MarketXGauntlets());
                stateContext.action();
            case "f" :
                stateContext.setState(new MarketXPlateArmor());
                stateContext.action();
            case "g" :
                stateContext.setState(new MarketXKnightsHelmet());
                stateContext.action();
            case "h":
                stateContext.setState(new MarketX());
                stateContext.action();
            default:
                System.out.println("there is no such option");
                stateContext.setState(new MarketXWeaponShop());
                stateContext.action();

        }


    }
}
