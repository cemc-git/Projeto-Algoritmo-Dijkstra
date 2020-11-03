package Dijkstra;

public class Arestas {
    private double matriz [][];
    Vertice v1;
    Vertice v2;
    public double peso;
    public Arestas(){
        this.v1 = null;
        this.v2 = null;
        this.peso = 0.0;
    }
    public void inserirAresta(Vertice v1, Vertice v2, double peso){
        matriz[v1.chave][v2.chave] = peso;
    }
}
