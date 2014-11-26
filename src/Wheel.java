
import TurtleGraphics.Pen;

public class Wheel extends Circle{
private double radius;
 private int spokes;
 
 public Wheel(){
     super();
     
 }
  
 public Wheel(double xLoc, double yLoc, double r,
 int s){
     super(xLoc,yLoc, r); 
     spokes=s;
 }
    public double area() {
     return Math.PI * radius *radius;
    }

    public double perimeter(){
        return 2* Math.PI * radius;
    }
   
    public void draw(Pen p) {
        super.draw(p);
      for (int i = 1; i <= spokes; i++){
          
      
      p.up();
      p.move (xPos, yPos );
      p.setDirection (i*360/spokes);
      p.down();
      p.move(radius);
      }}
    public void setSpokes(int s){
        spokes = s;
    }
      
   
    
    public String toString(){
        String str = "Wheel\n" + "Radius: " + radius + "\n "
                            + "Spokes: " + spokes + "\n"
                             + "(X,Y) Position: (" + xPos + "," + yPos + ")\n"
                             + "Area: " + area();
        
        return str;
        
    }
    
}
