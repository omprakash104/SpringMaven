package org.example.configurationsannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class NormalKeyboard implements Keyboard {

    @Override
    public void showKeyboard() {
        System.out.println("Showing normal keyboard");
    }
}
