public class SillyMethods {
    public boolean didGuess42(int guess) {
        return guess == 42;
    }
    public String countTo(int n) {
        String result = "";
        for (int i = 0; i <= n; i++) {
            if (i==0)
                result = "0";
            else
                result= result + " " + i;
        }
        return result.trim();
    }
}
