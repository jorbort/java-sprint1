package ex01;

public class Main {

    public static void main(String[] argv) {
        System.out.println(Instrument.class);

        Instrument flute = new WindInstrument("flauta", 5);
        flute.play();

        Instrument drum = new PercussionInstrument("bateria", 100);
        drum.play();

        Instrument guitar = new ChordInstrument("gibson les paul", 1500);
        guitar.play();
    }
}
