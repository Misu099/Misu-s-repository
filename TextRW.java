import java.io.*;
import java.util.List;

public class TextRW {


    ShoppingList list= new ShoppingList();

    public TextRW(){}


    public void read(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                list.add(new Items(parts[0], Integer.parseInt(parts[1]),Double.parseDouble(parts[2])));
            }
                reader.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }


    public void write(String filename, String text) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


public void print(){
       list.print();
}







}
