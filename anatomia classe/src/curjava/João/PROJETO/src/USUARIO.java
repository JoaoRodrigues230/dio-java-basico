public class USUARIO {
    public static void main(String[] args){
        
        smartTv SmartTv = new smartTv();

        System.out.println("TV LIGADA?" + SmartTv.ligada);
        
            SmartTv.ligar();

                System.out.println("Novo Status -> TV LIGADA?" + SmartTv.ligada);

        System.out.println("VOLUME:" + SmartTv.volume);
        
            SmartTv.aumentarVolume();
            SmartTv.aumentarVolume();
            SmartTv.diminuirVolume();

                System.out.println("Novo Status -> VOLUME:" + SmartTv.volume);

        System.out.println("CANAL:" + SmartTv.canal);

            SmartTv.mudarCanal(13);
                
                System.out.println("Novo Status -> CANAL:" + SmartTv.canal);
    }


}
