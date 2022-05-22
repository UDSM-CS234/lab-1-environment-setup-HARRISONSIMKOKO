public class Gravity {

        public static void main (String []args){
            double gravity = 9.81;
            double initialvelocity =0.0;
            double fallingtime =10.0;
            double initialposition = 0.0;
            double finalposition ;
            finalposition =0.5 * gravity * fallingtime +initialvelocity* fallingtime +initialposition;
            System.out.println("The new postion of the object after\t" +fallingtime +"seconds is \t"+finalposition+"m");
        }
    }


