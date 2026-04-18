import java.net.InetAddress;
import java.net.UnknownHostException;
// ... existing imports

// Inside your chatbot loop:
if (input.contains("who is your host") || input.contains("hostname")) {
    try {
        // Retrieve the local host information
        InetAddress host = InetAddress.getLocalHost();
        System.out.println("ChatBot: My host's name is " + host.getHostName());
    } catch (UnknownHostException e) {
        System.out.println("ChatBot: I couldn't identify my host.");
    }
} else if (input.contains("ip address") || input.contains("your address")) {
    try {
        InetAddress host = InetAddress.getLocalHost();
        System.out.println("ChatBot: My current IP address is " + host.getHostAddress());
    } catch (UnknownHostException e) {
        System.out.println("ChatBot: I'm not sure of my address right now.");
    }
} else if (input.contains("operating system") || input.contains("os")) {
    // Get OS details from system properties
    String os = System.getProperty("os.name");
    System.out.println("ChatBot: I am running on " + os);
}