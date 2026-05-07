package AgenciaViagens.Serviços;

import AgenciaViagens.Fornecedor;

public class CompanhiaAerea extends Fornecedor {

    private static CompanhiaAerea companhiaAerea = new CompanhiaAerea();

    private CompanhiaAerea() {};

    public static CompanhiaAerea getInstancia() {
        return companhiaAerea;
    }

}
