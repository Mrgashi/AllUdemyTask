package src.com.udemy._static;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //    StaticTest firstInstance = new StaticTest("First Instance");
        //    System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        //    StaticTest secondInstance = new StaticTest("Second Instance");
        //    System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        //    StaticTest thirdInstance = new StaticTest("Third Instance");
        //    System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        //    Car firstCar = new Car("BMW");
        //    System.out.println(firstCar.getName() + " first instance of car " + Car.getNumberOfCars());

        //    Car secondCar = new Car("Tesla");
        //    System.out.println(secondCar.getName() + " second instance of car " + Car.getNumberOfCars());


//     SomeClass one = new SomeClass("One");
//     SomeClass two = new SomeClass("Two");
//     SomeClass three = new SomeClass("Three");

//     System.out.println(one.getInstancenNumber());
//     System.out.println(two.getInstancenNumber());
//     System.out.println(three.getInstancenNumber());

//     //one.instancenNumber = 4;
//     System.out.println(Math.PI);

//     int pw = 583582;
//     Password password = new ExtendedPassword(pw);
//     password.storePasword();
//     password.letMeInn(30928);
//     password.letMeInn(3988757);
//     password.letMeInn(19282);
//     password.letMeInn(583582);

        System.out.println("Main method called");
        SIBTest sibTest = new SIBTest();
        sibTest.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}
