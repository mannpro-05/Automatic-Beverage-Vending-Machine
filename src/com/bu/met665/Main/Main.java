package com.bu.met665.Main;
/*
* This is the Main class where the execution of the code takes place
*/
public class Main {

    public static void main(String[] args) {
        // write your code here
        Drink myDrink = new Coffee("Americano");
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        /*
        * The total Condiments in this case will be 6 instead of 8 as we have a limit of 3 Units.
        * */
        System.out.println("The drink "+myDrink.drinkType+" has "+myDrink.getTotalMilkUnit()+" Milk Units"
                +" and "+myDrink.getTotalSugarUnit()+" Sugar Units. Total "
                +myDrink.getTotalNumberOfCondiments() +" Condiments");
        Drink mySecondDrink = new Coffee("Latte Macchiato");
        mySecondDrink.addMilk();
        mySecondDrink.addMilk();
        mySecondDrink.addSugar();
        mySecondDrink.addSugar();
        /*
         * The total Condiments in this case will be 4.
         * */
        System.out.println("The drink "+mySecondDrink.drinkType+" has "+mySecondDrink.getTotalMilkUnit()+" Milk Units"
                +" and "+mySecondDrink.getTotalSugarUnit()+" Sugar Units. Total "
                +mySecondDrink.getTotalNumberOfCondiments() +" Condiments");
        Drink myTea = new Tea("Green Tea");
        myTea.addMilk();
        myTea.addMilk();
        myTea.addMilk();
        myTea.addMilk();
        myTea.addMilk();
        myTea.addMilk();
        myTea.addSugar();
        myTea.addSugar();
        myTea.addSugar();
        myTea.addSugar();
        myTea.addSugar();
        /*
         * The total Condiments in this case will be 6 instead of 8 as we have a limit of 3 Units.
         * */
        System.out.println("The drink "+myTea.drinkType+" has "+myTea.getTotalMilkUnit()+" Milk Units"
                +" and "+myTea.getTotalSugarUnit()+" Sugar Units. Total "
                +myTea.getTotalNumberOfCondiments() +" Condiments");


    }
}
