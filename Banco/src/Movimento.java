import java.io.Serializable;
import java.util.Date;

public class Movimento implements Serializable {
    private String tipoMovimento;
    private float valor;
    private Date data;
    private String descricao;

    public Movimento(String tipoMovimento, float valor, String descricao) {
        this.tipoMovimento = tipoMovimento;
        this.valor = valor;
        this.descricao = descricao;
        this.data = new Date();
    }

    @Override
    public String toString() {
        return this.tipoMovimento + " | " + this.valor + " | " + this.descricao + " | " + this.data;
    }
}
