package metodoquicksortlistas;
import java.util.LinkedList;
import java.util.List;
public class MetodoQuickSortListas {

       public static void main(String[] args) {
       System.out.println("Ordenamiento Quick");
         List<Integer> Lista = new LinkedList<Integer>();
         Lista.add(4);
         Lista.add(3);
         Lista.add(1);
         Lista.add(2);
         quick(Lista, 0, Lista.size() - 1);
         for (int i = 0; i < Lista.size(); i++) {
             System.out.print(Lista.get(i) + "  ");
         }
     }
     static void quick(List<Integer> Lista, int primero, int ultimo) {
         int i, j, pivote, auxiliar;
         i = primero;
         j = ultimo;
         pivote = Lista.get(primero);
         do {
             while (Lista.get(i) < pivote) {
                 i++;
             }
             while (Lista.get(j) > pivote) {
                 j--;
             }
             if (i <= j) {
                 auxiliar = Lista.get(i);
                 Lista.set(i, Lista.get(j));
                 Lista.set(j, auxiliar);
                 i++;
                 j--;
             }
         } while (i <= j);
         if (primero<j) {
             quick(Lista, primero, j);
         } 
         if (i < ultimo ) {
             quick(Lista, i, ultimo);
             System.out.println("");
         }
      }
    }

 
    
    
