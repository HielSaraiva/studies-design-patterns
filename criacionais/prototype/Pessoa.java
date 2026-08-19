public class Pessoa implements Prototype<Pessoa>{

    // Tipos imutáveis
    private String nome;
    private Integer idade;
    private Double altura;
    
    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public Pessoa clonar() {
        return new Pessoa(this.nome, this.idade, this.altura); // Deep Copy
        // return this; // Shallow Copy
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (idade == null) {
            if (other.idade != null)
                return false;
        } else if (!idade.equals(other.idade))
            return false;
        if (altura == null) {
            if (other.altura != null)
                return false;
        } else if (!altura.equals(other.altura))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
}
