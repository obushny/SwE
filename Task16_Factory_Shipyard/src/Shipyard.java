import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sf2016 on 23.05.2017.
 */
public class Shipyard {

    private static class Destroyer extends Ship{
        String name;
        int cannons;
        public Destroyer(String name,int displacement, int cannons){
            super(displacement);
            this.name=name;
            this.cannons=cannons;
        }

        public void shoot(){
            System.out.println("Destroyer shoot by "+cannons+" cannons");
        }
    }


    private static class Cruiser extends Ship{
        String name;
        int cannons;
        public Cruiser(String name,int displacement, int cannons){
            super(displacement);
            this.name=name;
            this.cannons=cannons;
        }

        public void shoot(){
            System.out.println("Cruiser shoot by "+cannons+" cannons");
        }
    }

    public static Ship produceShip(String type,String name, int displacement, int cannons){
       if(type=="Destroyer"){
         return new Destroyer(name,displacement,cannons);
       };
        if(type=="Cruiser"){
            return new Cruiser(name,displacement,cannons);
        }
        else{
            System.out.println("There is no type "+type);
            return null;
        }
    }


    public static void main(String[] args) {

        ArrayList<Ship> t=new ArrayList<Ship>();
        t.add(produceShip("Cruiser","Aurora",7100,42));
        t.add(produceShip("Destroyer","Glasgo",3100,15));
        for(Ship x:t){
            x.shoot();
        };



/*
        t[0]=Shipyard.produceShip("Cruiser","Aurora",7100,42);
        t[1]=Shipyard.produceShip("Destroyer","Glasgo",3100,15);
        for(int i=0;i<t.length;i++){
            t[i].shoot();
        }*/
    }

}
