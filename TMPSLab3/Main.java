public class Main {

    public static void main(String[] args) {
        Subject newsAgency = new Subject();

        Observer emailSubscriber = new EmailObserver("mirrerror@gmail.com");
        Observer smsSubscriber = new SMSObserver("8-800-555-35-35");

        newsAgency.addObserver(emailSubscriber);
        newsAgency.addObserver(smsSubscriber);

        newsAgency.setState("Breaking News: Observer Pattern Implemented!");
    }

}
