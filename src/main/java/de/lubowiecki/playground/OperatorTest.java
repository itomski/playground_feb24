package de.lubowiecki.playground;

public class OperatorTest {

    public static void main(String[] args) {

        System.out.println(10 + 5 - 7); //gleiche Wertigkeit daher von links nach rechts
        System.out.println(10 + 5 * 7); // * hat höhere Wertigkeit, danach +
        System.out.println(5 % 3 * 10); //gleiche Wertigkeit daher von links nach rechts
        System.out.println(10 * 5 % 3); //gleiche Wertigkeit daher von links nach rechts


    }
}
