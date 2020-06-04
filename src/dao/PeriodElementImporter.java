package dao;
import controller.Element;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PeriodElementImporter {
    public static List<Element.PeriodicElement> loadCSV(String filename){
        List<Element.PeriodicElement> resultLoaded = new ArrayList<>();

        BufferedReader br = null;

        try{
            br = Files.newBufferedReader(Paths.get(filename));
            String line = "";
            while((line = br.readLine()) != null){
                String[] fields = line.split(",");
                resultLoaded.add(Element.PeriodicElement.parse(fields));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (br != null){  br.close(); }
            } catch (IOException e) { e.printStackTrace(); }
        }
        return resultLoaded;
    };

    public static void saveCSV(String path, List<Element.PeriodicElement> elements){
        FileWriter fw = null;
        try{
            fw = new FileWriter(path);

            for(Element.PeriodicElement e : elements){
                fw.write(e.toString());
                fw.write('\n');
            }
            fw.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fw != null){ fw.close(); }
            } catch (IOException e) { e.printStackTrace(); }
        }
    }
}
