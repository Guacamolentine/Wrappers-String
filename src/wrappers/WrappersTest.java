package wrappers;

public class WrappersTest {

    public static void main(String[] args) {

        Byte a1 = 15;
        Byte a2 = Byte.valueOf((byte) 15);
        Byte a3 = new Byte((byte) 15);
        Byte a4 = Byte.parseByte("10");

        Short b1 = 20;
        Short b2 = Short.valueOf((short) 20);
        Short b3 = new Short ((short) 20);
        Short b4 = Short.parseShort("20");

        Integer c1 = 25;
        Integer c2 = Integer.valueOf((int) 25);
        Integer c3 = new Integer((int) 25);
        Integer c4 = Integer.parseInt("25");

        Long d1 = 30L;
        Long d2 = Long.valueOf(30);
        Long d3 = new Long(30);
        Long d4 = Long.parseLong("30");

        Float e1 = 35.543546f;
        Float e2 = Float.valueOf(35.54356f);
        Float e3 = new Float(35.5435f);
        Float e4 = Float.parseFloat("35.543546");

        Double f1 = 40.123456;
        Double f2 = Double.valueOf(40.123456);
        Double f3 = new Double(40.123456);
        Double f4 = Double.parseDouble("40.123456");

        Character g1 = 'A';
        Character g2 = Character.valueOf('A');
        Character g3 = new Character('A');

    }
}
