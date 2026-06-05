interface  Notifications{
    void sendMessages(String message);
}
class Mobie implements Notifications
{
    public void sendMessages(String message)
    {
        System.out.println("Message sent to mobile: "+message);
    }
}
class Email implements Notifications
{
    public void sendMessages(String message)
    {
        System.out.println("Message sent to email: "+message);
    }
}
class Whatsapp implements Notifications
{
    public void sendMessages(String message)
    {
        System.out.println("Message sent to whatsapp: "+message);
    }
}
class Telegram implements Notifications
{
    public void sendMessages(String message)
    {
        System.out.println("Message sent to telegram: "+message);
    }
}
class NotificationSystem
{
    public static void main(String args[])
    {
        Mobie m=new Mobie();
        Email e=new Email();
        Whatsapp w=new Whatsapp();
        Telegram t=new Telegram();
        m.sendMessages("you have a new message!");
        e.sendMessages("i am the devil");
        w.sendMessages(" hello frinds");
        t.sendMessages("@@@@$$$$%%%%%");
    }
}
