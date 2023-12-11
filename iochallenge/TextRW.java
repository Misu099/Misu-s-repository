package iochallenge;

import java.io.*;

public class TextRW {

    ShoppingList list = new ShoppingList();

    public TextRW() {
    } //No need fot empty constructor, it will be provided by the compiler

    public void read(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                list.add(new Items(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Items item) {
        list.add(item);
    }

    public <list> void write(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(list.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void serialize(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            list = (ShoppingList) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        list.print();
    }

}
