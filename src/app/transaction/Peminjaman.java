package app.transaction;
import app.data.Buku;
import app.data.Member;

import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Peminjaman{
    private String kodeTransaksi;
    private HashMap<String, Buku> borrowedBooks = new HashMap<String, Buku>();
    private Member member;
    private Date dateTime;

    public Peminjaman(Member member){
        this.member = member;
        Date today = new Date();
        this.dateTime = today;
    }

    public String getKodeTransaksi(){
        return kodeTransaksi;
    }
    public void setKodeTransaksi(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String date = formatter.format(this.dateTime);
        this.kodeTransaksi = this.member.getID()+"-"+ date;
    }
    //mengambil semua data buku dalam satu transaksi
    public HashMap<String, Buku> getBooks(){
        return borrowedBooks;
    }
    //menambahkan satu buku yg akan dipinjam
    public void addBook(String isbn, Buku buku){
        this.borrowedBooks.put(isbn, buku);
        System.out.println("Buku" + borrowedBooks.get(isbn).getJudulBuku()+ " Buku Telah Ditambahkan"); //mengambil buku yg sudah di hashmap pertama kali dengan parameter
    }
    //menambahkan satu buku yg akan dipinjam dgn menggunakan isbn
    public Buku getBook(String isbn){
        return this.borrowedBooks.get(isbn);
    }
}