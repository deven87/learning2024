package intro;

class LVTI {


    public static void main(java.lang.String[] args) {


        // avaiable from java 10

        // since this is annonumous array so no need to give data type of variable instead we can give var 
        // type will be determined automatically based on value
       
       
        var x = new int[]{1,2,3,4};

        var y  = 12;

       // var z = {1,2,3,4}; // not allowed

        System.out.println(x);
        System.out.println(y);

        System.out.println(x.getClass().getName());


        java.lang.String x1 = "As";

        // lvti
        var x2 = "As";

        // compiler an identify from the value being used, what type of variable var will be



        var z1 = new int[]{1,2,3};

        for(var z11:z1){

            System.out.println(z11);
        }

       //    var z23; // not allowed without initilization

      // var z23 = null; var can be initialized with null because null can be String, Object, Stringbuffer, StringBuilder

      var z23 = 100;

      // z23 = 100.0; // not allowed as var is only converted by compiler as int type


      // below is allowed because first var will be replaced with int by compiler

      var var = 100;

      System.out.println(var);









    }

}