public class Inheritance {
    public static void main(String[] args){
        Animal dog = new Dog();
        dog.setId(1);
        dog.sound();
    }
}

class Animal {
    int id;

    public  int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void sound() {
        System.out.println("Por defecto no hace ruido.");
    }
}

class Dog extends Animal {
    private void bark(){
        System.out.println("El Perrito - " + getId() + "esta ladrando");
    }

    @Override
    public void sound(){
        bark();
    }
}