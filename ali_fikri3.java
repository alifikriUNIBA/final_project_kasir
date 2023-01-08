package fikri;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class mahasiswa1{
    public static boolean isRunning = true;
    static ArrayList mhs = new ArrayList();
    static InputStreamReader inputStreamReader = new InputStreamReader (System.in);
    static BufferedReader scan = new BufferedReader (inputStreamReader);
    
    //Add nama mahasiswa
    static void addnama()throws IOException{
        System.out.print("Masukkan nama mahasiswa : ");
        String nama = scan.readLine();
        if(nama==""){
        mhs.add(null);
        }else {
        mhs.add(nama);;}
    }
    
    
    //Add NIM mahasiswa
    static void addnim()throws IOException{
        System.out.print("Masukkan NIM mahasiswa : ");
        int nim = Integer.parseInt(scan.readLine());
        System.out.println("============================");
        if(nim==0){
        String nol = null;
        mhs.add(nol);
        }else {
        mhs.add(nim);}
    }
    
    //Melakukan update pada data nama mahasiswa
   static void setNama()throws IOException{
       showAllNama();
       System.out.print("Masukkan nomor : ");
       int indexSet = Integer.parseInt(scan.readLine());
       System.out.print("Masukkan nama baru : ");
       String newName = scan.readLine();
       System.out.println("============================");
       mhs.set(indexSet,newName);
   }
   
   //Melakukan update pada data NIM mahasiswa
   static void setNIM()throws IOException{
       showAllNIM();
       System.out.print("Masukkan nomor : ");
       int indexSet = Integer.parseInt(scan.readLine());
       System.out.print("Masukkan NIM baru : ");
       String newNIM = scan.readLine();
       System.out.println("============================");
       mhs.set(indexSet,newNIM);
   }
   //Melakukan penegcekan terhadap data nama mahasiswa
    public static void showAllNama(){
       if (mhs.isEmpty()){
           System.out.println("Daftar nama mahasiswa masih belum ada.!");
       }else{
           for(int i=0; i<mhs.size(); i++){
               if (i%2==0){
               System.out.println(String.format("[%d] %s", i, mhs.get(i)));
               }
           }
       }
      
   }
   
   //Melakukan pengecekan terhadap NIM mahasiswa
   public static void showAllNIM(){
       if (mhs.isEmpty()){
           System.out.println("Daftar NIM mahasiswa masih belum ada.!");
       }else{
           for(int i=0; i<mhs.size(); i++){
               if (i%2!=0){
               System.out.println(String.format("[%d] %s", i, mhs.get(i))); 
               }
           }
       }
   }
   
   //Melakukan delete pada data nama dan NIM mahasiswa
   static void delete()throws IOException{
       showAllNama();
       System.out.print("Masukkan nomor : ");
       int indexDelete = Integer.parseInt(scan.readLine());
   
       if(indexDelete<mhs.size()){
       if(indexDelete>=0){    
       System.out.println("============================");
       if(indexDelete>-1){
       int bug = indexDelete+1;
       mhs.remove(bug);
       }
       
       mhs.remove(indexDelete);
    
       
       }  else {
       System.out.println("============================");
       System.out.println("Nomor yang anda inputkan tidak ada.!!");
       } 
       
       }else{
       System.out.println("============================");
       System.out.println("Nomor yang anda inputkan tidak ada.!!");
       }
   }
}
    

