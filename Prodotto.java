
public class Prodotto {
	
	private String descrizione;
	private int quantita;
	private double costoUnitario;
	
	public Prodotto(String descrizione, int quantita, double costoUnitario) {
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.costoUnitario = costoUnitario;
	}
	
	public double costoTotale() {
		return quantita*costoUnitario;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public int getQuantita() {
		return quantita;
	}
	
	public double getCostoUnitario() {
		return costoUnitario;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	public String toString() {
		return "[" + getDescrizione() + ", " +getQuantita() + ", " +getCostoUnitario() + "]";
	}

}