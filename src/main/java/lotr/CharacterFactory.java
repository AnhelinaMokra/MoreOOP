package lotr;

import java.lang.reflect.*;
import java.util.*;

class CharacterFactory {
    private static final List<Class<? extends Character>> characterClasses = Arrays.asList(
            Hobbit.class, Elf.class, King.class, Knight.class
    );

    public Character createCharacter() {
        Random rand = new Random();
        int choice = rand.nextInt(characterClasses.size());
        Class<? extends Character> characterClass = characterClasses.get(choice);

        try {
            Constructor<? extends Character> constructor = characterClass.getConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
