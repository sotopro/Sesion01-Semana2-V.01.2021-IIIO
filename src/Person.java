public class Person {
    private double id;
    private String name;

    public Person() {
        id = Math.random();
        sayHi();
    }

    private void sayHi() {
        System.out.println("Hi - " + getId());
    }

    public double getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}