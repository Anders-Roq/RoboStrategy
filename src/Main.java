
public class Main {

    public static void main(String[] args) {

        Comportamento normal = new ComportamentoNormal();
        Comportamento ofensivo = new ComportamentoOfensivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.andar();
        robo.atacar();
        robo.defender();

        System.out.println("**********");

        robo.setComportamento(ofensivo);
        robo.andar();
        robo.atacar();
        robo.defender();

        System.out.println("**********");

        robo.setComportamento(defensivo);
        robo.andar();
        robo.atacar();
        robo.defender();

    }
}