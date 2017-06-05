/**
 * Created by sf2016 on 25.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        LookToTheSky me = new LookToTheSky();
        me.setCurrentPlanet(new Earth());
        me.lookUpwards();
        me.setCurrentPlanet(new Mars());
        me.lookUpwards();
    }
}
