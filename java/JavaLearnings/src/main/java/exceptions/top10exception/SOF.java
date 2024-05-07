package exceptions.top10exception;

/*

Error - > VM Error -> StackOverFlowError, OutOfMemoryError

all are unchecked exception


stack overflow error is child class of virtual machine error

e.g. is recursive method calls, e.g. m1 calls m2 and m2 calls m1, this will never end and will full the stack in some time


StackOverFlowError  exception

 */

public class SOF {

    public static void main(String[] args) {

        SOF sof = new SOF();
        sof.m1();


    }

    public void m1() {

        m2();
    }

    public void m2() {

        m1();
    }
}
