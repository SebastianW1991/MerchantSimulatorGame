package pl.central.marketX.armorshopX;

import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.marketX.MarketX;


import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class MarketXInfantryHelmet implements PlayerActionState {
    public double InfantryHelmetPriceX = 200.0;
    @Override
    public void action(ActionStateContext ctx) {
        System.out.println("You are about to buy chest of infantry helmets for 50 guldens " +
                "\n [a] Proceed and leave Shop" +
                "\n [b] Cancel and ask for something else"+
                "\n [b] Cancel and leave Shop ");


        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("a")) {
            if (playerWealth>=InfantryHelmetPriceX){
                playerWealth = playerWealth - InfantryHelmetPriceX;
                stateContext.setState(new MarketX());
                stateContext.action();}
            else {
                System.out.println(" You have not enough money, you may buy something cheaper though.");
                stateContext.setState(new MarketXArmorShop());
                stateContext.action();
            }
        }
        else if(playerChoice.equals("b")){
            stateContext.setState(new MarketXArmorShop());
            stateContext.action();
        }
        else if (playerChoice.equals("c")){
            stateContext.setState(new MarketX());
            stateContext.action();
        }
        else {
            System.out.println("There is no such option");
            stateContext.setState(new MarketXArmorShop());
            stateContext.action();
        }
    }

}
