public interface Room {
    default void comment() {
        System.out.println("Я вхожу в комнату");
    }
}
