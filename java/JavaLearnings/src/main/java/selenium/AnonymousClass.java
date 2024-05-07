package selenium;

public class AnonymousClass {

    ABC abc = new ABC(){

        @Override
        void eat() {
            super.eat();
        }
    }
;

}

class ABC {

    void eat() {
        System.out.println("Eat");
    }
}
