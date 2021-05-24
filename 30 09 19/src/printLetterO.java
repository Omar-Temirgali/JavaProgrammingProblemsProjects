public class printLetterO implements Runnable {
    private int n;
    printLetterO(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            i++;
        }
    }
}
