package gr.aueb.cf.Finalized_Projects.Finalized_Projects;

public class GuessGame {
    public static void main(String[] args) {
        int code = 77;
        int a = 0;
        int guess_Count = 0;
        while (a!=code){
            a = (int) (Math.random()*1000);
            guess_Count+=1;
            System.out.println("Trying: "+a);
        }
        System.out.printf("%d is the right one, we cracked it in %d tries",a,guess_Count);
    }
}
