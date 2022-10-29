import java.util.ArrayList;

public class Website{
    private Person[] users;
    private Message[] allMessages;

    public Website(){
        users = new Person[0];
        allMessages = new Message[0];
    }

    public void addPerson(Person p){
        Person newArray[] = new Person[users.length+1];
        
        for(int i = 0; i < users.length; i+=1){
            newArray[i] = users[i];
        }

        newArray[newArray.length - 1] = p;
        users = newArray;
    }

    public Person getPersonByUID(int uid){
        for(int i = 0; i < users.length; i+=1){
            if(users[i].getUID() == uid){
                return users[i];
            }
        }
        return null;
    }

    void addMessage(Message m){
        Message extraIndexArray[] = new Message[allMessages.length+1];

        for(int i = 0; i < allMessages.length; i++){
            extraIndexArray[i] = allMessages[i];
        }

        extraIndexArray[extraIndexArray.length - 1] = m; 
        allMessages = extraIndexArray; 
    }

    public Message[] getMessagesFor(int uid){
        Message[] result = null;

        for(int pass = 0; pass < 2; pass += 1){
            int count = 0;
            
            for(int i = 0; i < allMessages.length; i ++){
                Message m = allMessages[i];
                
                if(m.getSender().getUID() != uid && m.getReceiver().getUID() != uid){
                    continue;
                }
                
                if(pass == 1){
                    result[count] = m;
                }
                count += 1;
            }

            if(pass == 0){
                result = new Message[count];
            }
        }
        return result;
    }
}