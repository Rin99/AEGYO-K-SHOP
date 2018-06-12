class Album extends Aegyo{
    static void album(){
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
        }else{
            wrong();
        }menu();
    }
}