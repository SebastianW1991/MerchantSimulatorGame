package pl.central;

import static pl.central.Main.getUserInput;

public class OutskirtsX implements PlayerActionState {
    @Override
    public void action(ActionStateContext ctx){
        System.out.println("\"You have just went through the gates, now you can either:" +
                "\n [a] go forward to crossroad" +
                "\n [b] turn back and return to the city");

    String playerChoice = getUserInput();
        ActionStateContext stateContext = new ActionStateContext();

        if (playerChoice.equals("b")){
        stateContext.setState(new XarthasMain());
            stateContext.action();
    }else{
            stateContext.setState(new CrossroadsX());
            stateContext.action();
        }


    }

}
