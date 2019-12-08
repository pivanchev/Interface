
package shape;


public class Square implements Shape,Description{
    
    private static int countSquare=0;
    
    public Square(){
        super();
        countSquare++;
    }
    
    public void makeStatement(){
        System.out.println("This is a square!");
    }

   
    public double calcArea(double length) {
       return length*length;
    }

   
    public double calcBoundary(double length) {
        return 4*length;    
    }
    
      public static int getCountSquare() {
        return countSquare;
    }
    
    
}
