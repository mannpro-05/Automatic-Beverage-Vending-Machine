package com.bu.met665.Main;


/*
 * This class inherits the Drink class and overrides 2 of its methods.
 * This class is responsible for making the coffee for the user.
 * It adds the Condiments for the user.
 * */
public class Coffee extends Drink {
    private int totalMilk, totalSugar;

    enum types {
        AMERICANO,
        MACHIATO,
        ESPRESSO
    }

    /*
     * This Constructor will initialize the class variables.
     * It will also set the drink type.
     * */
    public Coffee(String type) {
        this.totalMilk = 0;
        this.totalSugar = 0;
        this.drinkType = type;
    }
    /*
     * This method will get the total milk units in the coffee and will determine if more could be added.
     * If more could be added then it will add it and update the total Condiments in the coffee.
     * */
    @Override
    public void addMilk() {
        super.addMilk();
        this.totalMilk = getTotalMilkUnit();
        if (totalMilk < 3) {
            this.totalMilk++;
            setTotalMilkUnit(this.totalMilk);
            setTotalNumberOfCondiments(1);
        }
    }
    /*
     * This method will get the total sugar units in the coffee and will determine if more could be added.
     * If more could be added then it will add it and update the total Condiments in the coffee.
     * */
    @Override
    public void addSugar() {
        super.addSugar();
        this.totalSugar = getTotalSugarUnit();
        if (totalSugar < 3) {
            this.totalSugar++;
            setTotalSugarUnit(this.totalSugar);
            setTotalNumberOfCondiments(1);
        }
    }

}
