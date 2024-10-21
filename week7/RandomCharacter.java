package test9;

public class RandomCharacter {
   public static char getRandomChar(char ch1, char ch2) {
        return (char)(ch1 +Math.random()*(ch2-ch1+1));
    }

    public static char getRandomLOwerCaseLetter(){
       return getRandomChar('a', 'z');
    }
    public static char getRandomUpperCaseLetter(){
       return getRandomChar('A', 'Z');
    }
}
