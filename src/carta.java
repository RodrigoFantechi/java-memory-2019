import java.util.Objects;

public class carta {

    String nome = "";
    Boolean selected = false;
Boolean scoperta = true;

    public carta(String nome, Boolean selected, Boolean scoperta) {
        this.nome = nome;
        this.selected = selected;
        this.scoperta= scoperta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setScoperta(Boolean scoperta) {
        this.scoperta = scoperta;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Boolean getScoperta() {
        return scoperta;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getSelected() {
        return selected;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        carta carta = (carta) o;
        return Objects.equals(nome, carta.nome) &&
                selected.equals(carta.selected) &&
                scoperta.equals(carta.scoperta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, selected, scoperta);
    }
}
