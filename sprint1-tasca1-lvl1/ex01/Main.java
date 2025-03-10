package ex01;

public class Main {

    public static void main(String[] argv) {
        System.out.println(Instrument.class);

        Instrument flute = new Wind("flauta", 5);
        flute.play();

        Instrument drum = new Percussion("bateria", 100);
        drum.play();

        Instrument guitar = new Cuerda("gibson les paul", 1500);
        guitar.play();
    }
}
