import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ChatBot: Hello! What is your name?");
        
        String name = scanner.nextLine();
        System.out.println("ChatBot: Nice to meet you, " + name + "! How can I help you today?");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("hi") || input.contains("hello")) {
                System.out.println("ChatBot: Hello there!");
            } else if (input.contains("time")) {
                System.out.println("ChatBot: I don't have a watch, but I'm sure it's the right time to code!");
            } else if (input.contains("bye")) {
                 System.out.println("ChatBot: Goodbye! Have a great day.");
                break;
            } else {
                System.out.println("ChatBot: I'm sorry, I don't understand that yet.");
            }
        }
        scanner.close();
    }
}