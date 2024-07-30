public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void andar() {
        System.out.println("Andando Cautelosamente");
    }

    @Override
    public void atacar() {
        System.out.println("Sem Necessidade de Atacar");

    }

    @Override
    public void defender() {
        System.out.println("Preparando Para Defender");
    }
}
