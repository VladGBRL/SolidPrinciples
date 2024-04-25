public class Main {
    public static void main(String[] args) {
        CoffeeMachine[] userDefinedMachines = {
                new SimpleCoffeeMachine(),
                new ComplexCoffeeMachine()
        };

        CoffeeLover coffeeLover = new CoffeeLover(userDefinedMachines);
        coffeeLover.makeCoffee();
    }
}