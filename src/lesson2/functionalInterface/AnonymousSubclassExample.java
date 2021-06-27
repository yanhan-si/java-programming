package lesson2.functionalInterface;

public final class AnonymousSubclassExample {
    private final Runnable withLambda =
            () -> System.out.println("From lambda: " + this.getClass());
    private final Runnable withSubclass = new Runnable() {
        @Override
        public void run() {
            System.out.println("From subclass: " + this.getClass());
        }
    };

    public static void main(String[] args) {
        AnonymousSubclassExample thisExample = new AnonymousSubclassExample();
        thisExample.withLambda.run();
        thisExample.withSubclass.run();
    }

}
