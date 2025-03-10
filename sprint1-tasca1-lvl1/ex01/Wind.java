package ex01;

class Wind extends Instrument {

    public Wind(String p_name, int p_price) {
        this.name = p_name;
        this.price = p_price;
    }

    public void play() {
        System.out.println("A Wind instrument is playing");
    }
}
