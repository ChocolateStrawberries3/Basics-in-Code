public class Triangle {
    //static variables
    static int numOfSides = 3;
    //instance variable
    double base;
    double height;
    double sideLenone;
    double sideLentwo;
    double sideLenThree;
    // constructor with instance values in parameter
    public Triangle(double base, double height, double sideLenone, double sideLentwo, double sideLenThree){
        this.base = base; // access attributes and assigned values from parameter
        this.height = height;
        this.sideLenone = sideLenone;
        this.sideLentwo = sideLentwo;
        this.sideLenThree = sideLenThree;

    }
    //method
    public double findArea(){
        //
       return (this.base * this.height)/2;

    }
/*
Non-static vs Static Variables
    base and height are non static instance variables: their values are not the same for every triangle; their values change depending on the triangle instance
    Static class variables do not change per instance they hold a value for the whole class to use

    Accessing static class variables
    1. we access a static class variable using the class name (in this case Triangle)
    2. A static variables value belonds to the class rather than a particular instance
    Triangle.numofsides
    dot operator with class name

REVIEW INSTANCE VS CLASSES
1. Classes help organize our code; they contain attributes (properties) and behaviors(methods)
    - every class contains a constructor that can create instances
    - some attributes are associated with each individual instance and we call these instance variables
  2. dot operator to access instance variables
  Non-static instance methods access the instance variables in their implementation
  Triangle triangleA = new Triangle ();
  System.out.println(triangleA.findArea);

  Some attributes are associated with the whole class and we call these class variables
  Static class methods do not need an instance in order to be used, we just use the class name
  Triangle.numofsides;
  Math.pow(x,y);


  Challenge!
  1. Student Profile Attributes:
  - gpa
  - first name
  - last name
  - major
  - exprected year to graduate
  - The student profile class should have at least one behavior
  Sometimes the student cannot get into the right classes in order to graduate on time and must graduate the following year
  so we should have a function that increments a strudent's expected graduation year by one

  constructor that initializes all the attributes with dynamic values, meaning the values that the constructor is called with
  will determine the values of the attributes
  - Your program should create two student profile instances
  that represent two different student profiles
  - your program should call incrementExpectedGraduation year on one of the students profiles and print it out to the console


 */
}
