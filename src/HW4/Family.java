package HW4;

public class Family {
    String name;

    public static void main(String[] args) {
        Child child = new Child("Artyom");
        Mother mother = new Mother("Kate");
        Mother grandmother = new Mother("Alexa");
        Father father = new Father("Petr");
        Father grandfather = new Father("Oleg");
        Child secondGenerationChild = new Child("Kolya");
        System.out.println("The first generation contains :"+mother.name+father.name+child.name);
        System.out.println("The second generation contains :"+grandfather.name+grandmother.name+secondGenerationChild.name);
    }
}
