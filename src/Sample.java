/**
 * This class describes a sample of.. something
 */
public class Sample {
    /*
    fields : should almost always be private
     */
    private long id;
    private String description;
    /*
    constructors - methods to initalize instances of this class
     */
    Sample(){
        //leave this empty...
    }

    Sample(long myid, String description){
        id = myid; //in this case we don't need to use "this" because the variable names are different
        this.description = description; //here, the local variable "description" hides the instance variable
        //so we use "this" to disambiguate which one we're talking about
    }

    /*
    methods
    recall @Override is an annotation for documentation purposes
     */
    @Override
    public String toString(){
        return "Sample ID: " + id + " Sample description: "+ description;
    }

}
