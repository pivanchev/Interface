package shape;


public class Circle implements Shape,Description {
    
    private static int countCircle=0;
    
    public Circle(){
        super();
        countCircle++;
    }
    
    public void makeStatement(){
        System.out.println("This is a circle!");
    }

    
    public double calcBoundary(double length) {
        return (2*length*Math.PI);
        
    }

    public double calcArea(double length) {
        return (length*length*Math.PI); 
    }
    
    public static int getCountCircle() {
        return countCircle;
    }
    
    
    
    
}
