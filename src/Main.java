import Entity.Array;
import FileReader.FileReader;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String path;
        if (!Arrays.asList(args).isEmpty()) {
            path = Arrays.asList(args).get(0);
        } else {
            path = "";
        }
        FileReader fileReader = new FileReader();
        List<Integer> arguments= fileReader.getArgs(path);

        if (!arguments.isEmpty()) {
            new Array(arguments.get(0), arguments.get(1));
        }
    }
}
