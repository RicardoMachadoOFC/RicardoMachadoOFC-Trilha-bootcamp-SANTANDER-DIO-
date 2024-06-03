public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone("iPhone X", 64);

        meuIPhone.abrirPagina("https://www.google.com.br");
        meuIPhone.navegarPara("https://www.google.com.br");
        meuIPhone.fazerLigacao("123456789");

        meuIPhone.playlist.add("Música 1");
        meuIPhone.playlist.add("Música 2");
        meuIPhone.play();
        meuIPhone.nextTrack();

        meuIPhone.pause();
        meuIPhone.stop();
    }
}

