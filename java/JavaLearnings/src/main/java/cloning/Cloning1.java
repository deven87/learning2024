package cloning;

public class Cloning1 {

    public static void main(String[] args) {

        int[][] x = new int[][]{{1,2,3},{4,5,6}};

        // shallow cloning as x contains referene variable only
        int[][] y = x.clone();

        y[0][0] = 50;
        System.out.println(x[0][0]);

        // deep cloning as x[0] contains primitive values only, so in case of primitive values we know the deep cloning is done
        int[] z = x[0].clone();

        z[0] = 100;

        // still it will be old value only as z[0] is totally separate
        System.out.println(x[0][0]);


      //  x and y both are different reference variables
        System.out.println(x==y); //false

        // here x[0] is reference variable and shallow cloning was done so it will be same as y[0]
        System.out.println(x[0]==y[0]); //true


        // here x[1] is reference variable and shallow cloning was done so it will be same as y[1]
        System.out.println(x[1]==y[1]); //true

        // deep cloning so separate copy of object was creating during .clone
        System.out.println(x[0]==z); //false

        System.out.println(x.equals(y)); // in array equals method is not overloaded so its for reference compare only

        // false


        System.out.println(x[0].equals(y[0])); // true as reference is same

        System.out.println(x[1].equals(y[1])); // true as reference is same


        int[][] x1 = new int[][]{{1,2,3},{4,5,6}};

        int[][] y1 = x1.clone();

        System.out.println(x1.equals(y1)); // false, address is different
        System.out.println(x1 == y1); //false add is different

        // since shallow cloning was done and x[1] and x[0] are references, same copy is used

        System.out.println(x1[0].equals(y1[0])); // true, address is same
        System.out.println(x1[0] == y1[0]); //true add is same

        System.out.println(x1[1].equals(y1[1])); // true, address is same
        System.out.println(x1[1] == y1[1]); //true add is different

        x1[0] = new int[]{10,20,30};


        // since x[0] is now a new object so x[0] and y[0] are different but x[1] still points to same old object as y[1]

        System.out.println(x1[0].equals(y1[0])); // false, address is different
        System.out.println(x1[0] == y1[0]); //false add is different

        System.out.println(x1[1].equals(y1[1])); // true, address is same
        System.out.println(x1[1] == y1[1]); //true add is different



    }
}
