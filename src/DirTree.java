import java.io.File;

/**
 * Created by Azunai on 02.05.14.
 */
public class DirTree {
    public static void printFnames(String sDir){
        File[] faFiles = new File(sDir).listFiles();
        for(File file: faFiles){
            if(file.getName().matches("^(.*?)")){
                System.out.println(file.getAbsolutePath());
            }
            if(file.isDirectory()){
                printFnames(file.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        printFnames("D:");
    }
}
