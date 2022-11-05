package src;

public class AppTeste {
    public static void main(String[] args){

        Graph g = new Graph(7);
        g.addEdge(0,5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0, 6);
        g.addEdge(6,4);
        g.addEdge(4,3);
        g.addEdge(4,5);

        System.out.println(g);
        System.out.println("--------");
        System.out.println(g.toDot());
        System.out.println("--------");


        DepthFirstsPaths caminhos_do_0 = new DepthFirstsPaths(g, 0);

        BuscaEmLargura3 bfs = new BuscaEmLargura3(g, 0);
    }
}
