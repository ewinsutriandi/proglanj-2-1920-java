package ska.gradecalc;

public class HitungGrade {
	public static void main(String[] args) {
		NilaiMataKuliah obj;
		obj = new NilaiMataKuliah("Agus","Pemrograman Lanjut",80,75,83,70);				
		double nilaiAkhir = obj.hitungNilaiAkhir();
		String gradeAgus = obj.gradeAkhir();
		String teks = obj.nama +" pada mata kuliah "+ obj.namaMatKul +" memperoleh nilai akhir: "+nilaiAkhir+ ", dengan grade:"+ gradeAgus;
		System.out.println(teks);
	}	
}
