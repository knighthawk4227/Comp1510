
package q1;

/** <p>Cylinder class. holds the values and methods required 
 * to calculate Surface area and volume.</p>
 * 
 * @author Mitchell
 * @version 1.0
 * */
public class Cylinder {
    
    /** <p>Radius value.</p> */
    private double radius;
    
    /** Height value. */
    
    private double height;
    
    /**
     * <p> Constructor for cylinder.</p>
    * @param radius radius of cylinder 
    * @param height height of cylinder */
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    /** <p>Sets radius.</p>
     * @param radius used */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /** <p>Return height.</p> 
     * @return radius*/
    
    public double getRadius() {
        return radius;
    }
    
    /** <p>Set the height.</p>
     * @param height height of cylinder*/
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    /** <p>Get height.</p>  
     * @return height*/
    
    public double getHeight() {
        return height;
    }
    
    /** <p> The surface area calculation for a cylinder.</p>
     * @return surfaceArea*/
    
    public double surfaceArea() {
        double surfaceArea;
        surfaceArea = (2 * Math.PI * radius) * (radius + height);
        return surfaceArea;
    }
    
    /** <p> The Volume of a cylinder.</p>
     * @return volume of cylinder*/
    
    public double volume() {
        double volume;
        volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
    
    /** <p> To string that returns height and radius as string. </p>
     * @return height and radius as string*/
    public String toString() {
        return "The height being used for this calculation is "
                + height + " and the radius being used is " + radius;
    }
    
    

}
