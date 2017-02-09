/**
 * Created by teaching on 2017-02-09.
 */
public class MainApplication {
    public static void main(String[] args) {

        //create an instance of Sample using the default constructor
        Sample sample1 = new Sample();
        //display sample1
        System.out.println("Printing out Sample 1 " + sample1.toString());
        //create an instance of Sample using the two-argument constructor
        Sample sample2 = new Sample(1234, "today's temperature");
        //display sample2
        System.out.println("Printing out sample 2 " + sample2.toString());

        //create a TempeartureSample instance
        TemperatureSample ts = new TemperatureSample(-1.5, 9999, "tomorrow's temperature");
        System.out.println("TemperatureSample: " + ts.toString());


    }
}
