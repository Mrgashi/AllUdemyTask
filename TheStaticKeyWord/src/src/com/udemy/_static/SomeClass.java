package src.com.udemy._static;

public class SomeClass {

    private static int classCounter = 0;
    // instancenumber should not be changed manually but only when we instansiate a new class of SomeClass.
    public final int instancenNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        // increas the instancenumber with classcounter. Each instance will increment classcounter and saved into instance
        instancenNumber = classCounter;
        System.out.println(name + " created, instance number: " + instancenNumber);
    }

    public int getInstancenNumber() {
        return instancenNumber;
    }
}
