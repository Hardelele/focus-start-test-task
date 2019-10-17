package main;

import java.util.HashSet;

public class MainExecutor {

    private static String[] args;

    private static String cornetString = null;

    private static Triangle maxSTriangle = null;

    /**
     * Method run() only execute methods, that implemented in MainExecutor.java
     */

    public static void run() {
        setIOFiles();
        checkIOFiles();
        setMaxSTriangleAsEmpty();
        searchMaxSTriangle();
        saveResult();
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

    private static void checkIOFiles() {
        HFileReader.checkInputFile();
        HFileWriter.checkOutputFile();
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

    /**
     * Method setCornetString() get string and set it in MainExecutor.cornetString
     *
     * @param cornetString it is string of 6 points
     */

    private static void setCornetString(String cornetString) {
        MainExecutor.cornetString = cornetString;
    }

    private static void searchMaxSTriangle() {
        HFileReader.setupFileReader();
        Triangle cornetTriangle;

        while (true) {
            setCornetString(HFileReader.readNext());

            if(cornetString == null) {
                break;
            }
            
            cornetTriangle = new Triangle(cornetString);
            compareWithMaxSTriangle(cornetTriangle);
            cornetString = "";
        }

    }

    private static void saveResult() {
        String result = maxSTriangle.toString();
        HFileWriter.write(result);
    }

}
