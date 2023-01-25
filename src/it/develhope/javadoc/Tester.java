package it.develhope.javadoc;
/**
 * This is the Tester class
 * It tests the methods of the WordGames class
 * @author lulanoise
 */
public class Tester {
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();
        System.out.println(wordGames.addHelloWord("World"));
        System.out.println(wordGames.getFullName("Lucrezia","Rumore"));
    }
}
