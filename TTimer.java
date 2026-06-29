public class TTimer extends Thread{
    int anInt = 0;
    int time = 20;
    RandGame game;
    public TTimer(RandGame game){
        this.game = game;
    }
    @Override
    public void run() {
        while(anInt <= time && !Thread.currentThread().isInterrupted()){
            game.frame.time.setText(String.valueOf(20-anInt));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
            anInt++;
        }
        System.out.println(game.num);
        System.exit(0);
    }
}
