public class Main {
    public interface Shape {
        void draw();
    }
    public class Rectangle implements Shape {
        public void draw() {
            System.out.println("Inside Rectangle::draw() method.");
        }
    }
    public class Square implements Shape {
        public void draw() {
            System.out.println("Inside Square::draw() method.");
        }
    }
    public class ShapeFactory {
        //使用 getShape 方法获取形状类型的对象
        public Shape getShape(String shapeType){
            if(shapeType == null){
                return null;
            }
            if(shapeType.equalsIgnoreCase("CIRCLE")){
              //  return new Circle();
            } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();
            } else if(shapeType.equalsIgnoreCase("SQUARE")){
                return new Square();
            }
            return null;
        }
    }


}