package grafo.dirigido;

public class Aresta<T> {

    private final Vertice<T> origem;
    private final Vertice<T> destino;
    private final int peso;

    public Aresta(Vertice<T> origem, Vertice<T> destino, int peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    public Vertice<T> getOrigem() {
        return origem;
    }

    public Vertice<T> getDestino() {
        return destino;
    }

    public String toString() {
        return origem.getCarga().toString() + " --(" + peso + ")--> " + destino.getCarga().toString();
    }

}
