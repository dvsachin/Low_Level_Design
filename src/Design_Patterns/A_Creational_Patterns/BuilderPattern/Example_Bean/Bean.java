package Design_Patterns.A_Creational_Patterns.BuilderPattern.Example_Bean;

public class Bean {
    private String X;
    private String Y;
    private String Z;

    public Bean(BeanBuilder builder) {
        X = builder.getX();
        Y = builder.getY();
        Z = builder.getZ();
    }

    // public getter methods ...
    // private setter methods ...
    // toString() method to print object ...

    public String getX() {
        return X;
    }

    private void setX(String x) {
        X = x;
    }

    public String getY() {
        return Y;
    }

    private void setY(String y) {
        Y = y;
    }

    public String getZ() {
        return Z;
    }

    private void setZ(String z) {
        Z = z;
    }

    @Override
    public String toString() {
        return "X : "+this.X+"\nY : "+this.Y  +"\nZ : "+this.Z;
    }

    public static class BeanBuilder {
        String X, Y, Z;
        // public getter methods ...
        public String getX() {
            return X;
        }
        public String getY() {
            return Y;
        }

        public String getZ() {
            return Z;
        }

        public BeanBuilder  setX(String x) {
            X = x;
            return  this;
        }

        public BeanBuilder setY(String y) {
            Y = y;
            return this;
        }

        public BeanBuilder setZ(String z) {
            Z = z;
            return this;
        }

        public Bean build() {
            return new Bean(this);
        }
    }
}
