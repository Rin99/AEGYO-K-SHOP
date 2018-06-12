public class TShirt extends Aegyo{
    static void shirt(){
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
    }
}