 /** Pollymorphism with Dependency Injection */
 
  class Test {
    public static void main(String[] args) {
        CalculateArea calculateArea = new CalculateArea();
        Shape s = new Rectangle(calculateArea);
        Shape s1 = new Triangle(calculateArea);
        
        calculateArea.setLength(12.5);
        calculateArea.setBreath(5);
        
        s.area();
        s1.area();
    }
}

class CalculateArea {
   private double length;
   private double breath;
   
   public void setLength(double length) {
       this.length = length;
   }
   
   public void setBreath(double breath) {
       this.breath = breath;
   }
   
   public double getLength() {
       return this.length;
   }
   
   public double getBreath() {
       return this.breath;
   }
}
 
 
 interface Shape {
   void area();
}

 class Rectangle implements Shape {
     private CalculateArea calculateArea;
     
     public Rectangle(CalculateArea calculateArea) {
         this.calculateArea = calculateArea;
     }
     
           @Override 
           public void area() {
              double l = calculateArea.getLength();
              double b = calculateArea.getBreath();
              double area = l * b;
            System.out.println(area);
        }
}

 class Triangle implements Shape {
     private CalculateArea calculateArea;
     
     public Triangle(CalculateArea calculateArea) {
         this.calculateArea = calculateArea;
     }
       @Override 
       public void area() {
           double l =  calculateArea.getLength();
           double b = calculateArea.getBreath();
           double area =(0.5 *  l * b);
           System.out.println(area);
        }
}

