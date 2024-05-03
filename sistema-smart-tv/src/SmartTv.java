public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        public void aumentarVolume(){
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        }
        public void abaixarVolume(){
            volume--;
            System.out.println("abaixando o volume para: " + volume);
        }
        public void ligar(){
            ligada=true;
        }
        public void desligar(){
            ligada=false;  
        }
        public void aumentarCanal(){
            canal++;
        }
        public void diminuirCanal(){
            canal--;
        }
        public void mudarCanal( int novoCanal){
            canal = novoCanal;
        }

        }
