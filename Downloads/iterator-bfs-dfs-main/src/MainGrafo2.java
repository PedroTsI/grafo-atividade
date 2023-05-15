import grafo.dirigido.Grafo;
import grafo.iterator.GrafoIterator;

public class MainGrafo2 {

    public static void main(String[] args) {
        Grafo<String> g = new Grafo<>();

        g.addVertice("1");
        g.addVertice("2");
        g.addVertice("3");
        g.addVertice("4");
        g.addVertice("5");
        g.addVertice("6");
        g.addAresta("6", "4", 1);
        g.addAresta("4", "5", 1);
        g.addAresta("4", "3", 1);
        g.addAresta("5", "2", 1);
        g.addAresta("5", "1", 1);
        g.addAresta("1", "2", 1);

        GrafoIterator iterator;

        System.out.println("BFS");
        iterator = g.BFSIterator("6");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("DFS");
        iterator = g.DFSIterator("6");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
