package by.itStep.yandr.megaShopProject.util.charStream;

import by.itStep.yandr.megaShopProject.model.entity.Orange;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductStream {
    public static void writeOranges(Orange[] oranges, String fileName) {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            for (Orange orange : oranges) {
                writer.write(orange.getPrice() + " ");
                writer.write(orange.getVitaminC() + " ");
                writer.write(orange.getDiameter() + "\n");

            }

            writer.flush();

        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println(e);

            }

        }

    }

    public static List<Orange> readOranges(String fileName) {
        List<Orange> list = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            //int size = Integer.parseInt(reader.readLine());
            String buf = reader.readLine();
            int count = 0;
            while (buf != null) {
                count++;
                //if (buf != "")
                {
                    //for (int i = 0; i < size; i++) {
                    String[] parameters = buf.split(" "); //"3.5 2500 200".split() -> String[] "3.5" "2500" "200"
                    Orange orange = new Orange();
                    double price = Double.parseDouble(parameters[0]);
                    int vitamin = Integer.parseInt(parameters[1]);
                    int diameter = Integer.parseInt(parameters[2]);
                    orange.setPrice(price);
                    orange.setVitaminC(vitamin);
                    orange.setDiameter(diameter);
                    list.add(orange);
                    buf = reader.readLine();
                }
            }
            System.out.println("count = " + count);
        } catch (IOException exception) {
            System.err.println(exception);

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }

        return list;
    }
}
