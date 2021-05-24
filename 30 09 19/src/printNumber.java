public class printNumber implements Runnable {
    private int n;
    printNumber(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            //System.out.print(i);
            i++;
        }
    }
}
