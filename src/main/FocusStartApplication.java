package main;

public class FocusStartApplication {
    /**
     * Method main only send args in MainExecutor and run that one.
     *
     * @param args get user args - names of IO files
     */
    public static void main(String[] args) {
        MainExecutor.setArgs(args);
        MainExecutor.run();
    }
}
