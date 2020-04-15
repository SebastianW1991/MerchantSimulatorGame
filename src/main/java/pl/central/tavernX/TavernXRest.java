package pl.central.tavernX;

import pl.central.ActionStateContext;
import pl.central.Main;
import pl.central.PlayerActionState;
import pl.central.XarthasMain;

import static pl.central.Main.getUserInput;
import static pl.central.Main.playerWealth;

public class TavernXRest extends TavernX implements PlayerActionState {
    public double TavernXRestPrice = 10.0;
    @Override
    public void action(ActionStateContext ctx) {

        System.out.println("You are about to rent a room for 10 guldens, " +
                "\n [a] Proceed and pay" +
                "\n [b] Cancel and leave Tavern ");


        String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("a")) {
            if (playerWealth>TavernXRestPrice){
            playerWealth = playerWealth - TavernXRestPrice;
            stateContext.setState(new TavernX());
            }
            else{
                System.out.println("You cant afford that, try again");
            }
        }
        stateContext.setState(new XarthasMain());
    }


}
