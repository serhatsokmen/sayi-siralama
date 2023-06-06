import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("3 tane sayi giriniz");
        System.out.print("1. sayi : ");
        n1 = scan.nextInt();
        System.out.print("2. sayi : ");
        n2 = scan.nextInt();
        System.out.print("3. sayi : ");
        n3 = scan.nextInt();


        if((n1 > n2) && (n1 > n3)) {
            if(n2 > n3) {
                System.out.println(n3+" < "+n2+" < "+n1);
            }
            else {
                System.out.println(n2+" < "+n3+" < "+n1);
            }
        }

        else if((n2 > n1) && (n2 > n3)) {
            if(n1 > n3) {
                System.out.println(n3+" < "+n1+" < "+n2);
            }
            else {
                System.out.println(n1+" < "+n3+" < "+n2);
            }
        }

        else if((n3 > n1) && (n3 > n2)) {
            if(n1 > n2) {
                System.out.println(n2+" < "+n1+" < "+n3);
            }
            else {
                System.out.println(n1+" < "+n2+ " < "+n3);
            }
        }

        else if((n1 == n2) && (n1 == n3)) {
            System.out.println(n1+" = "+n2+" = "+n3);
        }

    }
}