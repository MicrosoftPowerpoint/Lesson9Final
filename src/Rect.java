
import TurtleGraphics.Pen;

public class Rect implements Shape {

  
 private double xPos, yPos, width, height;
 
 public Rect(){
     xPos=0;
     yPos=0;
     width=1;
     height = 1; 
 }
  
 public Rect(double x, double y, double h, double w){
     xPos=0;
     yPos=0;
     width=w;
     height =h;
 }
 
 
    public double area() {
       return width * height;
    }

    @Override
    public void draw(Pen p) {
    p.up();
    p.move(xPos, yPos);
    p.down();
    p.setDirection(0);
    p.move(width);
    p.turn(-90);
    p.move(height);
    p.turn(-90);
      p.move(width);
    p.turn(-90);
    p.move(height);
    }

   
    public double getXPos() {
       return xPos; }

   
    public double getYPos() {
    return yPos;
    }

    
    public void move(double xLoc, double yLoc) {
    xPos = xLoc;
    yPos = yLoc;
    }

  
    public void stretchBy(double factor) {
   height*=factor;
   width*=factor;
    }

   public String toString(){
   
       String str = "this is a Rectangle\n";
        str += "XLOC: " + xPos + "\tyLoc: " + yPos + "\n";
        str += "Width: " +width + "\tHeight: " +height + "\n";
        str += "Area: " + area();
        return str;
    }
}
