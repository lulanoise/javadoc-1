package it.develhope.javadoc;

/**
 * This is the WordGames class
 * Creating methods for playing with words
 * @author lulanoise
 */

public class WordGames {

    /**
     * Add "Hello" to the given word
     * @param word  the word to which "Hello" should be added
     * @return the concatenation of "Hello" and the given word
     */

    public String addHelloWord(String word) {
        return "Hello " + word;
    }
    /**
     * Concatenate two names
     * @param name first name
     * @param surname second name
     * @return the concatenation of the two names
     */

        public String getFullName(String name, String surname) {
            return name + " " + surname;
        }

    }

