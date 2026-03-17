public class TesteSmartTV {
    public static void main(String[] args) throws Exception {
        SmartTV st1 = new SmartTV();
        st1.setVolume(120);
        st1.setVolume(40);
        System.out.println("Volume de st1 " + st1.getVolume());

        SmartTV st2 = new SmartTV("Samsung", "Widescreen 65", 0, true);
        st2.setVolume(10);
    }
}
