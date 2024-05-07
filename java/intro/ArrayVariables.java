package intro;

class ArrayVariables {
    

    public static void main(java.lang.String[] args) {


        int[] a = {1,2,3};

        int[] b = a; //allowed 

        char[] ch = {'1', '2', 3};

       // int[] c = ch; can not convert char[] to int[]

       // but in case of objects it is possible

      
       java.lang.String s11[] = {"!2", "!@3", "!23"};

       // this is valid as any derived type can be promotoed to child type
       Object[] arr = s11;

       Object[] a11 = new String[10];

      //  a11[0] = new Object(); // this is fine for compiler but jvm will always consider run time object, since
      // run time object is String, you can not pass object to it, so Array Store Exception will come




    }

}