package designPatterns.builder;

public class Pizza {

    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;
    private boolean pineapple;

    public static class Builder {
        private final int size;

        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean bacon = false;
        private boolean pineapple = false;

        public Builder(int size) {
            this.size = size;
        }

        public Builder cheese(boolean value) {
            cheese = value;
            return this;
        }

        public Builder pepperoni(boolean value) {
            pepperoni = value;
            return this;
        }

        public Builder bacon(boolean value) {
            bacon = value;
            return this;
        }

        public Builder pineapple (boolean value) {
            pineapple = value;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        size = builder.size;
        cheese = builder.cheese;
        pepperoni = builder.pepperoni;
        bacon = builder.bacon;
        pineapple = builder.pineapple;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", bacon=" + bacon +
                ", pineapple=" + pineapple +
                '}';
    }
}

