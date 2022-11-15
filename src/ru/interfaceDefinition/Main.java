package ru.interfaceDefinition;

import ru.interfaceDefinition.Classes.BooleanCollection;
import ru.interfaceDefinition.Classes.IntegerCollection;
import ru.interfaceDefinition.Interfaces.ICollection;

public class Main {
    public static void main(String[] args) {
        ICollection booleanCollection = new BooleanCollection();
        System.out.println(booleanCollection.checkElement(3));
        booleanCollection.setTrue(3);
        System.out.println(booleanCollection.checkElement(3));
        booleanCollection.setFalse(8);
        System.out.println(booleanCollection.checkElement(8));
        booleanCollection.setTrueOrFalse(1011, false);
        System.out.println(booleanCollection.checkElement(1011));
        booleanCollection.invertElement(14);
        System.out.println(booleanCollection.ifTrueElementsCount());

        System.out.println("-------------------------------\n");
        IntegerCollection integerCollection = new IntegerCollection();
        System.out.println(integerCollection.checkElement(4));
        integerCollection.setTrue(3);
        System.out.println(integerCollection.checkElement(3));
        integerCollection.setFalse(8);
        System.out.println(integerCollection.checkElement(8));
        integerCollection.setTrueOrFalse(8, true);
        System.out.println(integerCollection.checkElement(8));
        System.out.println(booleanCollection.ifTrueElementsCount());
    }
}