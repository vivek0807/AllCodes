package languageBasics;
 class Bycycle{
    int gear;
    int speed;
    int weight;

    public Bycycle(int gear, int speed, int weight) {
        this.gear = gear;
        this.speed = speed;
        this.weight = weight;
    }
    public void applyBrake(int reduction){
        this.speed-=reduction;
    }
    public void speedup(int accelerate){
        speed+=accelerate;
    }


}
class mountainBike extends Bycycle{

     int seatHeight;
     int tyreSize;
    public mountainBike(int gear, int speed, int weight,int seatHeight,int tyreSize) {
        super(gear, speed, weight);
        this.seatHeight=seatHeight;
        this.tyreSize=tyreSize;
    }

    void changeSeatHeight(int adjustment){
        seatHeight+=adjustment;
    }
    void changeTyreSize(int newsize){
        tyreSize+=newsize;

    }


    public String getData(){
        return "Gear -->"+this.gear+" Speed --> "+this.speed+" Weight-->"+this.weight+"\n seatheight -->"+seatHeight+"tyresize "+tyreSize;
            }

}

public class inheritance {
    public static void main(String[] args) {
        mountainBike mb=new mountainBike(6,30,60,25,3);
        mb.changeSeatHeight(1);
        System.out.println( mb.getData());
    }
}
