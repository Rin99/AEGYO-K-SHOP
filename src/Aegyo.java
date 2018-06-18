import java.util.Scanner;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat; 

public class Aegyo {
    static int[] hgalbum = {340,390,315,320,345,375,315};
    static String[] album = {"ALBUM TWICE","ALBUM BTS\t","ALBUM GFRIEND","ALBUM WJSN","ALBUM BLACKPINK","ALBUM BIGBANG","ALBUM SEVENTEEN"};
    static int[] hgls ={510,628,590,575,553,335,625,315,518};
    static String[] LS = {"LS TWICE\t","LS BTS\t","LS GFRIEND","LS WJSN\t","LS BLACKPINK","LS BIGBANG","LS SEVENTEEN","LS IKON\t","LS GOT7\t"};
    static int[] hgshirt = {140,125,85,90,115,115,125,97,115};
    static String[] shirt = {"T-SHIRT TWICE","T-SHIRT BTS","T-SHIRT GFRIEND","T-SHIRT WJSN","T-SHIRT BLACKPINK","T-SHIRT BIGBANG","T-SHIRT SEVENTEEN","T-SHIRT IKON","T-SHIRT GOT7"};
    static int[] hgacc = {5,7,8,6,45,15};
    static String[] acc = {"PIN\t","BANDO\t" ,"KIPAS\t","KEYCHAIN\t","BANTAL\t","PHOTOCARD\t"};
    static int[] ongkir = {13,16,11,4,7,20};
    static String[] kirim = {"JAKARTA","BANDUNG","JOGJA","MALANG","SURABAYA","\t"};
    static int payment[] = new int[99];
    static int qt[] = new int[99];
    static String pay[] = new String[99];
    static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        menu();
    }static void menu(){
        System.out.println("\n+--------+-----------------------------+--------+"
                          +"\n|   AE   |          AEGYO SHOP         |   2K   |"
                          +"\n|   GY   |    k-pop merch and stuff    |   18   |"
                          +"\n+--------+-----------------------------+--------+"
                          +"\n|  LIST :                                       |"
                          +"\n|    1. Album                                   |"
                          +"\n|    2. Lighstick                               |"
                          +"\n|    3. T-shirt                                 |"
                          +"\n|    4. Accecories                              |"
                          +"\n|    0. Payment                                 |"
                          +"\n|    99. Exit                                   |"
                          +"\n+-----------------------------------------------+");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
        switch(pilih){
            case 1 :
                album(); break;
            case 2 :
                LS(); break;
            case 3 :
                shirt(); break;
            case 4 :
                acc(); break;
            case 0 :
                payment(); break;
            case 99 :
                thanks();  System.exit(0); break;
            default :
                wrong(); menu(); break;
        }
    }static void album(){
        System.out.println("\n+--------+-----------------------------+--------+"
                          +"\n|   AE   |          AEGYO SHOP         |   2K   |"
                          +"\n|   GY   |    k-pop merch and stuff    |   18   |"
                          +"\n+--------+-----------------------------+--------+"
                          +"\n|  LIST ALBUM :                                 |"
                          +"\n|    1. TWICE\t\t[IDR 340K]\t\t|"
                          +"\n|    2. BTS\t\t[IDR 390K]\t\t|"
                          +"\n|    3. GFRIEND\t\t[IDR 315K]\t\t|"
                          +"\n|    4. WJSN\t\t[IDR 320K]\t\t|"
                          +"\n|    5. BLACKPINK\t[IDR 345K]\t\t|"
                          +"\n|    6. BIGBANG\t\t[IDR 375K]\t\t|"
                          +"\n|    7. SEVENTEEN\t[IDR 315K]\t\t|"
                          +"\n|    0. BACK                                    |"
                          +"\n|-----------------------------------------------+");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
        if(pilih > 0 && pilih <= 7){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgalbum[pilih-1]*qt);
            barang(album[pilih-1]);
            ingat();
        }else if(pilih ==0){
        }else{wrong();
        }menu();
    }static void LS(){
        System.out.println("\n+--------+-----------------------------+--------+"
                          +"\n|   AE   |          AEGYO SHOP         |   2K   |"
                          +"\n|   GY   |    k-pop merch and stuff    |   18   |"
                          +"\n+--------+-----------------------------+--------+"
                          +"\n|  LIST LIGHT STICK :                           |"
                          +"\n|    1. TWICE\t\t[IDR 510K]\t\t|"
                          +"\n|    2. BTS\t\t[IDR 628K]\t\t|"
                          +"\n|    3. GFRIEND\t\t[IDR 590K]\t\t|"
                          +"\n|    4. WJSN\t\t[IDR 575K]\t\t|"
                          +"\n|    5. BLACKPINK\t[IDR 553K]\t\t|"
                          +"\n|    6. BIGBANG\t\t[IDR 335K]\t\t|"
                          +"\n|    7. SEVENTEEN\t[IDR 625K]\t\t|"
                          +"\n|    8. IKON\t\t[IDR 315K]\t\t|"
                          +"\n|    9. GOT7\t\t[IDR 518K]\t\t|"
                          +"\n|    0. BACK                                    |"
                          +"\n+-----------------------------------------------+");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
        if(pilih > 0 && pilih <= 9){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgls[pilih-1]*qt);
            barang(LS[pilih-1]);
            ingat();
        }else if(pilih ==0){
        }else{
            wrong();
        }menu();
    }static void shirt(){
        System.out.println("\n+--------+-----------------------------+--------+"
                          +"\n|   AE   |          AEGYO SHOP         |   2K   |"
                          +"\n|   GY   |    k-pop merch and stuff    |   18   |"
                          +"\n+--------+-----------------------------+--------+"
                          +"\n|  LIST T-SHIRT :                               |"
                          +"\n|    1. TWICE\t\t[IDR 140K]\t\t|"
                          +"\n|    2. BTS\t\t[IDR 125K]\t\t|"
                          +"\n|    3. GFRIEND\t\t[IDR  85K]\t\t|"
                          +"\n|    4. WJSN\t\t[IDR  90K]\t\t|"
                          +"\n|    5. BLACKPINK\t[IDR 115K]\t\t|"
                          +"\n|    6. BIGBANG\t\t[IDR 115K]\t\t|"
                          +"\n|    7. SEVENTEEN\t[IDR 125K]\t\t|"
                          +"\n|    8. IKON\t\t[IDR  97K]\t\t|"
                          +"\n|    9. GOT7\t\t[IDR 115K]\t\t|"
                          +"\n|    0. BACK                                    |"
                          +"\n+-----------------------------------------------+");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
        if(pilih > 0 && pilih <= 9){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgshirt[pilih-1]*qt);
            barang(shirt[pilih-1]);
            ingat();
        }else if(pilih ==0){
        }else{
            wrong();
        }menu();
    }static void acc(){
        System.out.println("\n+--------+-----------------------------+--------+"
                          +"\n|   AE   |          AEGYO SHOP         |   2K   |"
                          +"\n|   GY   |    k-pop merch and stuff    |   18   |"
                          +"\n+--------+-----------------------------+--------+"
                          +"\n|  LIST ACCESSORIES :                           |"
                          +"\n|    1. PIN\t\t[IDR  5K]\t\t|"
                          +"\n|    2. BANDO\t\t[IDR  7K]\t\t|"
                          +"\n|    3. KIPAS\t\t[IDR  8K]\t\t|"
                          +"\n|    4. KEYCHAIN\t[IDR  6K]\t\t|"
                          +"\n|    5. BANTAL\t\t[IDR 45K]\t\t|"
                          +"\n|    6. PHOTOCARD\t[IDR 15K]\t\t|"
                          +"\n|    0. BACK                                    |"
                          +"\n+-----------------------------------------------+");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
        if(pilih > 0 && pilih <=4){
            System.out.print("Masukkan jumlah barang (min 2) : ");
            int qt = sc.nextInt();
            if(qt<2){min2();}else{
            quant(qt);
            item(hgacc[pilih-1]*qt);
            barang(acc[pilih-1]);
            ingat();}
        }else if(pilih > 4 && pilih <=6){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgacc[pilih-1]*qt);
            barang(acc[pilih-1]);
            ingat();
        }else if(pilih == 0){
        }else{
            wrong();
        }menu();
    }static void payment(){
        if (pay[0] == null) {
            System.out.println("\n+-------------------------------------------------+-----------+"
                              +"\n|!!!! **** YOU DIDN'T ORDER ANYTHING YET **** !!!!| <- INFO - |"
                              +"\n+-------------------------------------------------+-----------+");
        }else{
            System.out.println("\n+-----------------------------------------------+"
                              +"\n|    Pilih kota anda untuk  biaya pengiriman    |"
                              +"\n+-----------------------------------------------+"
                              +"\n|  1. JAKARTA                                   |"
                              +"\n|  2. BANDUNG                                   |"
                              +"\n|  3. YOGYAKARTA                                |"
                              +"\n|  4. MALANG                                    |"
                              +"\n|  5. SURABAYA                                  |"
                              +"\n|  6. KOTA LAIN                                 |"
                              +"\n|  0. BACK                                      |"
                              +"\n+-----------------------------------------------+");
            System.out.print("Masukkan pilihan : ");
            int pilih = sc.nextInt();
            if(pilih > 0 && pilih <=6){
                subpay();
                int tmp=0,tot;
                for(int i=0; i<payment.length; i++){
                  tmp += payment[i];
                }System.out.println("|   SUB TOTAL\t\t IDR "+tmp+"K\t\t|"
                                 +"\n|   ONGKIR ke "+kirim[pilih-1]+"\t IDR "+ongkir[pilih-1]+"K\t\t|"
                                 +"\n|   _________________________________           |"
                                 +"\n|   TOTAL\t\t IDR "+(tmp+ongkir[pilih-1])+"K\t\t|");
                simpan();
                loop();
            }else if(pilih == 0){
            }else{
                wrong();
            }
        }menu();
    }static void item(int a){
        int cd = 0;
        for(int i=0; i<payment.length; i++){
            if(payment[i]==0){
                cd = i;
                break;
            }
        }payment[cd] = a;
    }static void barang(String a){
        int cd = 0;
        for(int i=0; i<payment.length; i++){
            if(pay[i] == null){
                cd = i;
                break;
            }
        }pay[cd] = a;
    }static void quant(int a){
        int cd = 0;
        for(int i=0; i<payment.length; i++){
            if(qt[i] == 00){
                cd = i;
                break;
            }
        }qt[cd] = a;
    }static void reset(){
        for(int i = 0; i < pay.length; i++){
            payment[i] = 0;
            pay[i] = null;
            qt[i] = 0;
        }
    }static void subpay(){
        Aegyo tgl = new Aegyo();
        System.out.println("\n+--------+-----------------------------+--------+"
                        +"\n|   AE   |          AEGYO SHOP         |   2K   |"
                        +"\n|   GY   |    k-pop merch and stuff    |   18   |"
                        +"\n+--------+-----------------------------+--------+"
                        +"\n|               SHOPPING  RECEIPT               |"
                        +"\n|                 "+tgl.getCode()+"                 |"
                        +"\n|              ===================              |"
                        +"\n|                                               |"
                        +"\n|  You've been order :                          |");
        for (int i = 0; i < payment.length; i++) {
            if (payment[i] != 0) {
                System.out.println("|   " + qt[i] + " " + pay[i] + "\t IDR " + payment[i] + "K\t\t|");
            }
        }System.out.println("|   ---------------------------------           |");
    }static void simpan(){
        System.out.println("|                                               |"
                        +"\n+-----------------------------------------------+"
                        +"\n|   SIMPAN RECEIPT INI  UNTUK BUKTI PEMESANAN   |"
                        +"\n+-----------------------------------------------+");
    }static void loop(){
        System.out.println("\n+-------------------------------------------------+-----------+"
                          +"\n|   please confirm your  receipt at LINE @Aegyo   | <- INFO - |"
                          +"\n|we'll process your order if you've been confirmed| <- INFO - |"
                          +"\n+-------------------------------------------------+-----------+");
        System.out.print("\nApakah anda ingin belanja lagi?(Y/T) : ");
        String choose = sc.next();
        if(choose.equals("y") || choose.equals("Y")){
            reset();
        }else{
            thanks();
            System.exit(0);
        }
    }private String getCode() {  
        DateFormat dateFormat = new SimpleDateFormat("ddMMyy/HHmmss");  
        Date date = new Date();  
        return dateFormat.format(date);
    }static void ingat(){
        System.out.println("\n+-------------------------------------------------+-----------+"
                          +"\n|   *** You've order has been saved at cart ***   | <- INFO - |"
                          +"\n|    Please go to Payment menu to pay the bill    | <- INFO - |"
                          +"\n+-------------------------------------------------+-----------+");
    }static void min2(){
        System.out.println("\n+-------------------------------------------------+-----------+"
                          +"\n| MINIMAL PEMBELIAN 2 ITEM,UNTUK ITEM DIBAWAH 10K | <- INFO - |"
                          +"\n+-------------------------------------------------+-----------+");
    }static void wrong(){
        System.out.println("\n+-------------------------------------------------+-----------+"
                          +"\n|!!!!!! *********** WRONG INPUT *********** !!!!!!| <- INFO - |"
                          +"\n+-------------------------------------------------+-----------+");
    }static void thanks(){
        System.out.println("\n+-------------------------------------------------+"
                          +"\n|        THANKS FOR SHOPPING AT AEGYO SHOP        |"
                          +"\n+-------------------------------------------------+");
    }
}