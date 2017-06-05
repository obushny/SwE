/**
 * Created by sf2016 on 24.05.2017.
 */
public class ReaderProxy extends Reader{
    public ReaderProxy(String filename) {
        super(filename);
    }

    @Override
    public String[] readDataFromFile() {
        return new String[]{"some text"};
    }
}
