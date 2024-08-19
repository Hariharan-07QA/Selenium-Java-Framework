package Advanced.EnumCoding;

public class Pizza {

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price=calculatedPrice();
    }

    private double calculatedPrice() {
        switch (pizzaSize)
        {
            case SMALL :
            default:
                return 9.55;
            case MEDIUM:
                return 14.55;
            case LARGE:
                return 20.44;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        System.out.println(pizzaSize);
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }
}
