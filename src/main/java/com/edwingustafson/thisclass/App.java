package com.edwingustafson.thisclass;

/**
 * Look up our own class
 *
 */
public class App 
{
    /**
     * Look up our own class
     * @return reference to this class, or null if any error
     */
    static Class This() {
        try {
            return Class.forName(
                    new Throwable().
                            getStackTrace()[0].
                            getClassName()
            );
        } catch (ClassNotFoundException e) {
            System.err.println("Bizarrely, failed looking up our own class");
            return null;
        }
    }

    public static void main( final String[] args ) {
        System.out.println( This() );
    }
}
