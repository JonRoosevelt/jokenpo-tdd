package main.java;

import java.util.HashMap;
import java.util.Map;

public enum HandEnum {
    ROCK(0),
    PAPER(1),
    SCISSORS(2);

    private int value;
    private static Map map = new HashMap<>();

    private HandEnum(int value) {
        this.value = value;
    }

    static {
        for (HandEnum handEnum : HandEnum.values()) {
            map.put(handEnum.value, handEnum);
        }
    }

    public static HandEnum valueOf(int HandEnum) {
        return (HandEnum) map.get(HandEnum);
    }

    public int getValue() {
        return value;
    }
}