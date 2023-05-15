package grafo.dirigido;

import java.util.ArrayList;
import java.util.List;

public class Vertice<T> {

    private final T carga;
    private final List<Aresta<T>> adj;
    private VertexState status;

    public Vertice(T carga) {
        this.carga = carga;
        this.adj = new ArrayList<>();
    }

    public VertexState getStatus() {
        return status;
    }

    public void setStatus(VertexState status) {
        this.status = status;
    }

    public T getCarga() {
        return carga;
    }

    public void addAdj(Aresta<T> aresta) {
        adj.add(aresta);
    }

    public List<Aresta<T>> getAdj() {
        return adj;
    }

    public boolean equals(Vertice<T> v) {
        return this.carga.equals(v.carga);
    }

    public String toString() {
        return this.carga.toString();
    }

}
