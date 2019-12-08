
package shape;


public class Triangle implements Shape,Description{
    
    private static int countTriangle=0;
    
    public Triangle(){
        super();
        countTriangle++;     
    }
    
    public void makeStatement(){
        System.out.println("This is a triangle!");
    }
 
    public double calcBoundary(double length) {
      return(2*length) + Math.sqrt(2*length*length);
        
    }

    public double calcArea(double length) {
     return (0.5*length*length);
        
    }
    
    public static int getCountTriangle() {
        return countTriangle;
    }
    
    
    
}
