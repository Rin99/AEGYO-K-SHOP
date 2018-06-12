class PayMeth extends Aegyo{
    static void payment(){
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
    }
}