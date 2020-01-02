package app.data;

public class Buku{
    private String JudulBuku;
	private String ISBN;
	private String Penulis;
	private String Penerbit;
    private int JumlahHalaman;
    private int TahunTerbit;
    private int Stok;
    
    //Contruction Method
    public Buku (String judul, String isbn, String penulis, String penerbit, int hal, int tahun, int stok){
		this.JudulBuku = judul;
		this.ISBN = isbn;
		this.Penulis = penulis;
		this.Penerbit = penerbit;
        this.JumlahHalaman = hal;
        this.TahunTerbit = tahun;
        this.Stok = stok;
    }
    
    public void setJudulBuku (String JudulBuku){
		this.JudulBuku = JudulBuku;
    }
    public String getJudulBuku(){
		return JudulBuku;
    }
    
    public void setISBN (String ISBN){
		this.ISBN = ISBN;
    }
    public String getISBN(){
		return ISBN;
	}
    
    public void setPenulis (String Penulis){
		this.Penulis = Penulis;
    }    
    public String getPenulis(){
		return Penulis;
    }
    
    public void setPenerbit (String Penerbit){
		this.Penerbit = Penerbit;
    }    
    public String getPenerbit(){
		return Penerbit;
    }
    
    public void setJumlahHalaman (int JumlahHalaman){
		this.JumlahHalaman = JumlahHalaman;
    }    
    public int getJumlahHalaman(){
		return JumlahHalaman;
    }
    
    public void setTahunTerbit (int TahunTerbit){
        this.TahunTerbit = TahunTerbit;
    }
    public int getTahunTerbit(){
        return TahunTerbit;
    }

    public void setStok (int Stok){
        this.Stok = Stok;
    }
    public int getStok(){
        return Stok;
    }

    public void Dipinjam(){
        this.Stok--;
    }
}