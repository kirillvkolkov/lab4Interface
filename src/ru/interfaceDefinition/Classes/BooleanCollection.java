package ru.interfaceDefinition.Classes;

import ru.interfaceDefinition.Interfaces.ICollection;

import java.util.Arrays;
import java.util.Random;

public class BooleanCollection implements ICollection {

    private boolean[] booleanArray = new boolean[1024];

    public BooleanCollection() {
        for (int i = 0; i < booleanArray.length; i++) {
            Random random = new Random();
            booleanArray[i] = random.nextBoolean();
        }
    }

    @Override
    public boolean checkElement(int index) {
        if (index < 0 || index > 1024) {
            throw new IllegalArgumentException();
        } else {
            return booleanArray[index];
        }
    }

    @Override
    public void setTrue(int index) {
        if (index < 0 || index > 1024) {
            throw new IllegalArgumentException();
        } else {
            booleanArray[index] = true;
        }
    }

    @Override
    public void setTrueOrFalse(int index, boolean trueOrFalse) {
        if (index < 0 || index > 1024) {
            throw new IllegalArgumentException();
        } else {
            booleanArray[index] = trueOrFalse;
        }
    }

    @Override
    public void setFalse(int index) {
        if (index < 0 || index > 1024) {
            throw new IllegalArgumentException();
        } else {
            booleanArray[index] = false;
        }
    }

    @Override
    public void invertElement(int index) {
        if (index < 0 || index > 1024) {
            throw new IllegalArgumentException();
        } else {
            if (booleanArray[index] == true) {
                booleanArray[index] = false;
            } else {
                booleanArray[index] = true;
            }
        }
    }

    @Override
    public int ifTrueElementsCount() {
        int counter = 0;
        for (int i = 0; i < booleanArray.length; i++) {
            if (booleanArray[i] == true) {
                counter += 1;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        String[] zeroAndOnes = new String[1024];
        for (int i = 0; i < booleanArray.length; i++) {
            if(booleanArray[i] == true) {
                zeroAndOnes[i] = "1";
            } else {
                zeroAndOnes[i] = "0";
            }
        }
        return Arrays.toString(zeroAndOnes);
    }
}
