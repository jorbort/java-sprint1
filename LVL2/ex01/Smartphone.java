package LVL2.ex01;
class Smartphone extends Telephone implements Camera, Watch {

    public Smartphone(String p_brand, String p_model) {
        this.brand = p_brand;
        this.model = p_model;
    }

    @Override
    public void takePicture() {
        System.out.println("Taking a picture");
    }

    @Override
    public void alarm() {
        System.out.println("the alarm is ringing!!!");
    }
}
