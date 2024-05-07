package intro;

class Intro {

    static {

        System.out.println("class intro static block");
    }

    public static void main(java.lang.String args[]) {


        System.out.println("hello");

        One one = new One();

        Two two = new Two();





        
    }
}


class One {

    static {

        System.out.println("class one static block");
    }


}

class Two {

      static {

        System.out.println("class two static block");
    }

}