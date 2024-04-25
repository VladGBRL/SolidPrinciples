class CoffeeLover {
    private CoffeeMachine[] coffeeMachines;

    public CoffeeLover(CoffeeMachine[] coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }

    public void makeCoffee() {
        for (CoffeeMachine machine : coffeeMachines) {
            machine.start();
        }
    }
}