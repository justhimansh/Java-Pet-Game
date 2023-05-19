package project.pkg1;
import java.util.Arrays;
import java.util.List;

public class Colors {
    static List<String> colorList = Arrays.asList(
            "\u001B[0m", //normal 0
            "\u001B[35m", //purple 1
            "\u001B[31m",//red 2
            "\u001B[33m",//yellow 3
            "\u001B[34m",//blue 4
            "\u001B[36m",//cyan 5
            "\u001B[32m",//green 6
            "\u001B[1m" //bold
    );
}
