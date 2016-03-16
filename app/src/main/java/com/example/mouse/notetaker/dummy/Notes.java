package com.example.mouse.notetaker.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Notes {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Note> ITEMS = new ArrayList<Note>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Note> ITEM_MAP = new HashMap<String, Note>();

    private static final int COUNT = 100;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createNote(i));
        }
    }

    private static void addItem(Note item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static Note createNote(int position) {
        return new Note(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Note {
        public final String id;
        public final String content;
        public final String details;
        public final Long date;

        public Note(String id, String content, String details) {
            // The constructor does not allow the programmer to give a date - therefore, the modified date is safe from programmer error
            this.id = id;
            this.content = content;
            this.details = details;
            // http://stackoverflow.com/questions/2168374/what-is-the-best-practice-for-manipulating-and-storing-dates-in-java
            this.date = System.currentTimeMillis();
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
