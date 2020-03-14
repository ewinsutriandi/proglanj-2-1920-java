package ska.gradecalc;

public class HitungGrade {
	public static void main(String[] args) {
		double nilaiAgus = hitungNilaiAkhir(80, 75, 30, 70);
		double nilaiRina = hitungNilaiAkhir(90, 95, 80, 80);
		
		System.out.println("Nilai akhir Agus adalah: "+nilaiAgus);
		System.out.println("Nilai akhir Rina adalah: "+nilaiRina);
		
		String gradeAgus = nilaiKeGrade(nilaiAgus);
		String gradeRina = nilaiKeGrade(nilaiRina);
		
		System.out.println("Grade yang didapat Agus: "+gradeAgus);
		System.out.println("Grade yang didapat Rina: "+gradeRina);
	}
	
	static double hitungNilaiAkhir(double nilaiHadir, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
		double bobotHadir = 0.15;
		double bobotTugas = 0.25;
		double bobotUTS = 0.30;
		double bobotUAS = 0.30;
		
		double nilaiAkhir = bobotHadir * nilaiHadir 
				+ bobotTugas * nilaiTugas 
				+ bobotUTS * nilaiUTS
				+ bobotUAS * nilaiUAS;		
		return nilaiAkhir;
	}
	
	static String nilaiKeGrade(double nilaiAkhir) {
		String grade;
		if (nilaiAkhir >= 85) {
			grade = "A";
		}
		else if (nilaiAkhir >= 70) {
			grade = "B";
		}
		else if (nilaiAkhir >= 50) {
			grade = "C";
		}
		else if (nilaiAkhir >= 40) {
			grade = "D";
		}
		else {
			grade = "E";
		}
		return grade;
	}

}
