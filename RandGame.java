public class RandGame{
    int num;
    long start;
    public void startGame(){
        num = (int) (Math.random()*101);
        start = System.currentTimeMillis();
    }
    public boolean guess(int n){
        if (System.currentTimeMillis() - start>15000){
            System.out.println("Zaman bitti");
            return true;
        }
        else if(n < num){
            System.out.println("Çok küçük");
            System.out.println("Kalan zaman: "+(15000+start-System.currentTimeMillis())/1000);
            return false;
        }
        else if(n > num){
            System.out.println("Çok büyük");
            System.out.println("Kalan zaman: "+(15000+start-System.currentTimeMillis())/1000);
            return false;
        }
        else {
            System.out.println("Doğru bildiniz");
            return true;
        }
    }
}
