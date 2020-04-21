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
                "[a] Buy chest with 10 axes for 50 guldens\n" +
                "[b] Buy chest with 10 swords for 80 guldens\n" +
                "[c] Buy chest with 10 poleaxes for 100 guldens\n" +
                "[d] Buy chest with 10 crossbows for 140 guldens\n" +
                "[e] Buy barrel of 100 arrows for 20 guldens\n" +
                "[f] Buy chest of 80 crossbow bolts for 30 guldens\n" +
                "[g] Leave shop and return to market");
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
                stateContext.setState(new MarketXPlateArmor());
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
