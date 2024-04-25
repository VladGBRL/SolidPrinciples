import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of coffee machines
        SimpleCoffeeMachine simpleCoffeeMachine = new SimpleCoffeeMachine();
        ComplexCoffeeMachine complexCoffeeMachine = new ComplexCoffeeMachine();

        // Create a list of coffee machines
        List<CoffeeMachine> coffeeMachines = List.of(simpleCoffeeMachine, complexCoffeeMachine);

        // Create a coffee lover and inject the list of coffee machines
        CoffeeLover coffeeLover = new CoffeeLover(coffeeMachines);

        // Make coffee using all available coffee machines
        coffeeLover.makeCoffee();
    }
}