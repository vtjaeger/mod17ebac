package v2;

public class Carro<T>{
    public T nome;

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }

    public Carro(T nome) {
        this.nome = nome;
    }
}
