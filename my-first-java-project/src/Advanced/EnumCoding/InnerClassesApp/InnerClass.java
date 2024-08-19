package Advanced.EnumCoding.InnerClassesApp;

import Advanced.EnumCoding.PizzaSize;

class Pizza {

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatedPrice();
    }

    private double calculatedPrice() {
        switch (pizzaSize) {
            case SMALL:
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
}
//Inner Class
public class InnerClass {
    private static boolean isPizzaReady(int waitedInMinutes) {
        class Oven {
            public boolean isBaked() {
                if (waitedInMinutes > 30) {
                    return true;
                }
                return false;
            }
        }
        Oven oven =new Oven();
        return oven.isBaked();
    }

    public static void main(String[] args) {
        Pizza pizza =new Pizza("hari",PizzaSize.MEDIUM);
        System.out.println(pizza.getName());
        //Example for Anonymous Class
        Pizza pizza1=new Pizza("Virat",PizzaSize.SMALL){
            @Override
            public String getName() {
                return "Anonymous Class";
            }
        };
        System.out.println(pizza1.getName());
        System.out.println("Is Baked  :"+InnerClass.isPizzaReady(45));
    }
}

