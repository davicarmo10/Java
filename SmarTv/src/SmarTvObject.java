public class SmarTvObject {
  
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligarTv ()
    {
        ligada = true;
    }

    public void desligarTv()
    {
        ligada = false;
    }

    public void aumentarVolume()
    {
        volume++;
        
    }

    public void diminuirVolume ()
    {
        volume--;
    }

    public void setVolume (int novoVolume)
    {
        volume = novoVolume;
    }

    public void mudarCanal (int novoCanal)
    {
        canal = novoCanal;
    }
}

