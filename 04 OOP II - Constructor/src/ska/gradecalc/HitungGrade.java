package ska.gradecalc;

public class HitungGrade {
	public static void main(String[] args) {
		NilaiMataKuliah obj;
		obj = new NilaiMataKuliah("Agus","Pemrograman Lanjut",80,75,83,70);				
		double nilaiAkhir = hitungNilaiAkhir(obj.nilaiHadir, obj.nilaiTugas, obj.nilaiUTS, obj.nilaiUAS);
		String gradeAgus = nilaiKeGrade(nilaiAkhir);
		String teks = obj.nama +" pada mata kuliah "+ obj.namaMatKul +" memperoleh nilai akhir: "+nilaiAkhir+ ", dengan grade:"+ gradeAgus;
		System.out.println(teks);
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
