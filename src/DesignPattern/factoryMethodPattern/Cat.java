package DesignPattern.factoryMethodPattern;

public class Cat extends Animal{

    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
