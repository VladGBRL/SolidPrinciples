public class Main {
    public static void main(String[] args) {
        CoffeeLover coffeeLover = new CoffeeLover();

        // Adding coffee machines
        coffeeLover.addCoffeeMachine(new SimpleCoffeeMachine());
        coffeeLover.addCoffeeMachine(new ComplexCoffeeMachine());

        // Making coffee
        coffeeLover.makeCoffee();
    }
}