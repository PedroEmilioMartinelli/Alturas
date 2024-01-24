import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos nuemros vc vai digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i ++ ){
            System.out.println("Digite um numero");
            vect[i] = sc.nextInt();

        }
        System.out.println("Nuemros negativos");
        for (int i = 0; i < n; i ++ ){
            if (vect[i]<0){
                System.out.println(vect[i]);
            }
        }
        sc.close();





    }
}