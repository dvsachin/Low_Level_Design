package Design_Patterns.C_Behavioural_Patterns.MomentoPattern.ObserverPattern.Example_YoutubeChService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

// client
public class Client {
    public static void main(String[] args) throws IOException {
        Subject channel = new YoutubeChannel();
        User john = new Subscriber("John");
        User mike = new Subscriber("Mike");

        channel.subscribe(john);
        channel.subscribe(mike);


        channel.notifyChanges("Observer Design Pattern"); // user notified method called
        channel.unsubscribe(mike);
        channel.notifyChanges("SOLID principles");

        System.out.println("------------------------------------------------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        loop:
        while (true) {
            System.out.println("Press 1 - upload video");
            System.out.println("Press 2 - create a new subscriber (User)");
            System.out.println("Press 3 - EXIT");

            int input = Integer.parseInt(br.readLine().trim());
            switch (input) {
                case 1:
                    System.out.println("Enter Video title: ");
                    String title = br.readLine();
                    channel.notifyChanges(title);
                    break;

                case 2:
                    System.out.println("Enter Subscribers name: ");
                    String user1 = br.readLine();
                    User u1 = new Subscriber(user1);
                    channel.subscribe(u1);
                    System.out.println("Subscribed!");
                    break;


                case 3:
                    System.out.println("Thank you!");
                    break loop;

                default:
                    System.out.println("Wrong Input: ");
            }
        }
    }
}
