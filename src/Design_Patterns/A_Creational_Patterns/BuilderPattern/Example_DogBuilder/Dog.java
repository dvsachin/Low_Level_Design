package Design_Patterns.A_Creational_Patterns.BuilderPattern.Example_DogBuilder;

public class Dog {
    private String name; // optional
    private String gender; // cannot change
    private String breed; // cannot change
    private double price;

    public Dog(DogBuilder builder) {
        this.name = builder.getName();
        this.gender = builder.getGender();
        this.breed = builder.getBreed();
        this.price = builder.getPrice();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public double getPrice() {
        return price;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    private void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "name: "+this.name +
                "\ngender: "+this.gender +
                "\nbreed: "+this.breed +
                "\nprice: "+this.price;
    }
    public static class DogBuilder {
        private String name; // optional
        private String gender; // cannot change
        private String breed; // cannot change
        private double price;

        public String getName() {
            return name;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getBreed() {
            return breed;
        }

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public double getPrice() {
            return price;
        }

        public DogBuilder setPrice(double price) {
            this.price = price;
            return this;
        }
        public Dog build() {
            return new Dog(this);
        }
    }
}
