package q1;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class MultiCylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    
    
    public static void main(String[] args) {
        
        final int t2 = 2;
        final int t3 = 3;
        final int t5 = 5;
        final int t6 = 6;
        Cylinder circle = new Cylinder(t3, t2);
        Cylinder circle2 = new Cylinder(t5, t6);
        System.out.println(circle);
        
        System.out.println("\nThe radius is " + circle.getRadius());
        System.out.println("\nWith the Radius " + circle.getRadius() 
                + " and the height being " + circle.getHeight() 
                + " The surface area is " + circle.surfaceArea());
        System.out.println("\nWith the Radius " + circle.getRadius() 
            + " and the height being " + circle.getHeight() 
            + " The volume is " + circle.volume());
        circle.setRadius(2);
        System.out.println("\nWhen the value of radius is changed to " 
                + circle.getRadius() 
            + " The surface area changes to " + circle.surfaceArea() 
            + " & the volume changes to " + circle.volume());
        
        
        System.out.println("\n" + circle2);        
        circle2.getHeight();
        System.out.println("\nWith the Radius " + circle2.getRadius() 
            + " and the height being " + circle2.getHeight() 
            + " The volume is " + circle2.volume());
        
        System.out.println("\nWith the Radius " + circle2.getRadius() 
            + " and the height being " + circle2.getHeight() 
            + " The surface area is " + circle2.surfaceArea());
        
        circle2.setHeight(2);
        System.out.println("\nWhen the value of Height is changed to " 
                + circle2.getHeight() 
            + " The surface area changes to " + circle2.surfaceArea() 
            + " & the volume changes to " + circle2.volume());
        
        System.out.println("\nQuestion one was called and ran sucessfully.");
    }

}
