public class ACStruktural{
    public static void main(String[] args){
        String merek, merek2, merek3, merek4, merek5, merek6, merek7, merek8, merek9, merek10;
        int suhu, suhu2, suhu3, suhu4, suhu5, suhu6, suhu7, suhu8, suhu9, suhu10;
        String mode, mode2, mode3, mode4, mode5, mode6, mode7, mode8, mode9, mode10;

        merek = "Samsung";
        suhu = 20;
        mode = "Dry";

        merek2 = "LG";
        suhu2 = 16;
        mode2 = "Cool";

        merek3 = "Panasonic";
        suhu3 = 17;
        mode3 = "Fan";

        merek4 = "Sharp";
        suhu4 = 20;
        mode4 = "Dry";

        merek5 = "Midea";
        suhu5 = 17;
        mode5 = "Fan";

        merek6 = "Panasonic";
        suhu6 = 23;
        mode6 = "Dry";

        merek7 = "LG";
        suhu7 = 19;
        mode7 = "Fan";

        merek8 = "Samsung";
        suhu8 = 18;
        mode8 = "Dry";

        merek9 = "Sharp";
        suhu9 = 24;
        mode9 = "Cool";

        merek10 = "Midea";
        suhu10 = 22;
        mode10 = "Cool";

        suhu = tambahSuhu(suhu, 1);
        suhu2 = tambahSuhu(suhu2, 5);
        suhu3 = tambahSuhu(suhu, 1);
        suhu4 = tambahSuhu(suhu2, 3);
        suhu5 = tambahSuhu(suhu, 2);
        suhu6 = tambahSuhu(suhu2, 1);
        suhu7 = tambahSuhu(suhu, 9);
        suhu8 = tambahSuhu(suhu2, 1);
        suhu9 = tambahSuhu(suhu, 1);
        suhu10 = tambahSuhu(suhu2, 6);

        System.out.println("-----------1----------");
        System.out.println("Merek: " + merek);
        System.out.println("Suhu: " + suhu);
        System.out.println("Mode: " + mode);
        System.out.println("-----------2----------");

        System.out.println("Merek: " + merek2);
        System.out.println("Suhu: " + suhu2);
        System.out.println("Mode: " + mode2);
        System.out.println("-----------3----------");

        System.out.println("Merek: " + merek3);
        System.out.println("Suhu: " + suhu3);
        System.out.println("Mode: " + mode3);
        System.out.println("-----------4----------");

        System.out.println("Merek: " + merek4);
        System.out.println("Suhu: " + suhu4);
        System.out.println("Mode: " + mode4);
        System.out.println("-----------5----------");

        System.out.println("Merek: " + merek5);
        System.out.println("Suhu: " + suhu5);
        System.out.println("Mode: " + mode6);
        System.out.println("------------6---------");

        System.out.println("Merek: " + merek7);
        System.out.println("Suhu: " + suhu7);
        System.out.println("Mode: " + mode7);
        System.out.println("-----------7----------");

        System.out.println("Merek: " + merek8);
        System.out.println("Suhu: " + suhu8);
        System.out.println("Mode: " + mode8);
        System.out.println("----------8-----------");

        System.out.println("Merek: " + merek9);
        System.out.println("Suhu: " + suhu9);
        System.out.println("Mode: " + mode9);
        System.out.println("-----------9----------");

        System.out.println("Merek: " + merek10);
        System.out.println("Suhu: " + suhu10);
        System.out.println("Mode: " + mode10);
        System.out.println("-----------10----------");
    }

    public static int tambahSuhu(int suhu, int increment){
        suhu += increment;
        return suhu;
    }

    public static int kurangSuhu(int suhu, int decrement){
        suhu -= decrement;
        return suhu;
    }

    // public static String menampilkanSuhu(String merek, int suhu, String mode, String merek2, int suhu2, String mode2, String merek3, int suhu3, String mode3){
    //     System.out.println("AC 1: " + merek + ", Suhu: " + suhu + "°C, Mode: " + mode);
    //     System.out.println("AC 2: " + merek2 + ", Suhu: " + suhu2 + "°C, Mode: " + mode2);
    //     System.out.println("AC 3: " + merek3 + ", Suhu: " + suhu3 + "°C, Mode: " + mode3);
    // }
}