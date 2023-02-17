
public class ContoCasino extends ContoCorrente{

	public ContoCasino(double conto) {
		super(conto);
		this.conto=100000;
		
	}
	public void TrasferisciSu(int n, int somma, ContoGiocatore a, ContoCasino b) {
		
		a.conto-=somma;
		this.conto+=somma;
		
		
	}

}
