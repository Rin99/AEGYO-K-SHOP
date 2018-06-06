package aegyo;

import java.util.Scanner;
public class Aegyo {
    static int[] hgalbum = {340,390,315,320,345,375,315};
    static String[] album = {"TWICE ALBUM","BTS ALBUM","GFRIEND ALBUM","WJSN ALBUM","BLACKPINK ALBUM","BIGBANG ALBUM","SEVENTEEN ALBUM"};
    static int[] hgls ={510,628,590,575,553,335,625,315,518};
    static String[] LS = {"TWICE LIGHT STICK","BTS LIGHT STICK","GFRIEND LIGHT STICK","WJSN LIGHT STICK","BLACKPINK LIGHT STICK","BIGBANG LIGHT STICK","SEVENTEEN LIGHT STICK","IKON LIGHT STICK","GOT7 LIGHT STICK"};
    static int[] hgshirt = {140,125,85,90,115,115,125,97,115};
    static String[] shirt = {"TWICE T-SHIRT","BTS LT-SHIRT","GFRIEND T-SHIRT","WJSN T-SHIRT","BLACKPINK T-SHIRT","BIGBANG T-SHIRT","SEVENTEEN T-SHIRT","IKON T-SHIRT","GOT7 T-SHIRT"};
    static int[] hgacc = {10,7,45,15,8,6};
    static String[] acc = {"PIN","BANDO","BANTAL","PHOTO CARD","KIPAS","KEY CHAN"};
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }   

    static void menu(){
        System.out.println("================================"
                          +"\n~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~"
                          +"\n================================"
                          +"\nLIST :"
                          +"\n 1. Album"
                          +"\n 2. Lighstick"
                          +"\n 3. T-shirt"
                          +"\n 4. Accecories"
                          +"\n 0. Payment"
                          +"\n 99. Exit"
                          +"\n================================");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
        switch(pilih){
            case 1 : 
                album();
                break;
            case 2 :
                LS();
                break;
            case 3 :
                shirt();
                break;
            case 4 :
                acc();
                break;
            case 0 :
                payment();
                break;
            default :
                break;
        }
    }
    static void album(){
        System.out.println("================================"
                          +"\n~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~"
                          +"\n================================"
                          +"\nLIST ALBUM :"
                          +"\n 1. TWICE\t[IDR 340K]"
                          +"\n 2. BTS\t\t[IDR 390K]"
                          +"\n 3. GFRIEND\t[IDR 315K]"
                          +"\n 4. WJSN\t[IDR 320K]"
                          +"\n 5. BLACKPINK\t[IDR 345K]"
                          +"\n 6. BIGBANG\t[IDR 375K]"
                          +"\n 7. SEVENTEEN\t[IDR 315K]"
                          +"\n 0. BACK"
                          +"\n================================");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
        if(pilih == 1){
            item(hgalbum[0]);
            barang(album[0]);
        }else if(pilih ==2){
            item(hgalbum[1]);
            barang(album[1]);
        }

    }
    static void LS(){
        System.out.println("================================");
    }
    
    static void shirt(){
    }
    
    static void acc(){
    }
    
    static void item(int a){
    }
    
    static void barang(String a){
    }
    
    static void payment(){
    }
}