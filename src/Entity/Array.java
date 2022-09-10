package Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Array {
    private int arraySize;
    private int stepSize;
    private List<Integer> array;

    private void initArray(int arraySize) {
        this.arraySize = arraySize;
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i < arraySize + 1; i++) {
            array.add(i);
        }
        this.array = array;
    }

    private void moveAndPrint(int stepSize) {
        this.stepSize = stepSize;
        int current = 0;
        boolean stopMove = false;

        if (stepSize > arraySize) {
            throw new IllegalArgumentException("too large stepSize");
        }
        List<Integer> pathList = new ArrayList<>();
        pathList.add(array.get(current));
        while (!stopMove) {
            current = current - 1 + stepSize;
            if (current < arraySize && ((current + 1) != (int) array.get(0))) {
                pathList.add(array.get(current));
            } else {
                current = current - arraySize;
                if (((current + 1) != (int) array.get(0))) {
                    pathList.add(array.get(current));
                }
            }
            stopMove = (current + 1) == (int) array.get(0);
        }
        String result = pathList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println(result);
    }

    public Array(int arraySize, int stepSize) {
        initArray(arraySize);
        moveAndPrint(stepSize);
    }
}
