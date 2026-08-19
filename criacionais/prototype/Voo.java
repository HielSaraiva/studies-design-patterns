import java.util.List;

public class Voo implements Prototype<Voo> {
    // Tipos imutáveis
    private String origem;
    private String destino;
    private String dataHorario;
    
    // Tipos mutáveis
    private List<Pessoa> passageiros;
    
    public Voo(String origem, String destino, String dataHorario, List<Pessoa> passageiros) {
        this.origem = origem;
        this.destino = destino;
        this.dataHorario = dataHorario;
        this.passageiros = passageiros;
    }

    @Override
    public Voo clonar() {
        // Deep Copy
        List<Pessoa> passageirosClonados = passageiros.stream()
                .map(Pessoa::clonar)
                .toList();
        return new Voo(this.origem, this.destino, this.dataHorario, passageirosClonados);
        
        // Shallow Copy
        // return this;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(String dataHorario) {
        this.dataHorario = dataHorario;
    }

    public List<Pessoa> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Pessoa> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Voo other = (Voo) obj;
        if (origem == null) {
            if (other.origem != null)
                return false;
        } else if (!origem.equals(other.origem))
            return false;
        if (destino == null) {
            if (other.destino != null)
                return false;
        } else if (!destino.equals(other.destino))
            return false;
        if (dataHorario == null) {
            if (other.dataHorario != null)
                return false;
        } else if (!dataHorario.equals(other.dataHorario))
            return false;
        if (passageiros == null) {
            if (other.passageiros != null)
                return false;
        } else if (!passageiros.equals(other.passageiros))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Voo [origem=" + origem + ", destino=" + destino + ", dataHorario=" + dataHorario + ", passageiros="
                + passageiros + "]";
    }
}
