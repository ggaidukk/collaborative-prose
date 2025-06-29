package org.ggaidukk.collaborativeprose;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.examples.SimpleSentence; // Joha1na

public class CollaborativeProse {
    public static void main(String[] args) {
        ProseBuilder builder = new ProseBuilder();

        Sentence johaSentence = new SimpleSentence();
        Sentence shaSentence = new de.htw_berlin.fb4.proseapp_Shamanina.inplementations.SimpleSentence(
            "Dies ist ein Satz von sha-ma-ni."
        );

        builder.register(johaSentence);
        builder.register(shaSentence);

        System.out.println("Composed Prose:");
        System.out.println(builder.get());
    }
}