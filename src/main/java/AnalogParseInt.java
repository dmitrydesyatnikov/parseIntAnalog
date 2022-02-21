public class AnalogParseInt {
    public int mtParseInt(String argsNumber){
        int number = 0;
        for (int i = 0; i < argsNumber.length(); i++){
            char symbol = argsNumber.charAt(i);
            number  = (symbol - '0') + number*10;
        }
        return number;
    }
}
