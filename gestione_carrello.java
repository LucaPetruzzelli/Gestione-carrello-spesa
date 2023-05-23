import java.util.*;
public class gestione_carrello {

	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);

	    Prodotto prodotto;
	    Queue<Prodotto> carrello = new LinkedList<>();
	    Stack<Prodotto> pilaScambio = new Stack<>();
	    
	    double costoTotale = 0, costoUnitario, costoMedio;
	    int N, i, quantitaTotale = 0, quantita;
	    String descrizione;

	    do {
	        System.out.println("Quanti prodotti vuoi comprare (singolarmente)?");
	        N = in.nextInt();
	    } while (N<1);

	    for (i = 0; i < N; i++) {
	        System.out.println("Inserisci la descrizione del " + (i+1) + "° prodotto:");
	        descrizione = in.next();

	        do {
	            System.out.println("Inserisci la quantità del prodotto n." + (i+1) + " che vuoi acquistare:");
	            quantita = in.nextInt();
	        } while (quantita<1);

	        do {
	            System.out.println("Inserisci il costo del singolo prodotto n." + (i+1) + ":");
	            costoUnitario = in.nextDouble();
	        } while (costoUnitario<0.01);

	        prodotto = new Prodotto(descrizione, quantita, costoUnitario);
	        carrello.add(prodotto);
	        pilaScambio.add(prodotto);
	      }
	    
	    for (i = 0; i < N; i++) {
	    	prodotto = carrello.poll();
	    	costoTotale += prodotto.costoTotale();
	    	quantitaTotale += prodotto.getQuantita();
	    }

	    costoMedio = costoTotale / quantitaTotale;

	    System.out.println("Il costo totale del carrello è di " + costoTotale + "€");
	    System.out.println("La quantità totale di prodotti acquistati è di " + quantitaTotale);
	    System.out.println("Il costo medio del carrello è di " + costoMedio + "€");

	    while (!pilaScambio.isEmpty()) {
	        carrello.add(pilaScambio.pop());
	    }

	    System.out.println("Coda invertita: " + carrello.toString());

	}

}
