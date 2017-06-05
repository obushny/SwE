/**
 * Created by sf2016 on 18.05.2017.
 */
public class GravityConstant {
    private float gravitionalConstant;
    private static GravityConstant gravConst;

    private GravityConstant(float gravitionalConstant) {
        this.gravitionalConstant = gravitionalConstant;
    }

    

    public static GravityConstant setGravitionalConstant(float con) {
        if (gravConst == null) {
            gravConst = new GravityConstant(con);
        }
        return gravConst;

    }



    public float getGravitionalConstant() {
        return gravitionalConstant;
    }


}
