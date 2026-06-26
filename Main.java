import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RandGame game = new RandGame();
        int n;
        Scanner scan = new Scanner(System.in);

        game.startGame();
        do {
            try{
                n = scan.nextInt();
            }
            catch (InputMismatchException f){
                System.out.println("Geçersiz değer girildi, değer -1 kabul edildi.");
                n = -1;
                scan.next();
            }
        } while (!game.guess(n));
    }
}