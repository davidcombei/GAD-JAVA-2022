package GenericChallenges.ExchangeDesk;

public class USD extends Currency{
    public USD(int value) {
        super(value);
    }

    @Override
    public String toString() {
        return "USD{}" + getValue();
    }
}
