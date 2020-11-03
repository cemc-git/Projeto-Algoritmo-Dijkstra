package Dijkstra;

public class Dijkstra {
    private int []antecessor;
    private double []p;
    private int []a;
    public Dijkstra(int nVertice){
        this.antecessor = new int [nVertice];
        this.p = new double[nVertice];
        this.a = new int[nVertice];
    }

    public void Dijkstra(int[][] grafo,Vertice[] vertices, String v1, String v2){
        for(int i = 0; i< grafo[0].length; i++){
            p[i] = Double.POSITIVE_INFINITY;
            antecessor[i] = -1;
            a[i] = vertices[i].chave;
        }
        Vertice auxV = new Vertice(vertices.length);
        int origem = auxV.iVertice(v1);
        int destino = auxV.iVertice(v2);
        p[origem] = 0;
        Min_heapfy heap = new Min_heapfy(a);
        a = heap.min_heapfy(a, 0);
        String S = null;
        int aux = a.length;
        while (aux > 0){
            int u = heap.ExtraiMinimo(a);
            S = S + (vertices[u].vertice + ", ");
            for(int v = 0; v<grafo[0].length; v++){
                if(grafo[u][v] != 0){
                    if(v == destino){
                        S = S+vertices[v].vertice;
                        aux =0;
                    }else {
                        if(p[v] > p[u]+grafo[u][v]){
                            p[v] = p[u]+grafo[v][u];
                            antecessor[v] = u;
                        }
                    }
                }
            }
            aux = heap.size();
        }
    }
}
