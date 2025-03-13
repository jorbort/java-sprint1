package ex01;

class ChordInstrument extends Instrument {

    public ChordInstrument(String p_name, int p_price) {
        this.name = p_name;
        this.price = p_price;
    }

    public void play() {
        System.out.println("A string instrument is playing");
    }
}
