package gr.aueb.cf.Finalized_Projects.Finalized_Projects;

public class LoadingV3 {
    public static void main(String[] args) throws InterruptedException {
        int stars = 0;
        while(true){

            if (stars!=3){
                stars++;
            }
            else if (stars==3){
                stars-=3;
            }
            Thread.sleep(1000);

            System.out.print("Loading"+".".repeat(stars));
            System.out.print('\r');
        }
    }
}
