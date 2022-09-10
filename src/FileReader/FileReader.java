package FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public List<Integer> getArgs(String path) throws IOException {
        List<Integer> list = new ArrayList();
        try {
            java.io.FileReader fr = new java.io.FileReader(path);
            Scanner scan2 = new Scanner(fr);
            String arguments = scan2.nextLine();
            String[] strArray = arguments.split("\\D+");
            int arraySize;
            int stepSize;
            int i = 0;
            try {
                arraySize = Integer.parseInt(Arrays.asList(strArray).get(i));
                stepSize = Integer.parseInt(Arrays.asList(strArray).get(i + 1));
            } catch (NumberFormatException e) {
                i = 1;
                arraySize = Integer.parseInt(Arrays.asList(strArray).get(i));
                stepSize = Integer.parseInt(Arrays.asList(strArray).get(i + 1));
            }
            list.add(arraySize);
            list.add(stepSize);
            fr.close();
        } catch (NumberFormatException e) {
        } catch (IOException e) {
        }
        return list;
    }
}
