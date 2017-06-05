/**
 * Created by sf2016 on 23.05.2017.
 */
public abstract class Ship {

    private int displacement;
    private int speed;

    public Ship(int displacement){
        this.displacement=displacement;
        this.speed=speed;
    }

    public void accelerate(int duration){
        for(int i=0;i<duration;i++){
            speed++;
        }
    }

    public void decelerate (int duration){
        for(int i=0;i<duration;i++){
            if (speed==0){
                break;
            };
            speed--;
        }
    }

    public void shoot (){
        System.out.println("This ship not shooting");
    }

    public void showSpeed(){
        System.out.println("Speed is "+speed+" knots");
    }

}
