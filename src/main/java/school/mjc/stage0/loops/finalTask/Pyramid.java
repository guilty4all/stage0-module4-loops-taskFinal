package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String line = "";
        int sp ;
        for(int i = 1; i <= cathetusLength; i++){
            sp = cathetusLength * 2;
            if (i == 1 ){
                line = Integer.toString(i);
                sp = (sp - line.length())/2;
                System.out.println(" ".repeat(sp)+line+" ".repeat(sp));
            }else{
                line = Integer.toString(i ) + line + Integer.toString(i );
                sp = (sp - line.length())/2;
                System.out.println(" ".repeat(sp)+ line + " ".repeat(sp));
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
