package AgenciaViagens;

import AgenciaViagens.Serviços.CompanhiaAerea;
import AgenciaViagens.Serviços.LocadoraVeiculos;
import AgenciaViagens.Serviços.RedeHoteleira;

public class ViagemFacade {

    public static boolean verificarDisponibilidadePacote(Pacote pacote) {
        if (CompanhiaAerea.getInstancia().verificarPacoteComRestricao(pacote)) {
            return false;
        }
        if (RedeHoteleira.getInstancia().verificarPacoteComRestricao(pacote)) {
            return false;
        }
        if (LocadoraVeiculos.getInstancia().verificarPacoteComRestricao(pacote)) {
            return false;
        }
        return true;
    }

}
