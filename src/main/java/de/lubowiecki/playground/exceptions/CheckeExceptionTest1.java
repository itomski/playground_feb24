package de.lubowiecki.playground.exceptions;

public class CheckeExceptionTest1 {

    private int zahl = 60;

    public static void main(String[] args) {
        System.out.println("main: start");
        CheckeExceptionTest1 cet1 = new CheckeExceptionTest1();
        try {
            cet1.doSomething1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main: end");
    }

    private void doSomething1() throws Exception {
        System.out.println("doSomething1: start");
        doSomething2();
        System.out.println("doSomething1: end");
    }

    private void doSomething2() throws Exception {
        System.out.println("doSomething2: start");
        doSomething3();
        System.out.println("doSomething2: end");
    }

    private void doSomething3() throws Exception {
        System.out.println("doSomething3: start");
        doSomething4();
        System.out.println("doSomething3: end");
    }

    private void doSomething4() throws Exception {
        System.out.println("doSomething4: start");
        if(zahl < 100) {
            throw new Exception("Ein Problem"); // Exception wird geworfen
        }
        System.out.println("doSomething4: end");
    }
}
