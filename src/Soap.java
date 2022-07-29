public class Soap {
    private final String s;
    Soap () {
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return "Soap{" +
                "s='" + s + '\'' +
                '}';
    }
}
