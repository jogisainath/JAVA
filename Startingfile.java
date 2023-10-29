//single line comments

/*
 * mutiple line comments
 */

/*
 * JDk -> Java development kit
 * it is used to build and develop the program
 * JDK contains "JRE"
 * it contains compiler and debugger and also all libraries, files to bulid and compile.
 * with out JDK we can't  build any java program.
 */

/*
 * JRE -> Java runtime environment
 * JRE is responsible for to run the java program.
 * JRE contains "JVM"
 */

/*
 * JVM -> Java virtual machine
 * JVM is platform dependent
 * JVM takes class files and excutes it by managing the memory.
 */

/*
 * JDK contains JRE and JRE contains JVM. So, if we install JDK all components(JRE,JVM) get installed.
 */

/*
 * SYNTAX:
 * public class Helloworld {
 * 
 * inside this class we need to write a code
 * 
 * }
 * 
 * public -> access modifier
 * class -> class
 * Helloworld -> class name
 * 
 * Access modifier says who can access your class 
 * There are three types to write:
 * 1. public
 * 2. private
 * 3. protected 
 * 
 */

public class Helloworld {
    public static void main(String[] args){
        System.out.println("Hello world!");
    }

}


/*
 * Variables:
 * we can store values in variables
 * NOTE: concatination in python str to str only
 *       concatination in java int to str 
 * In variables declaration and initialization is there
 * Eg: int age = 23  (int-> data type; age->declaration; 23->initialization)
 * VARIABLE_SYNTAX: datatype name = value;
 * 
 * NAMING RULES:
 * 1.Case sensitive
 * 2.contains alphabets,numbers, _ or $
 * 3.Starts with alphabets, numbers, _ or $
 * 4.should not use keywords
 * 5.should not use a class name, if that class name is also in use
 * 6.No limit on length of name
 * 7.Follow CamelCase (Eg: VarName)
 */

class Variables {
    public static void main(String[] args){
        int age = 23;
        System.out.println("sai age:" + age);
    }

}
/*
 * why in above code public is not used
 * If .java file contains top level (not nested) public class, it has to have the same name as that public class.
 * So if you have class like public class A{...} it needs to be placed in A.java file. Because of that we can't have two public classes in one .java file.
 * If you want to have other class in same file make them non-public
 * 
 */

/*Data types are divided into two groups:
 *Primitive data types - includes byte, short, int, long, float, double, boolean and char
 *Non-primitive data types - such as String, Arrays and Classes
 */ 

/*INTEGERS:
 * integers -> whole numbers. There are 4 types
 * 1.byte   (byte VarName = 3;)
 * 2.short  (short VarName = 3;)
 * 3.int    (int VarName = 3;)
 * 4.long   (long VarName = 3l;)
 * SYNTAX: int VarName = 3; (int->type; VarName->name; 3->value)
 */

class intergers_Byte {
    public static void main(String[] args){
        byte VarName = 40;
        System.out.println("Byte number=" + VarName);
    }
}

class intergers_Short {
    public static void main(String[] args){
        short VarName = 50;
        System.out.println("Short number=" + VarName);
    }
}

/*private class intergers_Int {
    public static void main(String[] args){
        int VarName = 60;
        System.out.println("intergers_Int=" + VarName);
    }

}
*/

/* FOR above one throwing error:
 * A method declared as public can be accessed from anywhere in the program but a private method can be accessed only within the class in which it has been declared.
 * Hence, if we try to apply both public and private modifiers to a method it will form an illegal modifier combination and give a compile-time error as shown below.
 */

class intergers_Int1 {
    public static void main(String[] args){
        int VarName = 60;
        System.out.println("intergers_Int=" + VarName);
    }

}

class interger_Long {
    public static void main(String[] args){
        long VarName = 70l;   // need to put "l"  for long integer
        System.out.println(" long number=" + VarName);
    }
}

/*Floating types: -> fractional numbers
 * There are two types in fractinal:
 * 1. float   (need  to put f in end ; Eg: float = 32.5f )
 * 2. double  ## use double most of the time
 */

class floating_float {
    public static void main(String[] args){
        float VarName = 32.5f;
        System.out.println("Float Number=" + VarName);
    }
}

class floating_double {
    public static void main(String[] args){
        double VarName = -3653.2;
        System.out.println("Double number=" + VarName);
    }
}

/*Char and String
 * Char -> 	Stores a single character/letter or ASCII values.
 * string -> stroes group of words
 */

 class Character_char {
    public static void main(String[] args){
        char VarName = 'A';    // only single Quotes
        System.out.println("Char value=" + VarName);
    }

 }

class string {
    public static void main(String[] args){
        String VarName = "Jogi SAINATH";    
        System.out.println(" String word=" + VarName);

    }
}


