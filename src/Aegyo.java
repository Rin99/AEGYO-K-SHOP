import java.util.Scanner;
public class Aegyo {
    static int[] hgalbum = {340,390,315,320,345,375,315};
    static String[] album = {"TWICE ALBUM","BTS ALBUM","GFRIEND ALBUM","WJSN ALBUM","BLACKPINK ALBUM","BIGBANG ALBUM","SEVENTEEN ALBUM"};
    static int[] hgls ={510,628,590,575,553,335,625,315,518};
    static String[] LS = {"TWICE LIGHT STICK","B T S LIGHT STICK","GFRIEND LIGHT STICK","WJSN LIGHT STICK","BLACKPINK LIGHT STICK","BIGBANG LIGHT STICK","SEVENTEEN LIGHT STICK","IKON LIGHT STICK","GOT7 LIGHT STICK"};
    static int[] hgshirt = {140,125,85,90,115,115,125,97,115};
    static String[] shirt = {"TWICE T-SHIRT","B T S LT-SHIRT","GFRIEND T-SHIRT","WJSN T-SHIRT","BLACKPINK T-SHIRT","BIGBANG T-SHIRT","SEVENTEEN T-SHIRT","IKON T-SHIRT","GOT7 T-SHIRT"};
    static int[] hgacc = {10,7,45,15,8,6};
    static String[] acc = {"PIN","BANDO","BANTAL","PHOTO CARD","KIPAS","KEY CHAN"};
    static int payment[] = new int[99];
    static int qt[] = new int[99];
    static String pay[] = new String[99];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        System.out.println("+--------+---------------------------------"
                        +"\n|   AE   |          AEGYO SHOP"
                        +"\n|   GY   |    k-pop merch and stuff"
                        +"\n+--------+---------------------------------"
                        +"\nLIST :"
                        +"\n 1. Album"
                        +"\n 2. Lighstick"
                        +"\n 3. T-shirt"
                        +"\n 4. Accecories"
                        +"\n 0. Payment"
                        +"\n 99. Exit"
                        +"\n-------------------------------------------");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
        if(pilih != 1 && pilih != 2 && pilih != 3 && pilih != 4 && pilih != 0 && pilih != 99){
            wrong();
            menu();
        }
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
            case 99 :
                thanks();
                break;
        }
    }
    static void album(){
        System.out.println("+--------+---------------------------------"
                        +"\n|   AE   |          AEGYO SHOP"
                        +"\n|   GY   |    k-pop merch and stuff"
                        +"\n+--------+---------------------------------"
                        +"\nLIST ALBUM :"
                        +"\n 1. TWICE\t[IDR 340K]"
                        +"\n 2. BTS\t\t[IDR 390K]"
                        +"\n 3. GFRIEND\t[IDR 315K]"
                        +"\n 4. WJSN\t[IDR 320K]"
                        +"\n 5. BLACKPINK\t[IDR 345K]"
                        +"\n 6. BIGBANG\t[IDR 375K]"
                        +"\n 7. SEVENTEEN\t[IDR 315K]"
                        +"\n 0. BACK"
                        +"\n-------------------------------------------");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgalbum[0]*qt);
            barang(album[0]);
            ingat();
        }else if(pilih ==2){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgalbum[1]*qt);
            barang(album[1]);
            ingat();
        }else if(pilih ==3){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgalbum[2]*qt);
            barang(album[2]);
            ingat();
        }else if(pilih ==4){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgalbum[3]*qt);
            barang(album[3]);
            ingat();
        }else if(pilih ==5){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgalbum[4]*qt);
            barang(album[4]);
            ingat();
        }else if(pilih ==6){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgalbum[5]*qt);
            barang(album[5]);
            ingat();
        }else if(pilih ==7){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgalbum[6]*qt);
            barang(album[6]);
            ingat();
        }else if(pilih ==0){
            menu();
        }else{
            wrong();
            album();
        }menu();
    }
    static void LS(){
        System.out.println("+--------+---------------------------------"
                        +"\n|   AE   |          AEGYO SHOP"
                        +"\n|   GY   |    k-pop merch and stuff"
                        +"\n+--------+---------------------------------"
                        +"\nLIST LIGHT STICK :"
                        +"\n 1. TWICE\t[IDR 510K]"
                        +"\n 2. BTS\t\t[IDR 628K]"
                        +"\n 3. GFRIEND\t[IDR 590K]"
                        +"\n 4. WJSN\t[IDR 575K]"
                        +"\n 5. BLACKPINK\t[IDR 553K]"
                        +"\n 6. BIGBANG\t[IDR 335K]"
                        +"\n 7. SEVENTEEN\t[IDR 625K]"
                        +"\n 8. IKON\t[IDR 315K]"
                        +"\n 9. GOT7\t[IDR 518K]"
                        +"\n 0. BACK"
                        +"\n-------------------------------------------");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
    }
    static void shirt(){
        System.out.println("+--------+---------------------------------"
                        +"\n|   AE   |          AEGYO SHOP"
                        +"\n|   GY   |    k-pop merch and stuff"
                        +"\n+--------+---------------------------------"
                        +"\nLIST T-SHIRT :"
                        +"\n 1. TWICE\t[IDR 140K]"
                        +"\n 2. BTS\t\t[IDR 125K]"
                        +"\n 3. GFRIEND\t[IDR  85K]"
                        +"\n 4. WJSN\t[IDR  90K]"
                        +"\n 5. BLACKPINK\t[IDR 115K]"
                        +"\n 6. BIGBANG\t[IDR 115K]"
                        +"\n 7. SEVENTEEN\t[IDR 125K]"
                        +"\n 8. IKON\t[IDR  97K]"
                        +"\n 9. GOT7\t[IDR 115K]"
                        +"\n 0. BACK"
                        +"\n-------------------------------------------");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
    }
    static void acc(){
        System.out.println("+--------+---------------------------------"
                        +"\n|   AE   |          AEGYO SHOP"
                        +"\n|   GY   |    k-pop merch and stuff"
                        +"\n+--------+---------------------------------"
                        +"\nLIST ACCESSORIES :"
                        +"\n 1. PIN\t\t[IDR 10K]"
                        +"\n 2. BANDO\t[IDR  7K]"
                        +"\n 3. BANTAL\t[IDR 45K]"
                        +"\n 4. PHOTOCARD\t[IDR 15K]"
                        +"\n 5. KIPAS\t[IDR  8K]"
                        +"\n 6. KEYCHAN\t[IDR  6K]"
                        +"\n 0. BACK"
                        +"\n-------------------------------------------");
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukkan jumlah barang : ");
            int qt = sc.nextInt();
            quant(qt);
            item(hgacc[0]*qt);
            barang(acc[0]);
        }menu();
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
    }
    static void payment(){
        if (pay[0] == null) {
            System.out.println("-------------------------------------------"
                            +"\n!!! ** YOU DIDN'T ORDER ANYTHING YET ** !!!"
                            +"\n-------------------------------------------");
        } else {
            System.out.println("+--------+---------------------------------"
                        +"\n|   AE   |          AEGYO SHOP"
                        +"\n|   GY   |    k-pop merch and stuff"
                        +"\n+--------+---------------------------------"
                        +"\nYour shopping cart :");
            for (int i = 0; i < payment.length; i++) {
                if (payment[i] != 0) {
                    System.out.println(" " + qt[i] + " " + pay[i] + "\t IDR " + payment[i] + "K");
                }
            }
            System.out.println("____________________________________");
            int tmp=0,tot;
            for(int i=0; i<payment.length; i++){
                tmp += payment[i];
            }
            System.out.println(" TOTAL\t\t\t IDR "+tmp+"K");
                    
        }
    }
    static void ingat(){
        System.out.println("-------------------------------------------"
                        +"\n*** You've order has been saved at cart ***"
                        +"\n Please go to Payment menu to pay the bill"
                        +"\n-------------------------------------------");
    }
    static void wrong(){
        System.out.println("-------------------------------------------"
                        +"\n!!! *********** WRONG INPUT *********** !!!"
                        +"\n-------------------------------------------");
    }
    static void thanks(){
        System.out.println("-------------------------------------------"
                        +"\n    THANKS FOR SHOPPING AT AEGYO SHOP"
                        +"\n-------------------------------------------");
    }
}