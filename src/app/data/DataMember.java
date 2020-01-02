package app.data;

public class DataMember{
	private String ID;
	private String Nama;
	private String TglJoin;
    private String Alamat;
    
    //Constrution Method
    public DataMember (String id, String nama, String TglJoin, String alamat){
		this.ID = id;
		this.Nama = nama;
		this.TglJoin = TglJoin;
        this.Alamat = alamat;
    }
    
    public void setID (String ID){
		this.ID = ID;
    }
    public String getID(){
		return ID;
	}

    public void setNama (String Nama){
		this.Nama = Nama;
    }
    public String getNama(){
		return Nama;
    }
    
    public void setTglJoin (String TglJoin){
		this.TglJoin = TglJoin;
    }
    public String getTglJoin(){
		return TglJoin;
    }
    
    public void setAlamat (String Alamat){
		this.Alamat = Alamat;
    }
    public String getAlamat(){
		return Alamat;
	}
}	