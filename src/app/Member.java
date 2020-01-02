package app.data;

public class Member{
    private String ID;
    private String Nama;
    private String TglJoin;

    //Costruction Method
    public Member (String id, String nama, String TglJoin){
        this.ID = id;
        this.Nama = nama;
        this.TglJoin = TglJoin;
    }

    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return ID;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama(){
        return Nama;
    }

    public void SetTglJoin(String TglJoin){
        this.TglJoin = TglJoin;
    }
    public String getTglJoin(){
        return TglJoin;
    }
}