package com.company.Questions;

public class InstanceofCheck {
    public static void main(String[] a)
    {
        // create a null string
        String myReference = null;

        // use instanceof to see if myReference is of the type String
        if (myReference instanceof String)
        {
            // this line is not printed
            System.out.println("myReference is a String");
        }
        else
        {
            // this line is printed because "instanceof null" returns false
            System.out.println("instanceof returned false");
        }
    }
}
