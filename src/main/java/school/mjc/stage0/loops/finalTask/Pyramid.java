package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String line = "";
        for(int i = 1;i <= cathetusLength;i++){
            if (i==1 && cathetusLength > 0){
                line= ""+i;
                System.out.println(" ".repeat(cathetusLength-1)+line);
            }else{
                if (cathetusLength == 0) {
                    System.out.println("");
                }else{
                    String word = line;
                    line = ""+i+""+word+""+i;
                    System.out.println(" ".repeat(cathetusLength-i)+ line);
                }

            }
        }
    }



    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
