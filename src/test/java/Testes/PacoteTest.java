package Testes;

import AgenciaViagens.Pacote;
import AgenciaViagens.Serviços.CompanhiaAerea;
import AgenciaViagens.Serviços.LocadoraVeiculos;
import AgenciaViagens.Serviços.RedeHoteleira;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PacoteTest {

    @Test
    void deveRetornarSucessoReservaSemRestricao() {
        Pacote pacote = new Pacote();
        assertTrue(pacote.reservar());
    }

    @Test
    void deveRetornarFalhaReservaComRestricaoCompanhiaAerea() {
        Pacote pacote = new Pacote();
        CompanhiaAerea.getInstancia().addPacoteRestrito(pacote);
        assertFalse(pacote.reservar());
    }

    @Test
    void deveRetornarFalhaReservaComRestricaoRedeHoteleira() {
        Pacote pacote = new Pacote();
        RedeHoteleira.getInstancia().addPacoteRestrito(pacote);
        assertFalse(pacote.reservar());
    }

    @Test
    void deveRetornarFalhaReservaComRestricaoLocadoraVeiculos() {
        Pacote pacote = new Pacote();
        LocadoraVeiculos.getInstancia().addPacoteRestrito(pacote);
        assertFalse(pacote.reservar());
    }

}
