package exceptions;

/*
finally block wont execute if we are using system.exit

as this cause the jvm to shut down so finally wont execute


 */

public class SystemExit {

    public static void main(String[] args) {


        try {

            System.out.println("1");

            System.exit(0);
            System.out.println("2");
        }
        finally{
            System.out.println("3");
        }

    }
}
