public class Person{
    private int uid;
    private String firstName;
    private String lastName;

    public Person(int uid, String firstName, String lastName){
        setUID(uid);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public int getUID(){
        return uid;
    }
    
    public void setUID(int uid){
        this.uid = uid;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void sendMessageTo(Person receiver, String message, long when, Website website){
        Message m = new Message(this, receiver, message, when);
        website.addMessage(m);
    }

    public String getFullName(){
        return firstName + " "+ lastName;
    }
}