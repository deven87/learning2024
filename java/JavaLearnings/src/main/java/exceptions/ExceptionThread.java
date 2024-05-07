package exceptions;

public class ExceptionThread {

    public static void main(String[] args) {

        ExceptionThread et = new ExceptionThread();

        et.m1();
    }

    public void m1(){

        m2();
    }

    public void m2() {

        m3();
    }

    public void m3() {

        System.out.println(10/0);
    }


}
