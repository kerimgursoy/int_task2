import javax.swing.*;

public class RandGame{
    int num;
    GameFrame frame;
    RandGame gameP;
    TTimer timer;

    public RandGame(GameFrame frame){
        num = (int) (Math.random()*101);
        this.frame = frame;
        this.gameP = this;
        timer = new TTimer(gameP);
        timer.start();
    }

    public void guess(int n) {
        if(n < num){
            frame.msg.setText("Çok küçük");
        }
        else if(n > num){
            frame.msg.setText("Çok büyük");
        }
        else {
            frame.msg.setText("Doğru bildiniz");
            timer.interrupt();
            Timer jtimer = new Timer(1000, e -> {
                System.exit(0);
            });
            jtimer.setRepeats(false);
            jtimer.start();
        }
    }
}
