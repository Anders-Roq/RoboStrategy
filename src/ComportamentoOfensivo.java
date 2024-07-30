public class ComportamentoOfensivo implements Comportamento{
    @Override
    public void andar() {
        System.out.println("Andando Apressadamente");
    }

    @Override
    public void atacar() {
        System.out.println("Preparando Para Atacar");
    }

    @Override
    public void defender() {
        System.out.println("Sem Necessidade de Defender");
    }
}
