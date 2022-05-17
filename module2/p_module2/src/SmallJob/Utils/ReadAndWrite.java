package SmallJob.Utils;

import SmallJob.model.Oto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static final String  PATH_OTO ="src/SmallJob/data/Oto.csv";
    private static final String PATH_XEMAY ="src/SmallJob/data/XeMay.csv";
    private static final String PATH_XETAI ="src/SmallJob/data/XeTai.csv";
    public static void writeToFile(String path, List<String> stringList){
        try{
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            for (String string : stringList){
                bufferedWriter.write(string);
                bufferedWriter.newLine();;
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static void writeToOto(String path,List<Oto>otoList){
        List<String> stringList=new ArrayList<>();
        for(Oto oto:otoList){
            stringList.add(oto.convertLine());
        }
        writeToFile(path,stringList);
    }
    public static List<String>  readFile(String path){
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader=null;
        try{
            fileReader= new FileReader(path);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine()) !=null){
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Oto> readOto(){
        List<String> list = readFile(PATH_OTO);
        List<Oto> otoList = new ArrayList<>();
        String[] arr = null;
        for (String string : list){
            arr=string.split(",");
            otoList.add(new Oto(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]),arr[5] ));

        }return otoList;

    }
}
