import java.util.Scanner;

public class max_min_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();
        int maxValue=1, minValue=1;

        for (int i=1; i<=n; i++){
            System.out.print(i + "'inci sayıyı giriniz: ");
            int k = input.nextInt();

            if (k==1){
                maxValue=k;
                minValue=k;
            }
            if(k>maxValue){
                maxValue=k;
            }
            if(k<minValue){
                minValue=k;
            }


        }
        System.out.print("En büyük değer: " + maxValue);
        System.out.print("En küçük değer: " + minValue);
    }
}
