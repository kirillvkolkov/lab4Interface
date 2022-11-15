package ru.interfaceDefinition.Classes;

import ru.interfaceDefinition.Interfaces.ICollection;

import java.util.Arrays;
import java.util.Random;

public class IntegerCollection implements ICollection {
    private int[] integerArray = new int[1024];

    public static byte booleanToByte(boolean b) {
        return b ? (byte) 1 : 0;
    }

    public IntegerCollection() {
        for (int i = 0; i < integerArray.length; i++) {
            Random random = new Random();
            integerArray[i] = booleanToByte(random.nextBoolean());
        }
    }

    @Override
    public boolean checkElement(int index) {
        if (index < 0 || index > 1024) {
            throw new IllegalArgumentException();
        } else {
            return true ? integerArray[index] == 1 : false;
        }
    }

    @Override
    public void setTrue(int index) {
        if (index < 0 || index > 1024) {
            throw new IllegalArgumentException();
        } else {
            integerArray[index] = (byte) 1;
        }
    }

    @Override
    public void setTrueOrFalse(int index, boolean trueOrFalse) {
        if (index < 0 || index > 1024) {
            throw new IllegalArgumentException();
        } else {
             if (trueOrFalse == true) {
                 integerArray[index] = (byte) 1;
             } else {
                 integerArray[index] = (byte) 0;
             }
        }
    }

    @Override
    public void setFalse(int index) {
        if (index < 0 || index > 1024) {
            throw new IllegalArgumentException();
        } else {
            integerArray[index] = (byte) 0;
        }
    }

    @Override
    public void invertElement(int index) {
        if (index < 0 || index > 1024) {
            throw new IllegalArgumentException();
        } else {
            if (integerArray[index] == 1) {
                integerArray[index] = 0;
            } else {
                integerArray[index] = 1;
            }
        }
    }

    @Override
    public int ifTrueElementsCount() {
        int counter = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == 1) {
                counter += 1;
            }
        }
        return counter;
    }
}
