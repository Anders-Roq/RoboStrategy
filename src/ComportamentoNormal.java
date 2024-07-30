public class ComportamentoNormal implements  Comportamento{


    @Override
    public void andar() {
        System.out.println("Andando Preguiçosamente");
    }

    @Override
    public void atacar() {
        System.out.println("Sem Necessidade de Atacar");
    }

    @Override
    public void defender() {
        System.out.println("Sem Necessidade de Defender");
    }
}
