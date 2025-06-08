package io.javabrains.javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/*
Write code that calls the getFruits method and then iterates over the collection, printing each element to console
 */

public class IteratorExercise {

    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits();
        // Iterate over the collection and print each fruit

        // Using Iterator to iterate over the collection
        System.out.println("Print Fruits using Iterator pattern start time:"+ new Date().getTime());
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Fruit String=  "+fruit);
        }
        System.out.println("Print Fruits using Iterator pattern end time:"+ new Date().getTime());

        // Using enhanced for loop to iterate over the collection
        System.out.println("Using enhanced for loop to iterate over the collection start time:"+ new Date().getTime());
        for (String fruit : fruits) {
            System.out.println("Fruit String=  "+fruit);
        }
        System.out.println("Using enhanced for loop to iterate over the collection end time:"+ new Date().getTime());
    }

}


class FruitSupplier {
    public Collection<String> getFruits() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

}