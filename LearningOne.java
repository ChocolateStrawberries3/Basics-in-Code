import java.util.Scanner;

public class LearningOne {
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
       // void return type //System.out.println(" Your total meal price is " + result);
        return result;
    }
    public static void main(String[] args) {
      double  groupTotalMealPrice = calculateTotalMealPrice(100, .2 ,.08 );
       double individualTotalMealPrice = groupTotalMealPrice/5.0;
      System.out.println(groupTotalMealPrice);
      System.out.println(individualTotalMealPrice);
        //part two Lets make some triangle instances
        Triangle triangleA = new Triangle(15,8,15,8,17);
        Triangle triangleB = new Triangle(3,2.598,3,3,3 );
        //reason we did triangleA.findarea we need an instance
        double triangleArea = triangleA.findArea();
        System.out.println(triangleArea);
        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);
        System.out.println(triangleA.sideLenone);
        //print out triangle attributes
        System.out.println(Triangle.numOfSides);
        // Triangle.findArea()?--> Math.pow(2,3)?
        // The implementation of the findArea dunction in the triangle class relies
        // on the attributes values of a given triangle
        //findArea() is an instance method, so we call it with a Triangle instance for ex triangleA.findArea()
        /*
        Static Methods we did not need to create an instance of Matho to use pow methods
        pow() is a static method (class method) so we call them using the class name

        Instance Methods vs Class Methods
        Instance methods are also referred to as non-static methods since you need an instance to use them
        Class methods are referred to as static methods because you do not need an instance to use them

         */


        //this one is when it is a void method call, calculateTotalMealPrice(10, .2, .08); //order matters

    // Add more t tea time
        System.out.println("Welcome to your tea job!");

        //calling out TeaTime function
        announceTeaTime();
        System.out.println("Write Code");
        System.out.println("review Code");
        announceTeaTime();
        System.out.println("Get promoted!");
        System.out.println("Hello World from the intelliJ IDEA.");
       //primitive data types
        /*
        Data: In computer science, data is information that is stored and processed by a computer
        1. Java classifies different pieces of data with data types based on their value
        2. A data type provides a set of possible values
        Primitive Data Types:
        1. boolean => (true or false)
        2. int => whole numbers
        3. double => decimal numbers
        4. char => single letter or symbol
         */
        int studAge = 20;
        double GPA = 3.2;

        //int, double are data types
        // studAge, GPA are variable types
        // 20,3.2 are values

        char firstletter = 'B';
        char lastletter = 'B';
        boolean islatetowork = false;

        /*
        Reference Types:
        String : A sequence of ordered characters
        The order of a string matters
        hello != olleh
        S in String Reference Type is Capital
         */
        String helloThere = "hello";

        /*
        Using indexes with Strings
        1. The ordering of letters in a string matters
        "Kayla" k = 0 , a = 1, y = 2, l = 3, a = 4 in index 01234

        Operation:
        CharAt Operation:
        This allows us to access a character at a specific location within the string.
        Input: Index of the wanted character
        Output: The value of the character at the inputted index

         */
        char hellofirstletter = helloThere.charAt(0);
        // ++ signs means we concatenated the strings
        System.out.print(hellofirstletter + " " + " This is the first letter in Hello");

        /*
        Input and Output
        Scanner Object
        Create a Scanner object
         */
        System.out.println("What is your GPA?");
        //Scanner is our Data Type
        Scanner newname = new Scanner (System.in);
        //Scans what user input is
        GPA = newname.nextDouble();
        System.out.println("Your GPA is "+ ": " +GPA);
        /*
        Control Flow
        Mapping Out program control flow
        1.add decision- making logic
        What is a control flow?
        - A program's control flow is the order in which te program's instructions or code statements are executed
        - We can manipulate which line of code is executed with special control flow statements and conditions
        a. A line of code might never be executed, be executed once or multiple times
        b. The conditions determine how many times a given line of code is executed.

        The fortune teller program
        start --> pick a number 1 and 10 , if inputted num is less than five print enjoy the good luck else print
        bad luck comes.

        c. Decision blocks or control flow statements make a decision about code statements to run on each execution of
        our program
        Format <if condition>


        Part Two Operators In JAVA
        1. <,>,<=,>=, !=, ==
        these are boolean expressions
        A condition in a decision block evaluates to true or false depending on some variable
        That's what makes it a condition that can be evaluated during the program's execution and manipulate a program's
        control flow.

        Try it!

         */

        System.out.println("Please pick a number through 1-78");
        Scanner Sc = new Scanner(System.in);
        int number = Sc.nextInt();
        if(number < 39){
            System.out.print("good luck comes to you");

        }
        else{
            System.out.println("no fortune is seen");
        }

        /*
        Part 3 Understanding scope in Java
        1. Only if or else block was executed
        Scope: The scope of a variable is the part of the program where a piece of code is accessible or in which it can
        be used.
        2. Curly braces create different blocks or regions in JAVA
        3. The if Block and the else block are separate because they are in different sets of curly braces

        While Loops:
        1. A loop (In General) allows code to be excuted repeatedly based on a Boolean condition
        2. while condition is true run this

        While loop Example:
         */
        Scanner input = new Scanner(System.in);
        boolean Repeat = true;
        while(Repeat){
            System.out.println("Playing your song");
            System.out.println(" Would you like to take the song off of repeat? Yes or No?");
            String userInput = input.next();
            if(userInput. equals("yes")){
                Repeat = false;
            }
        }
        System.out.println("playing next song");
/*
Challenge Code
1. Implement multiply choice questions
- Creative, One question, Three answers choices
- Ask the user a question
- output answer choices to user
Collects user input
Print out congrats if correct, if not correct shows answer
 */
        System.out.println(" What is are the primary colors?");
        String color1 = " Yellow, Blue, Red";
        String color2 = "Red, Purple, Green";
        String color3 = "Blue, Green, Red";

        String a = "a";
        String b = "b";
        String c = "c";


        Scanner color = new Scanner(System.in);
        boolean question1 = true;
        System.out.println(" a. Red, Purple, Green" + "b. Blue, Green, Red" + " c. Yellow, Blue, Red");
        String Colorinput = color.next();
        while(question1) {
            if (Colorinput.equals("a".toLowerCase())) {
                System.out.println("This is the wrong answer, the actual answer is:" + c + color1);
             break;
            }
            else if(Colorinput.equals("b".toLowerCase())){
                System.out.println("This is the wrong answer, the actual answer is:" + c + color1);
                break;
            }
            else{
                question1 = false;
                System.out.println(" Congrats you got the right answer!");
            }
        }

        /*
        Other way of doing it:
        String question="";
        What is the largest planet in our solar system?
        String CHoiceOne = "";
        Earth
        String ChoiceTwo = "";
        Jupiter
        String ChoiceThree ="";
        Saturn
        String CorrectAnswer = ChoiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        //Write a print statment giving the answer choices
        System.out.println("Choose one of the follwoing:" + choiceone + ", " choicetwo + " ,or " + choicethree+ ".");

        //Have the user input an answer
        Scanner input = new Scanner (System.in);
        // Retrieve the user's input
        String input = scanner.next();


        // If the user's input matches correct Answer, print a congrats message
        if(correctAnswer.equals(input)){
        System.out.print("Congrats your right");
        else{
        System.out.println("Try again.");
        //If the user's input is wrong print a message saying the correct answer and they are wrong.

        .equals is case sensitive, convert input.toLowerCase so if the user inputs "JUPITER" it will convert it to
        the our variable.
        how to add on to try again is with a while loop.


        PART 4: Debugging in JAVA
        Debugging:
        1. Locating and fixing a program's errors
        - These errors are often called bugs

      2. Print statements help find where code isn't outputting.

      Syntax errors:
      1. Can cause your program to fail before it is run
      2. Your code must be in the right format for a computer to read
      3. Some common syntax errors are misspelled variable or missing semicolon.

      Logical Error:
      1. deal with the logic of a program
      2. When a program has a logical bug, it doesn't act as the user expects
      3. To solve these errors, we look for components of the program that aren't as expected, find their respective
      code and fix it

      Debugging with an IDE:
      1. The bug tool
      A breakpoint is an intentional stopping point put into a program for debugging purpose
      - With a breakpoint, we can temporarily halt a program in order to inspect its internal state
        a. Internal State: variable values, the result of certain lines of code, whether or not a certain line of code
        is executed.

         Example:
         Click space after line number, to run in debug mode click the bug, it will show the variables of the codes
         internal state.
         Step over button helps move to the next section of code

         Create a program that calculated the area of a triangle
         1. The user will input base and height values
         The program will calculate the area using the formula : Area = base * height /2
         Neither the base nor the height should be less than or equal to zero



         */
        System.out.println("Welcome to the Triangle Area Formula.");
            Scanner triangle = new Scanner(System.in);
            System.out.println("Please put in your Base:");
            double base = triangle.nextDouble();
            System.out.println("Please put in your height:");
            double height = triangle.nextDouble();

            while( base > 0 & height > 0){
                double area = (base * height)/2;
                System.out.println("The area of the triangle is: " + area);
                break;

            }
            if( base <= 0 || height <= 0){
                System.out.println("Sorry we can't have zeros for height or base! Please check your numbers again.");
            }

            /*
            Sample Solutions:
            System.out.println("Let's Calculate the area of a triangle.");
            Scanner input = new Scanner(System.in);

            System.out.println("Please input the base of the triangle(in inches).");
            double base = input.nextDouble();

            while (base <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
            }
            System.out.println("Please input the height of the triangle (in inches).");
            double height = input.nextDouble();

            while(height <= 0){
            System.out.println("That's invalid. Please input the height of the triangle (in inches).");
            height = input.nextDouble();

            }
            double area = (base *height)/2
            System.out.println("the area is " + area);
             */
            /*
            What are Functions?
            - A Function is a series of finite steps that accomplish some task
            - Combination of finite steps is a Function
            USING A FUNCTION:
            task:
            To use a function we can just use its name or label
            function name with ();
            In order to use a function we must define it first
            We have to write code that defines the name of the function ( for example task)
            as well as all of the steps needed to complete the task
            Once the task and its steps are defined we can use the function throughout our program

            WHY USE FUNCTIONS?
            Functions help developers organize their code in a more meaningful way
            Functions allow us to define a given task once and use it all throughtout our code

             Part 2: Functions:
            Dynamic Functions:
            -announceteatime had no inputs
            - it contained a series of steps that were executed and resulted in the same output every time
            - How can we use inputs to make our functions more dynamic?

            Part 3 Dynamic Functions:
            ex) Calculate total cost of meal
            1. Calculate tip: Tip = tipRate * listedMealPrice;
            2. Calculate Tax: Tax = taxRate * listedMealPrice;
            3. Calculate Result: result = tip + tax + listedMealPrice;
            4. Output Result: System.out.println(result);
            How can we account for different tip rates, tax rates, and listed meal prices?

            Create a Function with inputs
            1. The listedmealprice, tiprate, taxrate inputs will be defined in the function's definiion
            2. Values of these inputs will be assigned when we call the function
            This will allow us to have a custome listed meal price, tip rate, and tax rate.

            Return Types in JAVA
            Image:
            When we call our function: calculateTotalMealPrice(100,.20.08)
            The total meal price is 128, however we want to split the bill

            Potential Solutions
            1. add another parameter , representing the number of people as the meal and divide by that
            2. However the output of the function should be the total meal cost, not a portion, because the name of
            the function is calculateTotalMealPrice
            3. Some how get access to the result of calculateTotalmealPrice in order to manipulate more

            void is the return type
            so in our method calculateTotalMealPrice change our return type to double

            Using Built-in Functions in Java:
            .equals for strings is built in
            "red".equals("blue");

            Dot Operator
            - accesses built in functions
            Finding Built-in Functions
            1. JAVA API


             */
            //built in function
            double resutl = Math.pow(2,5);
            System.out.println(resutl); //32.0
            /*
            Code Challenge
            Define call built in functions
            Calculate an Employee's Salary
            1.Input:  How many hours the employee works per week
            2. INput: Amount of money the employee makes per hour
            Outputs:
            Employee's gross yearly salary
            bonus add input for vacations days
            the employee doesnt get paid for vacation days
            one vacation day = eight hours of work

             */

            System.out.println("How many hours do you make per week?");
            Scanner houremp = new Scanner(System.in);
            System.out.println("How much do you make per hour?");
            Scanner moneys = new Scanner(System.in);
            double hour = houremp.nextDouble();
            double money = moneys.nextDouble();
             double employeSal = employeeSalary(hour, money);
             System.out.println(employeSal);
             System.out.println("Do you have any vacation days? Yes or No?");
             Scanner answer = new Scanner(System.in);
             String ans = answer.next();


             if(ans.equals("yes")){
                 System.out.println("Please put in the number of vacation days!");
                 Scanner VacAnswer = new Scanner(System.in);


                 int vacA =  VacAnswer.nextInt();
                 int vacaTion = vacationDay(vacA);

                 System.out.println("Your gross Salary is : " + employeSal + " With Vacation days taken out: " + Math.round(employeSal/vacaTion) * hour);



             }
             else{
                 System.out.println("Your gross Salary is: " + employeSal);
             }

            /*
            double salary = salaryCalculator (40,15, 8);
                //should equal 30240
            System.out.println(salary);
             */




    }
    /*
    public static double salaryCalculator(double hoursPerWeek, double amountPerHour, int vacationDays){
    if(hoursPerWeek <0){
    return -1;
    }
    if(amountPerHour < 0 ) {
    return -1;
    }

    double weeklyPayCheck = hoursPerWeek * amountPerHour;
    double unpaidTime = vacationDays *amountPerHour * 8;
    return (weeklyPayCheck *52) - unpaidTime;
    //52 weeks in a year
    }
     */



    public static double employeeSalary(double hours, double money){
        double result = hours * money;
        return result * 52;

        /*
        GO BACK OVER VACATION SALARY!
        Classes in Java Part 6
        1. One way to make a program easier to read is with classes
        - A class is user defined blueprint that has a set of attributes and behaviors that define the item it is supposed to
        represent
        -Lets create a blueprint for a triangle
        -  What are the properties of a triangle?
        - base, height
        -side1 side2
        - Behaviors of a class:
        1. Attributes/properties: base, height, sidelenone, sidelentwo, sidelenthree
        2. Behaviors: functions that are related to ( and located inside) the class
           - method ex)findArea() calculateTriangleType()
           - we could try to find if it is isosceles, scalene, equilaterial
        3. The behaviors manipulate attributes of the class
        4. We add the keyword static if the function does not use the attributes of a class, but still relates to the overall theme or idea of the class.

            Constructors in JAVA
            1. Triangle Class
            - An instance is an object created from a class blueprint
            - We can use a class to create an object in code
            - Triangle class defines base, height, sidelenone, sidelentwo, sidelenthree
        as attributes
            -HOW do we create triangle?
            1. A constructor is a special method or behavior inside every class that creates and initializes instances
            2. We will use a constructor in the Triangle class to construct and initialize Triangle instance
           What does a constructor look like?
           1. The constructor may or may not take inputs
           2. A constructor always returns an instance of the class its in

            public Triangle () {}
            Creating a COnstructor
            - in constructing a triangle instance or triangle object we'll want to initialize its attributes with values
            - we can add parameters to give a dynamic value for each attribute
            - To access the attribute for the Triangle instance we are trying to construct, we use the
            this keyword and the dot operator.
            this.base=base;
            - the this keyword helps our program make a distinction between the attribute variable and the parameter variable
            When used with the this keyword and dot operator allows us to access the new triangles attributes variables
            - We call a constructor like any other function
            Triangle triangleA= new Triangle();
            Triangle is now a data Type? Yes

         */


    }
    public static int vacationDay(int vacation){
        int actualSalarywithvacation = vacation * 8;
        return actualSalarywithvacation;

    }
    //outside our main method
    public static void announceTeaTime(){
        System.out.println("Waiting for developer tea time..");
        System.out.println("Type in a random word and press Enter to start developer tea time.");
        Scanner teainput = new Scanner(System.in);
        teainput.next();
        System.out.println("It's Tea Time");
    }
    //in Java when we use a function we call the function
    /*

     */
}
