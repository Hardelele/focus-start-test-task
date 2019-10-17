package main;

public class MainExecutor {

    private static String[] args;

    private static String cornetString = null;

    private static Triangle maxSTriangle = null;

    /**
     * Method run() only execute methods, that implemented in MainExecutor.java
     */

    public static void run() {
        setIOFiles();
    }

    /**
     * Public method getArgs have to be used for
     * getting args[] from FocusStartApplication.main()
     *
     * @param args it's names of IO files.
     */

    public static void getArgs(String[] args) {
        MainExecutor.args = args;
    }

    /**
     * Method setIOFiles have to execute 2 methods:
     * FileReader.setInputFile(args[0]) and FileWriter.setOutputFile(args[1])
     * It's used in method run(), to make that one more readable.
     */

    private static void setIOFiles() {
        HFileReader.setInputFile(args[0]);
        HFileWriter.setOutputFile(args[1]);
    }

    /**
     * Method setDesiredTriangleEmpty call constructor Triangle() without params,
     * that set all points as 0, set S = 0 and set flag isNull = true.
     */

    private static void setMaxSTriangleAsEmpty() {
        maxSTriangle = new Triangle();
    }

    /**
     * Method compareWithMaxSTriangle compare maxSTriangle with thisTriangle
     * and if second one are more, set maxSTriangle as thisTriangle
     *
     * @param thisTriangle it's triangle that we need to compare with maxSTriangle
     */

    private static void compareWithMaxSTriangle(Triangle thisTriangle) {
        if (thisTriangle.getS() > maxSTriangle.getS()) {
            maxSTriangle = thisTriangle;
        }
    }

}
