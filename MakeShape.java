
package shape;
import java.util.Scanner;

public class MakeShape {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int choice;
        double dimens;
        String decision;
        
        do{
        System.out.println("Enter 1 for Square, 2 for Triangle, 3 for Cirle:");
        System.out.print("Enter choice:");
        choice=sc.nextInt();
        System.out.print("Enter dimension:");
        dimens=sc.nextDouble();
        
        
        if(choice==1){
            Square sq=new Square();
            
        System.out.println("The area of the square is: " + sq.calcArea(dimens));
        System.out.println("The boundary length of the square is: " + sq.calcBoundary(dimens));
        sq.makeStatement();
        }
        
        else if(choice==2){
            Triangle tr=new Triangle();
        
        System.out.println("The area of the triangle is: " + tr.calcArea(dimens));
        System.out.println("The boundary length of the triangle is: " + tr.calcBoundary(dimens));
        tr.makeStatement();
        }
        
        else{
            Circle cir=new Circle();
        
        System.out.println("The area of the circle is: " + cir.calcArea(dimens));
        System.out.println("The boundary length of the circle is: " + cir.calcBoundary(dimens));
        cir.makeStatement();
        }
      
          
            System.out.println();
            System.out.println("Do you want to go again? (y/n)?: ");
            decision=sc.next();
            
             
        }while(decision.equals("y"));
        
        System.out.println("The number of shapes created is " + ( Square.getCountSquare() + Circle.getCountCircle() + Triangle.getCountTriangle()));
        System.out.println("Number of squares created: " + Square.getCountSquare());
        System.out.println("Number of circles created: " + Circle.getCountCircle());
        System.out.println("Number of triangles created: " + Triangle.getCountTriangle());
        
    }
    
}
