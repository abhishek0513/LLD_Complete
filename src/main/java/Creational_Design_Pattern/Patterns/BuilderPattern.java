package Creational_Design_Pattern.Patterns;


import java.util.List;


//Not a good practice to do this;
//class BurgerMeal{
//    private String bun;
//    private String patty;
//
//    public BurgerMeal(String bun, String patty, String sides, List<String>toppings){
//        this.bun = bun;
//        this.patty = patty;
//
//    }
//
//}

class BurgerMeal{
    private final String bunType;
    private final String patty;



    //optional add on;
    private final boolean hasCheese;
    private final List<String>toppings;
    private  final String drink;



    private BurgerMeal(BurgerBuilder builder) {
        this.bunType = builder.bunType;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.toppings = builder.toppings;
        this.drink = builder.drink;
    }


    public static class BurgerBuilder {
        private final String bunType;
        private final String patty;

        private boolean hasCheese;
        private List<String>toppings;
        private String drink;


        public BurgerBuilder(String bunType, String patty) {
            this.bunType = bunType;
            this.patty = patty;

        }



        public BurgerBuilder withCheese(boolean hasCheese){
            this.hasCheese = hasCheese;
            return this;
        }

        public BurgerBuilder setToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public BurgerBuilder setDrink(String drink) {
            this.drink = drink;
            return this;
        }
        public BurgerMeal build(){
            return new BurgerMeal(this);
        }
    }
}


public class BuilderPattern {
    public static void main(String[] args) {
        //not a ideal for filling null, null, null, too many parameter;
//         BurgerMeal burgerMeal = new BurgerMeal("wheat", "veg", null, null);
        BurgerMeal burgerMeal = new BurgerMeal.BurgerBuilder("wheat", "veg").build();
        BurgerMeal burgerMealWithCheese = new BurgerMeal.BurgerBuilder("wheat", "veg").withCheese(true).build();

    }
}
