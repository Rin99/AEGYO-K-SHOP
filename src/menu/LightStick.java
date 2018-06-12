public class LightStick extends Aegyo{
    static void LS(){
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
    }
}