package de.lubowiecki.playground.vererbung;

public class DefaultMethodTest {

    public static void main(String[] args) {

    }
}

interface RandomRoll {

    public default int roll() { // Default Methoden gibt es nur in Interfaces
        return (int)(Math.random() * 6) + 1;
    }

    public default int[] roll(int num) {
        int[] rolls = new int[num];
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = roll();
        }
        return rolls;
    }

    void stats(int[] arr);
}

class W6Dice implements RandomRoll {

    @Override
    public void stats(int[] arr) {

    }

    // Es kann die default Implementierung verwendet werden, oder die Methoden können überschrieben werden
}


