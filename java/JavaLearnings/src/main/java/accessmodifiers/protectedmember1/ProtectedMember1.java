package accessmodifiers.protectedmember1;

import accessmodifiers.protectedmembers.ProtectedClass;

public class ProtectedMember1 {

    public static void main(String[] args) {

        // public class of outside package, accessible via import
        ProtectedClass pc = new ProtectedClass();

        pc.m3(); // only public member is accessible outside package in non child class
    }
}

class ProtectedMember2 extends ProtectedClass{

    public static void main(String[] args) {

        ProtectedClass pc = new ProtectedClass();
        ProtectedMember2 pc2 = new ProtectedMember2();
        ProtectedClass pc3 = new ProtectedMember2();

        pc.m3(); // only public is accessible outside package with parent reference
        pc3.m3(); // only public is accessible outside package with parent reference
        pc2.m1(); // protected is accessible outside package with child class reference inside child class
        pc2.m3();




    }


}

class ProtectedMember3 extends ProtectedMember2 {

    public static void main(String[] args) {

        ProtectedMember3 pm3 = new ProtectedMember3();
        pm3.m1(); // in subchild class also protected method of parent of parent is available via current child class
        pm3.m3();


        ProtectedMember2 pc2 = new ProtectedMember2();
     //   pc2.m1() // only current child will have access to protected not in between child


    }
}