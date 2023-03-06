public class Main {
    public static void main(String[] args) {
        Book HarryPotter = new Book("Гарри Поттер и философский камень");
        Magazine Sting = new Magazine("Жало");
        Book Night = new Book("Ночь");
        Magazine LifeAndArt = new Magazine("Жизнь и творчество");

        Printable[] printable;
        printable = new Printable[] {
                HarryPotter, Sting, Night, LifeAndArt
        };

        for(Printable print: printable ){
            print.print();
        }

    }
}