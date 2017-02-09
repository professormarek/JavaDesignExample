/**
 * Created by teaching on 2017-02-09.
 */
public class TemperatureSample extends Sample {
    /*
    fields
     */
    double temperature;

    /*
    constructors (constructor has to be the name of the class!)
    the pattern in Java is to accept all the information needed by this class and any of its ancestor classes
    because TempreatureSample extends Sample it has a long id, a String description AND a double temperature
     */
    TemperatureSample(double temp, long id, String description){
        //pass the data to the super-class by calling it's constructor using the "super" keyword
        //fyi any calls to super-class constructors have to be on the first line
        super(id, description);
        temperature = temp;
    }

    /*
    methods
     */

    public String toString(){
        //super.toString() calls the toString() implementation in Sample
        return "Temperature " + temperature + " " + super.toString();
    }

}
