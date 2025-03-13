package ex01;

class PercussionInstrument extends Instrument {

    public PercussionInstrument(String p_name, int p_price) {
        this.name = p_name;
        this.price = p_price;
    }

    public void play() {
        System.out.println("A percussion instrument is playing");
    }
}
