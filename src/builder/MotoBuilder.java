package builder;

/**
 *
 * @author Leocassio
 */
public abstract class MotoBuilder {
    protected MotoProduct moto; 
    
    public MotoBuilder(){
        moto = new MotoProduct();
    }
    
    public abstract void buidPreco();
    public abstract void buidDscMotor();
    public abstract void buidAnoDeFabricacao();
    public abstract void buidModelo();
    public abstract void buidMontadora();

    public MotoProduct getMoto() {
        return moto;
    }
}
