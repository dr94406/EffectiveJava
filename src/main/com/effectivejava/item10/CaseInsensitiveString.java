package main.com.effectivejava.item10;


import java.util.Objects;

public final class CaseInsensitiveString {

    private final String value;

    public CaseInsensitiveString(String value) {
        this.value = Objects.requireNonNull(value);
    }
}
