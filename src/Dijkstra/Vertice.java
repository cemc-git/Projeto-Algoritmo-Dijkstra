package Dijkstra;

public class Vertice {
    int chave;
    String vertice;
    Vertice [] arrayVetices;
    public Vertice(int nVertices){
        this.chave = 0;
        this.vertice = null;
        this.arrayVetices = new Vertice[nVertices];
    }
    public void inserirVertice(Vertice vertice){
        this.arrayVetices[vertice.chave] = vertice;
    }
    public int iVertice(String vertice){
        Integer r = null;
        for(int i =0; i < arrayVetices.length; i++){
            if(arrayVetices[i].vertice.equals(vertice)){
                 r =  arrayVetices[i].chave;
            }
    }
        return r;
    }
}
