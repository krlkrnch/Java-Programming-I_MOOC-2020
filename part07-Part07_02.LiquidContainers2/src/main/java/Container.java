
public class Container {

    private int liquid;

    public Container() {
        this.liquid = 0;
    }

    public int contains() {
        return this.liquid;

    }

    public void add(int number) {

        if (number < 0) {
            number = 0;
        }
        this.liquid = this.liquid + number;

        if (this.liquid > 100) {
            this.liquid = 100;
        }

    }

    public void remove(int number) {
        if (number < 0) {
            number = 0;
        }
        this.liquid = this.liquid - number;

        if (this.liquid < 0) {
            this.liquid = 0;
        }

    }

    @Override
    public String toString() {
        return this.liquid + "/100";

    }
}
