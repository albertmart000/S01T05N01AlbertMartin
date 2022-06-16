package S01T05N01Ex05AlbertMartin;

import java.io.Serializable;

public class Fruit implements Serializable {

    private String name;
    private String colour;

    public Fruit(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "\nLa " + name + " és de color "
                    + colour + ".";
        }
    }

