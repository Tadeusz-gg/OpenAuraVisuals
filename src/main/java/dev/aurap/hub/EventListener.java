package dev.aurap.hub;

@FunctionalInterface
public interface EventListener<E> {
    void onEvent(E event);
}
