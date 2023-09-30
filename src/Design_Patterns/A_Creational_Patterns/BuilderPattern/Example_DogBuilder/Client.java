package Design_Patterns.A_Creational_Patterns.BuilderPattern.Example_DogBuilder;

public class Client {
    public static void main(String[] args) {
        Dog d1 = new Dog.DogBuilder()
                .setName("Rustam")
                .setBreed("Golden_Retriever")
                .setGender("Male")
                .setPrice(10000)
                .build();

        Dog d2 = new Dog.DogBuilder()
                .setGender("Female")
                .setBreed("Shih_Tzu")
                .setPrice(50000)
                .setName("katty")
                .build();

        System.out.println(d1);
        System.out.println("---------------------------");
        System.out.println(d2);
    }


}
