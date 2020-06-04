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
}
