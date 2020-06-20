class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot Here";
    }

    public String length() {
        return "Not given";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independenc Day");
    }

    public String plot() {
        return "Aliens atempt to take over Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String length() {
        return "1.4h";
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class Starwars extends Movie {
    public Starwars() {
        super("Starwars");
    }

    @Override
    public String length() {
        return "2.5h";
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot
}

class Car {
    private String name;
    private String enigne;
    private int cylinders;
    private int weels;
    private int doors;

    public Car(String enigne, int doors, String name) {
        this.name = name;
        this.enigne = enigne;
        this.cylinders = 4;
        this.weels = 4;
        this.doors = doors;
    }

    public String startEngine() {
        return "Engine Starting!";
    }

    public String accelerate() {
        return "Car accelerating";
    }

    public String breaking() {
        return "Car BREAKING!";
    }

    public String getName() {
        return name;
    }

    public String getEnigne() {
        return enigne;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWeels() {
        return weels;
    }

    public int getDoors() {
        return doors;
    }
}

class Audi extends Car {
    public Audi() {
        super("V8", 4, "Audi");
    }


    @Override
    public String startEngine() {
        return "Audi starts instantly and smoothly!";
    }

    @Override
    public String accelerate() {
        return this.getEnigne() + " makes the Car go fast";
    }

    @Override
    public String breaking() {
        return "Breaking the Audi down";
    }
}

class Tesla extends Car {
    public Tesla () {
        super("Electric", 5, "Tesla S");
    }

    @Override
    public String startEngine() {
        return "Hamsters start runnint";
    }

    @Override
    public String accelerate() {
        return "Power from Hamsters move to weels";
    }

    @Override
    public String breaking() {
         return "Tesla uses it regenerative breaks to slow down the car";
    }
}

class Benz extends Car {
    public Benz() {
       super("24v", 3, "Benz");
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String breaking() {
        return super.breaking();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            assert movie != null;
            System.out.println("Moive#" + i + ":" + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n" + "Time: " + movie.length() + "\n");
        }

        for (int i = 1; i < 5; i++) {
            Car car = randomCar();
            assert car !=null;
            System.out.println("Car#" + i + ":" + car.getName() + "\n" + "engine: " + car.accelerate() + "\n" + "Start engine: " + car.startEngine() + "\n" +
                    car.breaking() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("RandomNumber generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
    public static Car randomCar () {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("RandomNumber generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Audi();
            case 2:
                return new Tesla();
            case 3:
                return new Benz();
        }
        return null;
     }
}
