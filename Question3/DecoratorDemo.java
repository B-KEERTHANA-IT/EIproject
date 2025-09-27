interface Pizza {
    String getDescription();
    double getCost();
}
class BasicPizza implements Pizza {
    public String getDescription() {
        return "Basic Pizza";
    }
    public double getCost() {
        return 100.0;
    }
}
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
    public double getCost() {
        return super.getCost() + 40.0;
    }
}
class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }
    public double getCost() {
        return super.getCost() + 30.0;
    }
}
public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription() + " → Rs." + pizza.getCost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " → Rs." + pizza.getCost());

        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription() + " → Rs." + pizza.getCost());
    }
}
