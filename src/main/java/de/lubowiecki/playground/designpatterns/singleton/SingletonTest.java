package de.lubowiecki.playground.designpatterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        //EagerSigleton es = new EagerSigleton();
        EagerSigleton es1 = EagerSigleton.getInstance();
        EagerSigleton es2 = EagerSigleton.getInstance();
        EagerSigleton es3 = EagerSigleton.getInstance();

        System.out.println(es1 == es2);
        System.out.println(es2 == es3);
        System.out.println(es1 == es3);

        es1.setZahl(100);
        System.out.println(es2.getZahl());
        es3.setZahl(200);
        System.out.println(es1.getZahl());

        showInstance();


        EnumSingleton.INSTANCE.setZahl(500);
        System.out.println(EnumSingleton.INSTANCE.getZahl());

    }

    static void showInstance() {

        // Singletons müssen nicht als Parameter an Methoden weitergegeben werden
        // da sie über die Statische Methode des Singletons immer geholt werden können

        System.out.println(EagerSigleton.getInstance().getZahl());
    }
}
