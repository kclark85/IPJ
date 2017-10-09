import java.util.Random;


public class Histogram {
    private final double[] freq;   // freq[i] = # occurences of value i
    private double max;            // max frequency of any value
    private double min;
    private int intervalSize;
    private int numIntervals; //x1
    private int highestFrequency; //y1

    // Create a new histogram. 
    private Histogram(int n, double min, double max) {
        this.numIntervals = n;
        this.min = min;
        this.max = max;
        this.freq = new double[n];
        this.intervalSize = (int)((max - min)/numIntervals);


    }

    // Add one occurrence of the value i. 
    private void addDataPoint(double num) {


        if (num >= min && num < max) {
            int interval = calculateInterval(num);
            freq[interval]++;

            if (freq[interval] > highestFrequency) {
                highestFrequency = (int)freq[interval];
            }
        }

    }

    private int calculateInterval(double n){
        int returnVal;
        returnVal = (int)((n-min)/this.intervalSize);
        if (returnVal < 0){
            returnVal = 0;
        }

        if (returnVal >= numIntervals) {
            returnVal = numIntervals - 1;
        }
        return returnVal;
    }



    // draw (and scale) the histogram.
    private void draw() {
        StdDraw.setYscale(0, highestFrequency +1);  // to leave a little border
        StdStats.plotBars(freq);

    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);


        // create the histogram
        Histogram histogram = new Histogram(n, min, max);
        Random r = new Random();
        //create 40 random mumbers between min and max
        double d;

        for (int i = 0; i < 40; i++){
             d = min + r.nextDouble() * max-1;
            System.out.println(d);
            histogram.addDataPoint(d);
        }

        

        // display using standard draw

        StdDraw.setCanvasSize(500, 100);
        histogram.draw();

    }
} 

