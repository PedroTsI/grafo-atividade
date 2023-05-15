package grafo.dirigido;

import grafo.iterator.BFSIterator;
import grafo.iterator.DFSIterator;
import grafo.iterator.GrafoIterator;

import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {

    private final List<Vertice<T>> vertices;
    private final List<Aresta<T>> arestas;

    public Grafo() {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
    }

    public Vertice<T> getVertice(T carga) {
        for (Vertice<T> u : vertices) {
            if (u.getCarga().equals(carga)) return u;
        }
        return null;
    }

    public void addVertice(T carga) {
        if (getVertice(carga) == null) {
            vertices.add(new Vertice<>(carga));
        }
    }

    public Aresta<T> getAresta(Vertice<T> origem, Vertice<T> destino) {
        for (Aresta<T> aresta : arestas) {
            if (aresta.getOrigem().equals(origem) && aresta.getDestino().equals(destino))
                return aresta;
        }
        return null;
    }

    public void addAresta(T origem, T destino, int peso) {
        Vertice<T> u, v;
        if ((u = getVertice(origem)) == null || (v = getVertice(destino)) == null) return;

        if (getAresta(u, v) == null) {
            Aresta<T> e = new Aresta<>(u, v, peso);
            u.addAdj(e);
            arestas.add(e);
        }
    }

    @SuppressWarnings("unchecked")
    public GrafoIterator<T> BFSIterator(T carga) {
        return new BFSIterator<T>(this.vertices, this.arestas, carga);
    }

    @SuppressWarnings("unchecked")
    public GrafoIterator<T> DFSIterator(T carga) {
        return new DFSIterator<T>(this.vertices, carga);
    }

}
