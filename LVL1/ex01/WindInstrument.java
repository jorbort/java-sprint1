package ex01;

class WindInstrument extends Instrument {

    public WindInstrument(String p_name, int p_price) {
        this.name = p_name;
        this.price = p_price;
    }

    public void play() {
        System.out.println("A Wind instrument is playing");
    }
}
