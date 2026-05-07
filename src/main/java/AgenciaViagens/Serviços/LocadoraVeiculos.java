package AgenciaViagens.Serviços;

import AgenciaViagens.Fornecedor;

public class LocadoraVeiculos extends Fornecedor {

    private static LocadoraVeiculos locadoraVeiculos = new LocadoraVeiculos();

    private LocadoraVeiculos() {};

    public static LocadoraVeiculos getInstancia() {
        return locadoraVeiculos;
    }

}
