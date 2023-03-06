public class Main {
    public static void main(String[] args) {

        Guitar Acoustics = new Guitar(5);
        Drums Canggu = new Drums(3);
        Truba Piccolo = new Truba(4);

        Instrument[] instruments;
        instruments = new Instrument[] {
                Acoustics, Canggu, Piccolo
        };

        for(Instrument play: instruments ){
            play.play();
        }
    }
}