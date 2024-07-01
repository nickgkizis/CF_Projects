package gr.aueb.cf.Finalized_Projects.Finalized_Projects;

public class LoadingV2 {
    public static void main(String[] args) throws InterruptedException {
        for (int loadFraction=0; loadFraction < 101;loadFraction+=1) {
            Thread.sleep(200);
            System.out.print("Loading.[");
            System.out.print("/".repeat(loadFraction/5));
            System.out.print("] " + loadFraction + "%");
            System.out.print('\r');
        }
        System.out.println("Loading complete.");
    }
}
