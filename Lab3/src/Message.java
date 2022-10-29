public class Message{
    private Person sender;
    private Person receiver;
    private String message;
    private long whenSent;

    public Person getSender(){
        return sender;
    }
    
    public Person getReceiver(){
        return receiver;
    }

    public String getMessage(){
        return message;
    }

    public long getWhenSent(){
        return whenSent;
    }

    public Message(Person sender, Person receiver, String message, long whenSent){
        if (sender == null){
            throw new IllegalArgumentException("sender can not be null in Message.Message()");
        }
        
        if (receiver == null){
            throw new IllegalArgumentException("receiver can not be null in Message.Message()");
        }
        
        if (sender.getUID() == receiver.getUID()){
            throw new IllegalArgumentException("sender and receiver can not be the same person in Message.Message()");
        }

        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.whenSent = whenSent;
    }

    public String getPrettyWhenSent(){
        return (java.time.LocalDateTime.ofEpochSecond(whenSent/1000L, 0, java.time.ZoneOffset.UTC)
                .format(java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"))); 
    }
}