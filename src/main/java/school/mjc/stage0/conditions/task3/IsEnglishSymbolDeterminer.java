package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int temp = (int) symbol;
        if((temp >= 65 && temp<=90) || (temp>=97 && temp<=122)){
            System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }
}
