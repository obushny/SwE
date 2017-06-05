/**
 * Created by sf2016 on 25.05.2017.
 */
public class LookToTheSky {
    private Planet currentPlanet;
    public void setCurrentPlanet(Planet thisPlanet){
        this.currentPlanet=thisPlanet;

    }
    public void lookUpwards(){
        currentPlanet.lookUpwards();
    }
}
