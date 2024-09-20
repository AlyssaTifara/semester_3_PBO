import java.util.Scanner;
public class kalkulator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = input.next();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int hasil = 0;
        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                hasil = angka1 / angka2;
                break;
        }
        System.out.println("Hasil: " + hasil);
    }
}