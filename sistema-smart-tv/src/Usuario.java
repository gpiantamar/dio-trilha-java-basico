public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv tvSmart = new SmartTv();
        tvSmart.abaixarVolume();
        tvSmart.abaixarVolume();
        tvSmart.abaixarVolume();
        tvSmart.aumentarVolume();
        System.out.println("Volume atual: " + tvSmart.volume);

        System.out.println("Tv ligada? " + tvSmart.ligada);
        System.out.println("Canal tual? " + tvSmart.canal);
        System.out.println("Volume atual? " + tvSmart.volume);

        tvSmart.mudarCanal(30);
        tvSmart.aumentarCanal();
        tvSmart.ligar();
        System.out.println("Novo status -> Tv ligada? " + tvSmart.ligada);
        tvSmart.desigar();
        System.out.println("Novo status -> Tv ligada? " + tvSmart.ligada);
    }
}
