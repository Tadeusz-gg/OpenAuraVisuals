package dev.aurap.hub;

final class UncheckedExceptions {
    private UncheckedExceptions() {}

    @SuppressWarnings("unchecked")
    static <T extends Throwable> RuntimeException rethrow(Throwable failure) throws T {
        throw (T) failure;
    }
}
