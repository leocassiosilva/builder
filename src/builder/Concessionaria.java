package builder;
/**
 *
 * @author Leocassio
 */
public class Concessionaria {
    protected MotoBuilder montadora;

    public Concessionaria(MotoBuilder montadora) {
        this.montadora = montadora;
    }
    
    public void construirMoto(){
        montadora.buidPreco();
        montadora.buidAnoDeFabricacao();
        montadora.buidDscMotor();
        montadora.buidModelo();
        montadora.buidMontadora();
    }

    public MotoBuilder getMontadora() {
        return montadora;
    }

    MotoProduct getMoto() {
        return montadora.getMoto();
    }
    
    
}
