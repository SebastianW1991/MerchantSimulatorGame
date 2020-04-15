package pl.central.tavernX;

import pl.central.PlayerActionState;

public class TavernXMeal extends TavernX implements PlayerActionState {
    private double tavernXMealPrice;

    public double getTavernXMealPrice() {
        return 10;
    }

    public void setTavernXMealPrice(double tavernXMealPrice) {
        this.tavernXMealPrice = tavernXMealPrice;
    }
}
