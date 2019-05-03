// Implementing Polymorphism using function overloading and overriding

package com.stackroute.polymorphism;

 class Car {
     boolean engine;
     int numberofCylinders;
     String name;
     int wheels;

     // Parameterised Constructors

     public Car(int numberofCylinders, String name) {
         this.numberofCylinders = numberofCylinders;
         this.name = name;
     }


     // Non - parameterised constructor

     public Car() {
         this.wheels = 4;
         this.engine = true;
     }

     //Getters
     public boolean getEngine() {
         return engine;
     }

     public int getWheels() {
         return wheels;
     }




     public void startEngine() {
         System.out.println("Car : Engine Starts in 5 seconds...");
     }

     // accelerate function w/o parameters

     public void accelerate() {
         System.out.println("Car : Maximum acceleration speed is 100 kmph");

     }

     // accelerate function with one parameters

     public void accelerate(int speed) {
         System.out.println("Car (with parameters) : Maximum acceleration speed is "+speed+" kmph");

     }
 }

      class Audi extends Car {


          // Constructor

         public void startEngine() {
             System.out.println("Audi : Engine Starts in 1 seconds...");
         }

          // accelerate function w/o parameters
          public void accelerate() {
              System.out.println("Audi : Maximum acceleration speed is 500 kmph");

          }
          // accelerate function with one parameters

          public void accelerate(int speed) {
              System.out.println("Audi (with parameters) : Maximum acceleration speed is "+speed+" kmph");
          }

          }



class Maruti extends Car {


    // Constructor

    public void startEngine() {
        System.out.println("Maruti : Engine Starts in 3 seconds...");
    }

    // accelerate function w/o parameters
    public void accelerate() {
        System.out.println("Maruti : Maximum acceleration speed is 300 kmph");

    }

    // accelerate function with one parameters
    public void accelerate(int speed) {
        System.out.println("Maruti (with parameters) : Maximum acceleration speed is "+speed+" kmph");
    }

}


class Bmw extends Car {


    // Constructor

    public void startEngine() {
        System.out.println("BMW : Engine Starts in .5 seconds...");
    }
// accelerate function w/o parameters
    public void accelerate() {
        System.out.println("BMW : Maximum acceleration speed is 800 kmph");

    }

    // accelerate function with one parameters

    public void accelerate(int speed) {
        System.out.println("BMW (with parameters) : Maximum acceleration speed is "+speed+" kmph");
    }

}


public class CarDemo {
         public static void main(String[] args) {

             Car car = new Car(2,"car");
             car.startEngine();
             car.accelerate();
             //Overloading methods
             car.accelerate(200);

             System.out.println("\n");

             //Overriding base class methods
             Car carMaruti = new Maruti();
             carMaruti.startEngine();
             carMaruti.accelerate();
             carMaruti.accelerate(500);

             System.out.println("\n");


             //Overriding base class methods
             Car carAudi = new Audi();
             carAudi.startEngine();
             carAudi.accelerate();
             carAudi.accelerate(700);



             System.out.println("\n");

             //Overriding base class methods
             Car carBmw = new Bmw();
             carBmw.startEngine();
             carBmw.accelerate();
             carBmw.accelerate(1000);


         }
     }

