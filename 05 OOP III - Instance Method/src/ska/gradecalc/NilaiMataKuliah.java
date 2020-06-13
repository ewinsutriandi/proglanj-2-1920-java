package ska.gradecalc;

public class NilaiMataKuliah {
	String nama;
	String namaMatKul;
	double nilaiHadir;
	double nilaiTugas;
	double nilaiUTS;
	double nilaiUAS;
	public NilaiMataKuliah(String nama, String namaMatKul, double nilaiHadir, double nilaiTugas, double nilaiUTS,
			double nilaiUAS) {
		super();
		this.nama = nama;
		this.namaMatKul = namaMatKul;
		this.nilaiHadir = nilaiHadir;
		this.nilaiTugas = nilaiTugas;
		this.nilaiUTS = nilaiUTS;
		this.nilaiUAS = nilaiUAS;
	}
	
	double hitungNilaiAkhir() {
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
	
	String gradeAkhir() {
		double nilaiAkhir = hitungNilaiAkhir();
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
