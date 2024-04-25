import java.util.ArrayList;
import java.util.List;
public class CoffeeLover {
    private List<CoffeeMachine> coffeeMachines;

    public CoffeeLover() {
        this.coffeeMachines = new ArrayList<>();
    }

    // Method to add coffee machines
    public void addCoffeeMachine(CoffeeMachine coffeeMachine) {

        coffeeMachines.add(coffeeMachine);
    }

    public void makeCoffee() {

        coffeeMachines.forEach(CoffeeMachine::start);
    }
}
