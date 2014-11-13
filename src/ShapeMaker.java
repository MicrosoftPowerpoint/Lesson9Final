import TurtleGraphics.*;
import TerminalIO.*;
public class ShapeMaker {

    public static void main(String[] args) {
  Pen p = new StandardPen(new SketchPadWindow(400, 400));
  Shape s1;
  double r, x, y;
  double w, h;
  int choice;
  KeyboardReader k=new KeyboardReader();
  
  while (true)
  {
      choice = k.readInt("Enter 1 for rectangle, 2 for circles: ");
      if (choice ==1 || choice == 2) break;
               
  }
      
  if (choice==1)
  {
      w=k.readDouble("Enter width of rect");
      h=k.readDouble("Enter height of rect");
      s1 = new Rect(0,0,w,h);
  }
  else
  {
      r = k.readDouble("Enter radius of circle");
      s1 = new Circle(0,0,r);
      
  }
    }
}
       
    
    


