import java.util.ArrayList;

public class MessagingService {
    
    private ArrayList<Message> service;

    public MessagingService() {
        this.service = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            service.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.service;
    }

}
