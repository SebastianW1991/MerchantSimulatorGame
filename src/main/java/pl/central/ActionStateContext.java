package pl.central;

import pl.central.marketX.MarketX;

public class ActionStateContext
{
    private PlayerActionState currentState;

    public ActionStateContext()
    {
        currentState = new MarketX();
    }

    public void setState(PlayerActionState state)
    {
        currentState = state;
    }

    public void action()
    {
        currentState.action(this);
    }
}



