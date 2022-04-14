package lab5.factory;

public class Main {
    public static void main(String[] args) {
    PizzaStore nyPizzaStore=new NYPizzaStora();
    Pizza nyCheesePizza = nyPizzaStore.orderPizza("Cheese");
    Pizza nyPeperoniPizza=nyPizzaStore.orderPizza("Peperoni");
    PizzaStore chigPizzaStore=new ChicagoPizzaStore();
    PizzaStore chicagoPizzaStore=new ChicagoPizzaStore();
    Pizza chicagoPizza = chicagoPizzaStore.orderPizza("Cheese");

    }
}
