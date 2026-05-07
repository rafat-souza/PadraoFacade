package AgenciaViagens;

public class Pacote {

    public boolean reservar() {
        return ViagemFacade.verificarDisponibilidadePacote(this);
    }

}
