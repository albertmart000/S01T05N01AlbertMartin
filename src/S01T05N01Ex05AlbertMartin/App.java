package S01T05N01Ex05AlbertMartin;

import java.io.*;

public class Main {

    public static void main(String[]args) {

        Fruit fruit = new Fruit("poma", "vermell");

        serializeObject(fruit);
        deserializeObject();

        }

        private static void serializeObject(Fruit fruit) {
            try {
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream("Fruits.ser"));
                writeFile.writeObject(fruit);
                writeFile.close();
                System.out.println("Arxiu creat correctament.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private static void deserializeObject() {
            try {
                ObjectInputStream readFile = new ObjectInputStream(new FileInputStream("Fruits.ser"));
                Object inputFruit = readFile.readObject();
                System.out.println(inputFruit);

            }
            catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
        }

}



