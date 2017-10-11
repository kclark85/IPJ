import java.util.concurrent.ThreadLocalRandom; //subclass of Random

public class Circles {
    public static void main(String[]args)
    {

        int number = Integer.parseInt(args[0]);
        System.out.println("The desired number of circles is " + number );
        double black = Double.parseDouble(args[1]);
        System.out.println("Their likelihood to be black is " + black*100 + "%");
        double minR = Double.parseDouble(args[2]);
        System.out.println("Minimum radius is " + minR);
        double maxR = Double.parseDouble(args[3]);
        System.out.println("Maximum radius is " + maxR);
        double radiusRange;


            double r = ThreadLocalRandom.current().nextDouble(minR,maxR); //generates a double value between minR and maxR and assigns it to r, each loop
            double blacknum = black*number; //the number of black circles (blacknum) equals the probability times the desired number.
            for( int j = 0; j < blacknum; j++)
            {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledCircle(Math.random(), Math.random(), r );

//                System.out.println((blacknum) + "," + j);
            }
                for(int i = 0; i <= number-blacknum; i++)
                {
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.filledCircle(Math.random(), Math.random(), r );
//                    System.out.println((number-blacknum) + "," + i);


                }
    }


}
