package AgenciaViagens.Serviços;

import AgenciaViagens.Fornecedor;

public class RedeHoteleira extends Fornecedor {

    private static RedeHoteleira redeHoteleira = new RedeHoteleira();

    private RedeHoteleira() {};

    public static RedeHoteleira getInstancia() {
        return redeHoteleira;
    }

}
