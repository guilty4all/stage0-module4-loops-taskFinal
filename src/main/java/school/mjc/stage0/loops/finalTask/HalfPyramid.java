package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String symbol = "*";
        int space = cathetusLength;
        for (int i = 1; i <= cathetusLength; i++) {
            space -= 1;
            System.out.println(" ".repeat(space) + symbol.repeat(i));
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
