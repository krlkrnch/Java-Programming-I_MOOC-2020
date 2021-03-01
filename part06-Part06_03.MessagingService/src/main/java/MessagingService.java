
import java.util.ArrayList;
import java.util.Objects;

public class MessagingService {

    private ArrayList<Message> list;

    public MessagingService() {
        this.list = new ArrayList();

    }

    public void add(Message message) {

        if (message.getContent().length() <= 280) {
            list.add(message);
        }

    }

    public ArrayList<Message> getMessages() {
        return list;
    }

    public void print() {
        for (Message message : list) {
            System.out.println(message);
        }
    }

}
