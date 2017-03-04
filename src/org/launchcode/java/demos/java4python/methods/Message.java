package org.launchcode.java.demos.java4python.methods;

/**
 * Created by LaunchCode
 */
public class Message {

    public static String getMessage(String language) {

        // getMessage returns a message in the given language
        if (language.equals("sp")) {
            return "Hello World";
        } else if (language.equals("fr")) {
            return "Bonjour le monde";
        } else {
            return "Hola Mundo";
        }
    }
}
