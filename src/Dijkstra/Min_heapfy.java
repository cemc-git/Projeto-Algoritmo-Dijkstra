package Dijkstra;

public class Min_heapfy {
    int i;
    public Min_heapfy(int []a){
        this.i = a.length;
    }
    public int[] min_heapfy(int []a, int count){
        int menor;
        int aux;
        int l = 2*count+1;
        int r = (2*count)+2;
        if(l<= a.length-1 && a[l] < a[count]) {
            menor = l;
        }else {
            menor = count;
        }if(r<= a.length-1 && a[r] < a[menor]) {
            menor = r;
        }if(menor!=count ) {
            aux = a[menor];
            a[menor] = a[count];
            a[count] = aux;
            min_heapfy(a, menor);
        }
        return a;
    }
    public int ExtraiMinimo(int []a){
        int minimo = a[0];
        a[0] = a[i];
        a[i-1] = 0;
        i--;
        min_heapfy(a,0);
        return minimo;
    }
    public int size(){
        return i;
    }
}

