import java.util.Date;
import java.util.List;

public abstract class ItemColecionavel {
    private String id;
    private String nome;
    private Date dataAquisicao;
    private List<String> autores;

    public ItemColecionavel(String id, String nome, Date dataAquisicao, List<String> autores) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autores = autores;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public List<String> getAutores() {
        return autores;
    }

    public abstract String detalhesEspecificos();
}
