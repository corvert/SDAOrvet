package advancedFeatures.lecture02.audio;


@FunctionalInterface
public interface Playable {
    // An abstract class is used when you want to share functionality between
    // related objects or classes.

    // An interface on the other is like a contract that applies the functionality
    // defined in it to any class that implements it.

    // Single Abstract Method = Functional Interface

    //    int getVal();
    void play();
}