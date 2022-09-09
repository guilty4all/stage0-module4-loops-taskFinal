package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String line = "";
        String result = "";
        for(int i = 1;i <= cathetusLength;i++){
            if (i==1){
                line= ""+i;
                result += " ".repeat(cathetusLength-1)+line+"\n";
            }else if (i >1 && i <= cathetusLength){
                String word = line;
                line = ""+i+""+word+""+i;
                result += " ".repeat(cathetusLength-i)+ line + "\n";
            }else{
                result = "";
            }
        }
        System.out.println(result);
    }



    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
