package flowcontrol.iternation.transferstatements;


// continue, used in loop and after continue nothing will execute and loop will go to increment decrement part

// continue can be used only inside loop and nowhere else
// continue when encountered will stop the current iteration and will start next iteration from start


// labeled break and continue

// in a nested loop we can add label as well to continue to a particular loop, other wise continue will work only on the lopp in which it is

// continue can not be used in switchs


public class ReturnBreakContinueTryCatchFinally {

    public static void main(String[] args) {

        int x = 10;

        for (int i = 0;i<=x;i++) {

            if (i % 2 == 0) continue;
            System.out.println(i);

        }

     l1:   for (int i = 0;i<3;i++) {
         l2:   for (int j = 0;j<3;j++) {

                if(i==j)continue l1; // this will continue on the first loop
             // if label is not used, it will continue on the inner loop only
                System.out.println(i + " : " + j);
            }
        }

        l1:   for (int i = 0;i<3;i++) {
            l2:   for (int j = 0;j<3;j++) {

                if(i==j)break l1; // this will break out the first loop
                // if label is not used, it will break on the inner loop only
                System.out.println(i + " : " + j);
            }
        }


        int k = 10;

        do{
            k = k+10;
            if(k==20)continue;
            System.out.println(k);
        } while(k<10);


        for (int i = 0;i<10;i++) {
            switch (k) {

                case 20:
                    System.out.println("hello");
                    continue;
                case 21:
                    System.out.println("hello");
            }
        }

    }
}
