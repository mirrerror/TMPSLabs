class EmailObserver implements Observer {
    private final String name;

    public EmailObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Email to " + name + ": " + message);
    }
}