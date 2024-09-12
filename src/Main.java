import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a,b, ile=0, suma=0, srednia=0;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        for(int i=a;i<=b;i++)
        {
            ile++;
            suma = suma+i;
            srednia = srednia + i;
        }
        System.out.println("Suma wynosi: "+suma+", srednia: "+(srednia/ile));
    }
}