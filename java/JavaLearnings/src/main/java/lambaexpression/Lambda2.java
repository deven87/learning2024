package lambaexpression;

public class Lambda2 {

    public static void main(String[] args) {

        Q q = x->x*x; // here it is not allowed as there are 2 methods in interface
        // and it is not clear x belongs to which one
    }
}


interface Q {

     int squareIt(int x) ;

   default int tripleIt(int x) {
       return x;
   };

    static int tripleItIt(int x) {
        return x;
    };


}