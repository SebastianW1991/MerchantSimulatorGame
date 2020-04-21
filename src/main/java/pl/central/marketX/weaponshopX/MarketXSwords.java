package pl.central.marketX.weaponshopX;

import pl.central.ActionStateContext;
import pl.central.PlayerActionState;
import pl.central.marketX.MarketX;


import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class MarketXSwords implements PlayerActionState {
    public double SwordsPriceX = 80.0;
    @Override
    public void action(ActionStateContext ctx) {
        System.out.println("You are about to buy chest of swords for 50 guldens " +
                "\n [a] Proceed and leave Shop" +
                "\n [b] Cancel and ask for something else"+
                "\n [b] Cancel and leave Shop ");


        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("a")) {
            if (playerWealth>=SwordsPriceX){
                playerWealth = playerWealth - SwordsPriceX;
                stateContext.setState(new MarketX());
                stateContext.action();}
            else {
                System.out.println(" You have not enough money, you may buy something cheaper though.");
                stateContext.setState(new MarketXWeaponShop());
                stateContext.action();
            }
        }
        else if(playerChoice.equals("b")){
            stateContext.setState(new MarketXWeaponShop());
            stateContext.action();
        }
        else if (playerChoice.equals("c")){
            stateContext.setState(new MarketX());
            stateContext.action();
        }
        else {
            System.out.println("There is no such option");
            stateContext.setState(new MarketXWeaponShop());
            stateContext.action();
        }
    }

}
