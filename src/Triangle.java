import TurtleGraphics.*;

public class Triangle extends AbstractShape{
 private double x2, y2, x3, y3;
 
    public Triangle(){
        super();
        x2 = 50;
        y2 = 50;
        x3 = 100;
        y3 = 0;
       
        
    }
 
    public double area() {
       return Math.abs((xPos*y2-x2*yPos) + (x2*yPos-xPos*y2)+ (x3*xPos-yPos*y3))/2;
    }

    
    public double perimeter(){
    return Math.sqrt  ((xPos-x2) * (xPos-x2) + (yPos-y2) *(yPos-y2));
    }
    
   
   
    public void draw(Pen p) {
     p.up();
     p.move(x2,y2);
     p.down();
     p.move(x3,y3);
     p.move(xPos,yPos);
     p.move(x2,y2);
    }
    public void move (int x, int y){
     
      double xc = x-xPos;
      double yc = y-yPos;
      x2+=xc;
      y2+=yc;
      x3+=xc;
      y3+=yc;
     x2 = xPos + (x2 -xPos)*2;
    
    
    }



 @Override
    public void stretchBy(double fact) {
    x2 = xPos + (x2-xPos)*fact;
    y2 = yPos + (y3-xPos)*fact;
    x3 = xPos + (x2-xPos)*fact;
    y3 = yPos + (y3-xPos)*fact;
    
    
    }


    
    

      public String toString(){
            
        String str = "this is a Triangle\n";
        str += "XLOC: " + xPos + "\tyLoc: " + yPos + "\n";
        str += "Perimeter: " + perimeter();
        str += "Area: " + area();
        return str;
    }
}


