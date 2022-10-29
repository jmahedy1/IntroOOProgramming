import java.util.Scanner;

public class Driver{
    public static void addPeopleTo(Website w){
        w.addPerson(new Person(1001, "Jack", "Mahedy"));
        w.addPerson(new Person(1002, "John", "Smith"));
        w.addPerson(new Person(1003, "Fred", "Lander"));
    }

    public static void handlePrintMessages(Website w, int firstUID, int secondUID){
        Person a = w.getPersonByUID(firstUID);
        if (a == null){
            System.out.println("Person with uid "+firstUID+" not found, can't print message history");
        }

        Person b = w.getPersonByUID(secondUID);
        if (b == null){
            System.out.println("Person with uid "+secondUID+" not found, can't print message history");
        }

        System.out.println("Showing chat history between ["+a.getFirstName()+"] and ["+b.getFirstName()+"]");
        boolean any = false;

        Message[] messages = w.getMessagesFor(firstUID);
        for(int i = 0; i < messages.length; i+=1){
            if (messages[i].getSender().getUID() != secondUID && messages[i].getReceiver().getUID() != secondUID){
                continue;
            }

            any = true;
            System.out.println("At (" + messages[i].getPrettyWhenSent()+"), " + messages[i].getSender().getFullName() + 
                               " said: \"" + messages[i].getMessage() + "\"");
        }
        
        if (!any){
            System.out.println("NO MESSAGE HISTORY FOUND FOR THESE TWO USERS.");
        }
    }

    public static void printChatHistory(Scanner s, Website w){
        System.out.print("Enter the first person's UID: ");
        int firstUID = s.nextInt();
        s.nextLine();

        System.out.print("Enter the second person's UID: ");
        int secondUID = s.nextInt();
        s.nextLine();

        handlePrintMessages(w, firstUID, secondUID);
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        Website w = new Website();
        addPeopleTo(w);

        while(true){
            System.out.print("Type 'quit' to exit, anything else to keep going: ");
            
            if ("quit".equals(s.nextLine())){
                break;
            }

            System.out.print("Enter the sender's UID, or -1 to view chat history: ");
            int uid = s.nextInt();
            s.nextLine(); 
            
            if (uid == -1){
                printChatHistory(s, w);
                continue;
            }

            Person sender = w.getPersonByUID(uid);
            
            if (sender == null){
                System.out.println("Person with UID == " + uid + " not found.");
                continue;
            }

            System.out.print("Enter the receiver's UID: ");
            uid = s.nextInt();
            s.nextLine();  
            Person receiver = w.getPersonByUID(uid);
            
            if (receiver == null){
                System.out.println("Person with UID == " + uid + " not found.");
                continue;
            }

            System.out.print("Enter the message text being sent: ");
            String message = s.nextLine();
            long whenSent = System.currentTimeMillis();

            sender.sendMessageTo(receiver, message, whenSent, w);
        }
    }
}