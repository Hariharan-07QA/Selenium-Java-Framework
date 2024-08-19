package Advanced.EnumCoding;
public class PizzaApp {
    public static void main(String[] args) {
        System.out.println("Available pizza size");
        for(PizzaSize pizzaSize: PizzaSize.values())
        {
            System.out.println("-"+pizzaSize.getPizzaSizeText());
        }
        Pizza pizzaOrder =new Pizza("Gandhi",PizzaSize.LARGE);
        System.out.println(pizzaOrder.getName());
        System.out.println(pizzaOrder.getPizzaSize().getPizzaSizeText());
        System.out.println(pizzaOrder.getPrice());
    }
}
