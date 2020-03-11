package refresh.proglanj;

public class Refresh {
	
	public static void main(String[] args) {		
		double bobotHadir = 0.15;
		double bobotTugas = 0.25;
		double bobotUTS = 0.30;
		double bobotUAS = 0.30;
		
		double nilaiKehadiran = 75.0;
		double nilaiTugas = 80;
		double nilaiUTS = 75;
		double nilaiUAS = 89;
		
		double nilaiAkhir = bobotHadir * nilaiKehadiran 
				+ bobotTugas * nilaiTugas 
				+ bobotUTS * nilaiUTS
				+ bobotUAS * nilaiUAS;
		
		System.out.println(nilaiAkhir);
		
		if (nilaiAkhir >= 85) {
			System.out.println("A");
		}
		else if (nilaiAkhir >= 70) {
			System.out.println("B");
		}
		else if (nilaiAkhir >= 50) {
			System.out.println("C");
		}
		else if (nilaiAkhir >= 40) {
			System.out.println("D");
		}
		else {
			System.out.println("E");
		}
	}
}
