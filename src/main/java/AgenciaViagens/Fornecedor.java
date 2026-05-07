package AgenciaViagens;

import java.util.ArrayList;
import java.util.List;

public abstract class Fornecedor {

    private List<Pacote> pacotesComRestricao = new ArrayList<Pacote>();

    public void addPacoteRestrito(Pacote pacote) {
        this.pacotesComRestricao.add(pacote);
    }

    public boolean verificarPacoteComRestricao(Pacote pacote) {
        return this.pacotesComRestricao.contains(pacote);
    }

}
