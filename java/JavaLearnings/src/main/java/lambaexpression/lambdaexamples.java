package lambaexpression;

interface MyInterface111 {

    int square(int x, int y);
}

public class lambdaexamples {


    public static void main(String[] args) {
        
        MyInterface111 mi  = new MyInterface111() {

           public int square(int x, int y) {

                return x*y;
            }
            
        };

        System.out.println(mi.square(2, 3));
        

    }

    


    
}

