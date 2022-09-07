package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String line = "";
        int sp;
        String result = "";
        for (int i = 1; i <= cathetusLength; i++) {
            sp = cathetusLength * 2;
            if (i == 1) {
                line = Integer.toString(i);
                sp = (sp - line.length()) / 2;
                result =  " ".repeat(sp) + line + " ".repeat(sp) + "\n";
            } else {
                line = Integer.toString(i) + line + Integer.toString(i);
                sp = (sp - line.length()) / 2;
                result =  " ".repeat(sp) + line + " ".repeat(sp) + "\n";
            }
            System.out.print(result);
        }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
