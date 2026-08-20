public class Moto  extends Veiculo
{
    public int cilindradas;

    public Moto(String modelo, int ano, int cilindradas) {
        super(modelo,ano);
        this.cilindradas = cilindradas;

    }
    public String ImprimirDetalhes()
    {
        return super.ImprimirDetalhes() + "\nCilindradas" + cilindradas;
    }

}