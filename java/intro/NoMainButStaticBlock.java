package intro;

public class NoMainButStaticBlock {

    static {

        System.out.println("my static block3");
    }

    static {

        System.out.println("my static block2");
    }

    public static void main(java.lang.String[] args) {


    }


    static {

        System.out.println("my static block1");
    }
    
}
