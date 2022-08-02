package wrappers;

public class WrappersTest1 {

    public static void main(String[] args) {

        Double dub1 = 30.30;
        byte h;
        short i;
        int j;
        long l;
        float w;

        h = (byte) dub1.intValue();
        i = (short) dub1.intValue();
        j = dub1.intValue();
        l = dub1.intValue();
        w = (float) dub1.intValue();

        Double dub2 = 0.0;
        Double nanValue = dub2/dub2;
        Double infinityValue = dub1/dub2;

        System.out.println(nanValue);
        System.out.println(infinityValue);

        if (nanValue.isNaN()){
            System.out.println("" + "nanValue" + "= NaN");
        }
        if (infinityValue.isInfinite()) {
            System.out.println("" + "infinityValue" + " = Infinity");
        }

        Long v = Long.valueOf(120);
        Long d = Long.valueOf(120);
        if (v < 127) {
            System.out.println(v == d);
        }
    }
}
