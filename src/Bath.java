public class Bath {
    private final String
            s1 = "Happy";
    private final String s2 = "Happy";
    private final String s3;
    private String s4;

    private final Soap castille;
    private final int i;
    private final float toy;

    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();

    }

    @Override
    public String toString() {
        if (s4 == null) {
            s4 = "Joy";
        }
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castille=" + castille +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }
    { i = 47; }
}
