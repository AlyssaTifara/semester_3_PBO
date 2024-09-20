package jobsheet03;

public class MotorDemo{
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();
        
        // motor1.platNomor = "N 6068 ADG";
        // int kecepatanBaru = 50;
        
        // motor1.kecepatan = 50;
        motor1.displayStatus();

        motor1.setPlatNomor ("B 6068 ADG");
        motor1.setKecepatan(40);
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.setPlatNomor ("N 6068 ADG");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(40);
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.setPlatNomor ("D 8343 CV");
        motor3.setKecepatan(50);
        motor3.displayStatus();

        // Motor motor1 = new Motor();
        // motor2.isMesinOn = true;
        // kecepatanBaru = 50;
        // if(!motor2.isMesinOn && kecepatanBaru > 0){
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        // } else {
        //     motor1.kecepatan = kecepatanBaru;
        // }
        // // motor2.kecepatan = 40;
        // motor2.displayStatus();

        // motor2.setPlatNomor ("N 9840 AB");
        // Motor motor3 = new Motor();
        // motor3.platNomor = "D 8343 CV";
        // motor2.isMesinOn = true;
        // kecepatanBaru = 50;
        // if(!motor3.isMesinOn && kecepatanBaru > 0){
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        // } else {
        //     motor1.kecepatan = kecepatanBaru;
        // }
        // // motor3.kecepatan = 60;
        // motor3.displayStatus();
    }
}