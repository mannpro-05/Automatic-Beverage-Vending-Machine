package com.bu.met665.Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    @org.junit.jupiter.api.Test
    void getTotalNumberOfCondiments() {
        Drink myDrink = new Coffee("Latte Macchiato");
        // add 2 unit Milk
        myDrink.addMilk () ;
        myDrink.addMilk () ;
        myDrink.addMilk () ;
        myDrink.addMilk () ;
        // add 1 unit sugar
        myDrink.addSugar () ;
        // Now , we check the total number of condiments in this drink .
        // We added 4 milk but only 3 should be accepted and added
        // And one sugar so the total is 4 and not 5 condiment units .
        assertEquals (myDrink.getTotalNumberOfCondiments() , 4) ;
        Drink myDrink2 = new Coffee("Latte Macchiato");
        // add 2 unit Milk
        myDrink2.addMilk() ;
        myDrink2.addMilk() ;
        myDrink2.addMilk() ;
        myDrink2.addMilk() ;
        // add 1 unit sugar
        myDrink2.addSugar() ;
        // Now , we check the total number of condiments in this drink .
        // We added 4 milk but only 3 should be accepted and added
        // And one sugar so the total is 4 and not 5 condiment units .
        assertEquals(myDrink2.getTotalNumberOfCondiments() , 4) ;
    }


    @Test
    void testGetTotalNumberOfCondiments() {

            Drink myDrink = new Coffee("Latte Macchiato");
            // add 2 unit Milk
            myDrink.addMilk () ;
            myDrink.addMilk () ;
            myDrink.addMilk () ;
            myDrink.addMilk () ;
            // add 1 unit sugar
            myDrink.addSugar () ;
            // Now , we check the total number of condiments in this drink .
            // We added 4 milk but only 3 should be accepted and added
            // And one sugar so the total is 4 and not 5 condiment units .
            assertEquals (myDrink.getTotalNumberOfCondiments() , 4) ;
            Drink myDrink2 = new Coffee("Latte Macchiato");
            // add 2 unit Milk
            myDrink2.addMilk() ;
            myDrink2.addMilk() ;
            myDrink2.addMilk() ;
            myDrink2.addMilk() ;
            // add 1 unit sugar
            myDrink2.addSugar() ;
            // Now , we check the total number of condiments in this drink .
            // We added 4 milk but only 3 should be accepted and added
            // And one sugar so the total is 4 and not 5 condiment units .
            assertEquals(myDrink2.getTotalNumberOfCondiments() , 4) ;
    }


    @Test
    void getTotalSugarUnit() {
        Drink myDrink = new Coffee("Latte Macchiato");
        // add 2 unit Milk
        myDrink.addMilk () ;
        myDrink.addMilk () ;
        myDrink.addMilk () ;
        myDrink.addMilk () ;
        // add 1 unit sugar
        myDrink.addSugar () ;
        // Now , we check the total number of condiments in this drink .
        // We added 4 milk but only 3 should be accepted and added
        // And one sugar so the total is 4 and not 5 condiment units .
        assertEquals (myDrink.getTotalNumberOfCondiments() , 4) ;
        Drink myDrink2 = new Coffee("Latte Macchiato");
        // add 2 unit Milk
        myDrink2.addMilk() ;
        myDrink2.addMilk() ;
        myDrink2.addMilk() ;
        myDrink2.addMilk() ;
        // add 1 unit sugar
        myDrink2.addSugar() ;
        // Now , we check the total number of condiments in this drink .
        // We added 4 milk but only 3 should be accepted and added
        // And one sugar so the total is 4 and not 5 condiment units .
        assertEquals(myDrink2.getTotalNumberOfCondiments() , 4) ;
    }
}