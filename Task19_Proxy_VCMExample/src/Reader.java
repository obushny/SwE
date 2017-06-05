import java.io.*;

/**
 * Created by sf2016 on 24.05.2017.
 */
public class Reader {
    private final String filename;
    private String[] someText=new String[10];

    public Reader(String filename){
        this.filename=filename;
            }

    public String[] readDataFromFile(){
        String line;
        try {
            InputStream fis = new FileInputStream(filename);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            int i=0;
            while ((line=br.readLine())!=null){
                someText[i++]=line;
               // System.out.println(line);
            }
        }


        catch (FileNotFoundException e){
            System.out.println("error");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return  someText;
    }
}
