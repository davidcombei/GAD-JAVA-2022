package lab5.factory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        switch(type){
            case"Cheese" :return new ChicagoStyleCheesePizza();
            case"Peperoni":return new ChicagoStylePeperoniPizza();
            default: return null;
        }
    }
}
