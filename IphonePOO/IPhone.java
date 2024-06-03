import java.util.ArrayList;
import java.util.List;



public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public String modelo;
    public int capacidadeArmazenamento;
    public int estadoBateria;
    public boolean reproduzindo;
    public List<String> playlist;
    private boolean emChamada;
    public String paginaAtual;

    public IPhone(String modelo, int capacidadeArmazenamento) {
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.estadoBateria = 100;
        this.reproduzindo = false;
        this.emChamada = false;
        this.playlist = new ArrayList<>();
    }

    public void play() {
        if (!playlist.isEmpty()) {
            reproduzindo = true;
            System.out.println("Reproduzindo música: " + playlist.get(0));
        } else {
            System.out.println("Playlist vazia. Adicione músicas para reproduzir.");
        }
    }

    public void pause() {
        if (reproduzindo) {
            reproduzindo = false;
            System.out.println("Música pausada.");
        } else {
            System.out.println("Não há música reproduzindo para pausar.");
        }
    }

    public void stop() {
        if (reproduzindo) {
            reproduzindo = false;
            System.out.println("Música parada.");
        } else {
            System.out.println("Não há música reproduzindo para parar.");
        }
    }

    public void nextTrack() {
        if (reproduzindo) {
            System.out.println("Próxima música.");
        } else {
            System.out.println("Não há música reproduzindo para ir para a próxima faixa.");
        }
    }

    public void previousTrack() {
        if (reproduzindo) {
            System.out.println("Música anterior.");
        } else {
            System.out.println("Não há música reproduzindo para voltar para a faixa anterior.");
        }
    }

    public void fazerLigacao(String numero) {
        if (!emChamada) {
            System.out.println("Fazendo ligação para " + numero + "...");
            emChamada = true;
        } else {
            System.out.println("Já existe uma chamada em andamento.");
        }
    }

    public void receberLigacao(String numero) {
        if (!emChamada) {
            System.out.println("Recebendo ligação de " + numero + "...");
            emChamada = true;
        } else {
            System.out.println("Já existe uma chamada em andamento.");
        }
    }

    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
        paginaAtual = url;
    }

    public void fecharPagina() {
        System.out.println("Fechando página atual...");
        paginaAtual = null;
    }

    public void navegarPara(String url) {
        System.out.println("Navegando para página: " + url);
        paginaAtual = url;
    }
}
