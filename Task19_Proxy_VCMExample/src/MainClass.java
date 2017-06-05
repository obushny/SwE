/**
 * Created by sf2016 on 24.05.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Reader r = new Reader("C:\\Users\\sf2016\\Documents\\SomeText.txt");
        for(int i=0;i<r.readDataFromFile().length;i++){
            System.out.println(r.readDataFromFile()[i]);

        }


    }

}
