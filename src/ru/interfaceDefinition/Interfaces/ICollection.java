package ru.interfaceDefinition.Interfaces;

public interface ICollection {
    boolean checkElement(int index);
    void setTrue(int index);
    void setTrueOrFalse(int index, boolean trueOrFalse);
    void setFalse(int index);
    void invertElement(int index);
    int ifTrueElementsCount();
    String toString();
}
