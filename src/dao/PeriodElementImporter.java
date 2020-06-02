package dao;
import Lab8.*;
import dto.State;
import dto.Type;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PeriodElementImporter {
    public static List<Element.PeriodicElement> loadCSV(String filename){
        List<Element.PeriodicElement> resultLoaded = new ArrayList<>();

        BufferedReader br = null;

        try{
            br = Files.newBufferedReader(Paths.get(filename));
            //Charset.forName("UTF-8");
            String line = "";

            while((line = br.readLine()) != null){
                List<String> tmpList = new ArrayList<String>();
                String array[] = line.split(",");

                int number = Integer.parseInt(array[0]);;
                String symbol = array[1];
                String name = array[2];
                double weight = Double.parseDouble(array[3]);
                int period = Integer.parseInt(array[4]);
                int group = Integer.parseInt(array[5]);
                Type type = Type.valueOf(array[6]);
                State state = State.valueOf(array[7]);

                Element.PeriodicElement readedElement = new Element.PeriodicElement(number, symbol,name,weight,period,group,type,state) {
                    @Override
                    public void print() {
                        System.out.println("print for what????");
                    }
                };

                resultLoaded.add(readedElement);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return resultLoaded;
    };

    //public static void saveCSV(String path, List<Element.PeriodicElement> elements);
}
