public class EncapsulationDemo{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Pedrito");

        System.out.println(("Person 1 - " + p1.getId() + " : " + p1.getName()));
    }
}