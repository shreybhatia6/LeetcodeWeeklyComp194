public class Question1 {
    public int xorOperation(int n, int start) {

        int c = start;

        for (int i = 1; i < n; i++){
            c ^= (start+2*i) ;
        }

        return c;
    }
}