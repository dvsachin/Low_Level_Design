package Design_Patterns.A_Creational_Patterns.BuilderPattern.Example_Bean;

public class Client {
    public static void main(String[] args) {
        Bean b = new Bean.BeanBuilder().
                setX("10")
                .setZ("30")
                .setY("20")
                .build();

        System.out.println(b);
    }
}
