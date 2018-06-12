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
    }
    static void menu(){
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
                Album.album();
                break;
            case 2 :
                LightStick.LS();
                break;
            case 3 :
                TShirt.shirt();
                break;
            case 4 :
                Accessories.acc();
                break;
            case 0 :
                PayMeth.payment();
                break;
            case 99 :
                thanks();
                System.exit(0);                        
                break;
            default:
                wrong();
                menu();
                break;
        }
    }
    static void item(int a){
        int cd = 0;
        for(int i=0; i<payment.length; i++){
            if(payment[i]==0){
                cd = i;
                break;
            }
        }payment[cd] = a;
    }
    static void barang(String a){
        int cd = 0;
        for(int i=0; i<payment.length; i++){
            if(pay[i] == null){
                cd = i;
                break;
            }
        }pay[cd] = a;
    }
    static void quant(int a){
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
    }
    static void subpay(){
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
    }
    static void simpan(){
        System.out.println("|                                               |"
                        +"\n+-----------------------------------------------+"
                        +"\n|   SIMPAN RECEIPT INI  UNTUK BUKTI PEMESANAN   |"
                        +"\n+-----------------------------------------------+");
    }
    static void loop(){
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
    }
    private String getCode() {  
        DateFormat dateFormat = new SimpleDateFormat("ddMMyy/HHmmss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    static void ingat(){
        System.out.println("\n+-------------------------------------------------+-----------+"
                          +"\n|   *** You've order has been saved at cart ***   | <- INFO - |"
                          +"\n|    Please go to Payment menu to pay the bill    | <- INFO - |"
                          +"\n+-------------------------------------------------+-----------+");
    }static void min2(){
        System.out.println("\n+-------------------------------------------------+-----------+"
                          +"\n| MINIMAL PEMBELIAN 2 ITEM,UNTUK ITEM DIBAWAH 10K | <- INFO - |"
                          +"\n+-------------------------------------------------+-----------+");
    }
    static void wrong(){
        System.out.println("\n+-------------------------------------------------+-----------+"
                          +"\n|!!!!!! *********** WRONG INPUT *********** !!!!!!| <- INFO - |"
                          +"\n+-------------------------------------------------+-----------+");
    }
    static void thanks(){
        System.out.println("\n+-------------------------------------------------+"
                          +"\n|        THANKS FOR SHOPPING AT AEGYO SHOP        |"
                          +"\n+-------------------------------------------------+");
    }
}