package ska.gradecalc;

public class HitungGrade {
	public static void main(String[] args) {
		String[] nama_mhs = {"Rina","Agus","Surti"};
		double[][] nilai_semua = {{90, 95, 80, 80},{80, 75, 30, 70},{100, 75, 60, 65}};
		
		for (int i=0;i < nama_mhs.length ; i++) {
			String nama = nama_mhs[i];
			double[] n = nilai_semua[i];
			double nilai_mhs = hitungNilaiAkhir(n[0], n[1], n[2], n[3]);
			String grade_mhs = nilaiKeGrade(nilai_mhs);
			System.out.println("Nilai akhir "+ nama 
					+" adalah: "+nilai_mhs
					+", dengan grade: "+grade_mhs);
		}
				
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
