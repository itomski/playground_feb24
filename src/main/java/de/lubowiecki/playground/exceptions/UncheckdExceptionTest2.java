package de.lubowiecki.playground.exceptions;

public class UncheckdExceptionTest2 {
    private int zahl = 60;

    public static void main(String[] args) {
        System.out.println("main: start");
        UncheckdExceptionTest2 uet2 = new UncheckdExceptionTest2();
        try {
            uet2.doSomething1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main: end");
    }

    private void doSomething1() {
        System.out.println("doSomething1: start");
        doSomething2();
        System.out.println("doSomething1: end");
    }

    private void doSomething2() {
        System.out.println("doSomething2: start");
        doSomething3();
        System.out.println("doSomething2: end");
    }

    private void doSomething3() {
        System.out.println("doSomething3: start");
        doSomething4();
        System.out.println("doSomething3: end");
    }

    private void doSomething4() {
        System.out.println("doSomething4: start");
        if(zahl < 100) {
            throw new RuntimeException("Ein Problem"); // Uncheckd Exception wird geworfen
        }
        System.out.println("doSomething4: end");
    }
}
