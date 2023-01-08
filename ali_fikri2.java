package fikri;
import java.io.*;
import java.util.ArrayList;


public class Condition extends mahasiswa1{
    public static void percabangan()throws IOException{
        System.out.println("[1] Show All Nama Mahasiswa & NIM Mahasiswa");
        System.out.println("[2] Remove Nama Mahasiswa & NIM Mahasiswa");
        System.out.println("[3] Update Nama Mahasiswa & NIM Mahasiswa");
        System.out.println("[4] Add Nama Mahasiswa & NIM Mahasiswa");
        System.out.println("[5] Exit From Program");
        System.out.println("============================");
        System.out.print("Pilih nomor : ");
        
        try{ int pilihNomor = Integer.parseInt(scan.readLine());
        switch(pilihNomor){
           case 1:
               //SHOW DATA NAMA & NIM MAHASISWA
                showAllNama();
                System.out.println("============================");
                showAllNIM();
                System.out.println("============================");
                break;
                
                
            case 2:
                //DELETE NAMA & NIM MAHASISWA
                if(mhs.size()==0){
                System.out.println("BELUM ADA DAFTAR.!!");
                System.out.println("============================");
                }else{
                LabeledBreak2 : { {for(int i=0; i<1; i++){
                System.out.print("YAKIN INGIN MELANJUTKAN DELETE YES/NO.? : ");
                String pilihan = scan.readLine();
                if(pilihan.equalsIgnoreCase("yes")){
                System.out.println("+-------------------+-------------+");
                System.out.println("|       NAMA        |     NIM     |");
                System.out.println("+-------------------+-------------+");
                for(int a=0; a<mhs.size(); a++){
                    String tbl = "|  %-15s  |";
                    String tbl1 = "  %-10s |%n";
                if(a%2==0){
                    //Ini untuk nama mahasiswa
                    System.out.format(tbl, mhs.get(a));
                }else{
                    //Ini untuk NIM mahasiswa
                    System.out.format(tbl1, mhs.get(a));
                }
                }
                System.out.println("+-------------------+-------------+");
                delete();
                
                }else{
                    System.out.println("============================");
                    System.out.println("      - CANCEL DELETE -     ");
                    System.out.println("============================");
                    break LabeledBreak2;
                }
                }
                }
                
                    }}
                
            case 3:
                //UPDATE NAMA & NIM MAHSISWA
                LabeledBreak1:{
                if(mhs.size()==0){
                System.out.println("BELUM ADA DAFTAR.!!");
                System.out.println("============================");
                }else{

                System.out.println("+-------------------+-------------+");
                System.out.println("|       NAMA        |     NIM     |");
                System.out.println("+-------------------+-------------+");
                for(int a=0; a<mhs.size(); a++){
                    String tbl = "|  %-15s  |";
                    String tbl1 = "  %-10s |%n";
                if(a%2==0){
                    //Ini untuk nama mahasiswa
                    System.out.format(tbl, mhs.get(a));
                }else{
                    //Ini untuk NIM mahasiswa
                    System.out.format(tbl1, mhs.get(a));
                }
                }
                System.out.println("+-------------------+-------------+");
                
                System.out.print("YAKIN INGIN MELAKUKAN PERUBAHAN YES/NO.? : ");
                String update = scan.readLine();
                
                if(update.equalsIgnoreCase("yes")){
                for(int i=0; i<1; i++){
                
                setNama();
                setNIM();
                }
                }else{
                    System.out.println("============================");
                    System.out.println("     - CANCEL DELETE -      ");
                    System.out.println("============================");
                break LabeledBreak1;
                }
                System.out.println("");
                System.out.println("============= NEW DATA =============");
                System.out.println("+-------------------+-------------+");
                System.out.println("|       NAMA        |     NIM     |");
                System.out.println("+-------------------+-------------+");
                for(int b=0; b<mhs.size(); b++){
                    String tbl = "|  %-15s  |";
                    String tbl1 = "  %-10s |%n";
                if(b%2==0){
                    //Ini untuk nama mahasiswa
                    System.out.format(tbl, mhs.get(b));
                }else{
                    //Ini untuk NIM mahasiswa
                    System.out.format(tbl1, mhs.get(b));
                }
                }
                System.out.println("+-------------------+-------------+");
                }}
                break;
                
                
            case 4:
                //ADD NAMA & NIM MAHASISWA
                System.out.println("[1] Tambah nama");
                System.out.println("[2] Tambah NIM");
                LabeledBreak1 : {
                for(int i=0; i<2; i++){
                System.out.print("Nomor : ");
                int input = Integer.parseInt(scan.readLine());
                if(input==1){
                addnama();}else if (input==2){
                    addnim(); 
                }else{
                System.out.println("Nomor yang anda masukkan salah.!!");
                break LabeledBreak1;
                }
                }
                }
            break;
            
            
            case 5:
                //KEMBALIKAN DATA NAMA & NIM MAHASISWA
                System.out.println("==========DATA MAHASISWA==========");
                System.out.println("");
                System.out.println("+-------------------+-------------+");
                System.out.println("|       NAMA        |     NIM     |");
                System.out.println("+-------------------+-------------+");
                for(int i=0; i<mhs.size(); i++){
                    String tbl = "|  %-15s  |";
                    String tbl1 = "  %-10s |%n";
                if(i%2==0){
                    //Ini untuk nama mahasiswa
                    System.out.format(tbl, mhs.get(i));
                }else{
                    //Ini untuk NIM mahasiswa
                    System.out.format(tbl1, mhs.get(i));
                }
                }
                System.out.println("+-------------------+-------------+");
                if(mhs.size()==0){
                    System.out.println("         DATA MASIH KOSONG..!!");
                }
                System.out.println("");
                System.out.println("             THANK YOU");
                System.exit(0);
                break;
            
                
            default:
                System.out.println("Angka yang anda masukkan tidak ada.!");
                System.out.println("Silahkan coba kembali...");
          }    
         }
         catch(Exception e){
              System.err.println("     TERJADI KESALAHAN"); 
              System.out.println("____________________________");
         }finally{
            System.out.println("    LANJUTKAN PILIHAMU      ");
            System.out.println("----------------------------");
        }
    }
}

