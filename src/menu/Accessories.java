public class Accessories extends Aegyo{
    static void acc(){
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
    }
}