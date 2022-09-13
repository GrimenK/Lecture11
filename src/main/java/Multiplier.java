@FunctionalInterface
public interface Multiplier<T> {
    public T multiplyInt(T t);

    static void infoStatic(){
        System.out.println("This is functional interface with 2 default 2 static and 1 abstract methods");
    }

    static void infoStaticSecond(){
        System.out.println("This is functional interface with 2 default 2 static and 1 abstract methods");
    }

    default void infoSDefaultSecond(){
        System.out.println("This is functional interface with 2 default 2 static and 1 abstract methods");
    }

    default void infoSDefault(){
        System.out.println("This is functional interface with 2 default 2 static and 1 abstract methods");
    }
}
