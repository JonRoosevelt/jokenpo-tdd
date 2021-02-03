package main.java;

public class Player {
    private int _hand;
    private String _handName;

    public Player(int hand) {
        _hand = hand;
        _handName = getHandName(hand);
    }

    public int Hand() {
        return _hand;
    }
    public String HandName() { return _handName; }

    private String getHandName(int hand) {
        var name = "";
        for (HandEnum handEnum : HandEnum.values()) {
            if (handEnum.getValue() == hand) {
                name = handEnum.name();
            }
        }
        return name;
    }

}
