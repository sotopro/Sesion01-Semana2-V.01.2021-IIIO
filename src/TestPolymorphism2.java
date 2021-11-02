class Shape {
    void draw(){
        System.out.println("Dibujando");
    }
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("Dibujando un rectangulo...");
    }
}

class Circle extends Shape {
    void draw(){
        System.out.println("Dibujando un circulo...");
    }
}

class Triangle extends Shape {
    void draw(){
        System.out.println("Dibujando un triangulo...");
    }
}

class TestPolymorphims2 {
    public static void main(String args[]){
        Shape x;
        x = new Rectangle();
        x.draw();
        x = new Circle();
        x.draw();
        x = new Triangle();
        x.draw();
    }
}