/**
 * Created by sf2016 on 18.05.2017.
 */
public class BigBang {
    public static void main(String[] args) {
        GravityConstant con1=    GravityConstant.setGravitionalConstant((float) 6.67);
        GravityConstant con2=    GravityConstant.setGravitionalConstant((float) 9.5);
        System.out.println("gravitional constant = "+con1.getGravitionalConstant());
        System.out.println("gravitional constant = "+con2.getGravitionalConstant());



    }
}
