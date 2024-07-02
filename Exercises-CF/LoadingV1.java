package gr.aueb.cf.Finalized_Projects;

public class LoadingV1 {
    public static void main(String[] args) throws InterruptedException {
            int loadFraction = 0;
            System.out.println("Loading...");
            while (loadFraction < 100) {
                loadFraction+=10;
                int i = 0;
                for (; i < (int) (loadFraction);i++) {
                    Thread.sleep(10);
                    System.out.print("[");
                    System.out.print("/".repeat(loadFraction));
                    System.out.print("] " + (int) (loadFraction) + "%");
                    System.out.print('\r');
                }
            }System.out.println("loading complete.");
        }
    }

