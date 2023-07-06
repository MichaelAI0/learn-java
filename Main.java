public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("I am learning Java.");
    System.out.println("It is awesome! ");
    // words are added to the same line using print
    System.out.print("Hello World! ");
    System.out.println("I will print on the same line.");
    // this is a single line comment
    // You can do math operations in java
    System.out.println(3 + 3);
    /*
     * this is a
     * multi-line comment
     */
    // you can reassign variables in java
    // you can add a variable to a string value in println
    String name = "John";
    System.out.println("Hello " + name);
    // the "final" declaration is used as a "const" or constant and can't be changed
    // later
    final String learning = "Today I'm learning Java";
    System.out.println(learning);
    // You can also use the + character to add a variable to another variable:
    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    // For numeric values, the + character works as a mathematical operator (notice
    // that we use int (integer) variables here):
    int x = 5, y = 6;
    // To declare more than one variable of the same type, you can use a
    // comma-separated list
    System.out.println(x + y); // Print the value of x + y

    // TODO((((((((((((((((((((((Integer Types)))))))))))))))))))))))

    byte myNum = 100;
    System.out.println(myNum);

    short myNumb = 5000;
    System.out.println(myNumb);

    // the int data type is the preferred data type for numerical whole value
    // variables
    int myNumbe = 100000;
    System.out.println(myNumbe);
    // usually stores what can not be held in the int data type
    long myNumber = 15000000000L;
    System.out.println(myNumber);

    // TODO((((((((((((((((((((((Floating Point Types)))))))))))))))))))))))
    // Note that you should end the value with an "f" for floats and "d" for
    // doubles:
    float myFum = 5.75f;
    System.out.println(myFum);

    /*
     * Scientific Numbers
     * A floating point number can also be a scientific number with an "e" to
     * indicate the power of 10:
     */

    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);

    // TODO(((((((((((((((((((((( Boolean Data Types)))))))))))))))))))))))

    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun); // Outputs true
    System.out.println(isFishTasty); // Outputs false

    // TODO(((((((((((((((((((((( Characters & Strings)))))))))))))))))))))))
    char myGrade = 'B';
    System.out.println(myGrade);

    // Alternatively, if you are familiar with ASCII values, you can use those to
    // display certain characters:

    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);

    String greeting = "Hello World";
    System.out.println(greeting);

    /*
     * Non-primitive data types are called reference types because they refer to
     * objects.
     * 
     * The main difference between primitive and non-primitive data types are:
     * 
     * Primitive types are predefined (already defined) in Java. Non-primitive types
     * are created by the programmer and is not defined by Java (except for String).
     * Non-primitive types can be used to call methods to perform certain
     * operations, while primitive types cannot.
     * A primitive type has always a value, while non-primitive types can be null.
     * A primitive type starts with a lowercase letter, while non-primitive types
     * starts with an uppercase letter.
     * 
     */
    /*
     * Examples of non-primitive types are:
     * Strings, Arrays, Classes, Interface, etc.
     */

    // TODO(((((((((((((((((((((( Type Casting )))))))))))))))))))))))

    // Widening casting is done automatically when passing a smaller size type to a
    // larger size type:
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt); // Outputs 9
    System.out.println(myDouble); // Outputs 9.0

    // Narrowing casting must be done manually by placing the type in parentheses in
    // front of the value:

    double myDoubles = 9.78d;
    int myInts = (int) myDoubles; // Manual casting: double to int

    System.out.println(myDoubles); // Outputs 9.78
    System.out.println(myInts); // Outputs 9

    // TODO(((((((((((((((((((((( Operators )))))))))))))))))))))))

    /*
     * ((((((((((((((Arithmetic Operators))))))))))))))
     * + Addition Adds together two values x + y
     * - Subtraction Subtracts one value from another x - y
     * * Multiplication Multiplies two values x * y
     * / Division Divides one value by another x / y
     * % Modulus Returns the division remainder x % y
     * ++ Increment Increases the value of a variable by 1 ++x
     * -- Decrement Decreases the value of a variable by 1 --x
     */
  }
}