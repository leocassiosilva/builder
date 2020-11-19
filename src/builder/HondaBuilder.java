package builder;

/**
 *
 * @author Leocassio
 */
public class HondaBuilder extends MotoBuilder{

    @Override
    public void buidPreco() {
        moto.preco = 10920.00;
    }

    @Override
    public void buidDscMotor() {
        moto.dscMotor = "160 Flex";
    }

    @Override
    public void buidAnoDeFabricacao() {
        moto.anoFabricacao = 2020;
    }

    @Override
    public void buidModelo() {
        moto.modelo = "CG - Titan";
    }

    @Override
    public void buidMontadora() {
        moto.montadora = "Honda";
    }
    
}
