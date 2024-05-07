package intro;

class String {


    // if we use String as class name, then it will give error main not found, as main method argument will use our class String instead of java.lang.String
    // hence main with lang string is not found
   

    // this main method is not using java.lang.string, instead it is using our class String
    public static void main(String args[]) {


        int _1 = 10;

        System.out.println(_1);

        int String = 10;

        System.out.println(String);


        
    }

    // this is correct
    public static void main(java.lang.String args[]) {


        int _1 = 10;

        System.out.println(_1);

        int String = 10;

        System.out.println(String);


        
    }
}

