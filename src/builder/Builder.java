package builder;

/**
 *
 * @author Leocassio
 */
public class Builder {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria(new HondaBuilder());
        concessionaria.construirMoto();
        
        MotoProduct moto = concessionaria.getMoto();
        
           System.out.println("Moto: " + moto.modelo + "/" + moto.montadora + "\n Ano de Frabricacao: " + moto.anoFabricacao+ "\n Motor da Moto: "
            + moto.dscMotor + "\n Preco: " + moto.preco + "\n");      
    }
    
}
