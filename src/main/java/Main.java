import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;

public class Main {

    public static void main(java.lang.String[] args) {
//        Divided divided = new Divided();
//        divided.dividedNumber();
        AnalogParseInt analogParseInt = new AnalogParseInt();
        Integer result =  analogParseInt.mtParseInt("512") + 1;
        System.out.println(result);
    }
}
