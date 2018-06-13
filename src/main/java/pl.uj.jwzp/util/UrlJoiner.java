package pl.uj.jwzp.util;

import org.springframework.stereotype.Service;

@Service
public class UrlJoiner {
    public String join(String first, String second) {
        boolean firstHasDash = first.endsWith("/");
        boolean secondHasDash = second.startsWith("/");
        if (firstHasDash && secondHasDash) {
            return first + second.substring(1);
        } else if (!firstHasDash && !secondHasDash) {
            return first + '/' + second;
        } else {
            return first + second;
        }
    }
}
