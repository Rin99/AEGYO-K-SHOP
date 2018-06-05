import java.util.Scanner;

public class Aegyo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String valid =" ";
        String[] nama = {"TWICE ALBUM","BTS ALBUM","GFRIEND ALBUM","WJSN ALBUM","BLACKPINK ALBUM","BIGBANG ALBUM","SEVENTEEN ALBUM"};
        String[] LS = {"TWICE LIGHT STICK","BTS LIGHT STICK","GFRIEND LIGHT STICK","WJSN LIGHT STICK","BLACKPINK LIGHT STICK","BIGBANG LIGHT STICK","SEVENTEEN LIGHT STICK","IKON LIGHT STICK","GOT7 LIGHT STICK"};
        String[] shirt = {"TWICE T-SHIRT","BTS LT-SHIRT","GFRIEND T-SHIRT","WJSN T-SHIRT","BLACKPINK T-SHIRT","BIGBANG T-SHIRT","SEVENTEEN T-SHIRT","IKON T-SHIRT","GOT7 T-SHIRT"};
        String[] acc = {"PIN","BANDO","BANTAL","PHOTO CARD","KIPAS","KEY CHAN"};
        int pilih = 0;
        int qt=0;
        int sub=0;
        int harga =0;
        int tot =0;
        int i=0;
        int ongkir =0;
        int subtot=0;
        int tmpng =1;
        int z=0;
        String[] tampung= new String[tmpng];
        
        
    do{
        do{
            valid="Y";
            System.out.println("================================");
            System.out.println("~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~");
            System.out.println("================================");
            System.out.println("LIST :");
            System.out.println(" 1. Album");
            System.out.println(" 2. Lighstick");
            System.out.println(" 3. T-shirt");
            System.out.println(" 4. Accecories");
            System.out.println(" 0. Payment");
            System.out.println(" 99. Exit");
            System.out.println("================================");
            System.out.print("Pilih menu [1/2/3/4/0/99] : ");
            try{
                pilih = sc.nextInt();
                if(pilih != 1 && pilih != 2 && pilih != 3 && pilih != 4 && pilih != 0 && pilih != 99){
                    valid="N";
                }
            }catch(Exception e){
                valid ="N";
                sc.nextLine();
            }
            if(valid=="N"){
                System.out.println(" >> input salah\n");
            }
        }while(valid=="N");
        switch(pilih){
            case 1 :
            do{
                System.out.println("================================");
                System.out.println("~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~");
                System.out.println("================================");
                System.out.println("LIST ALBUM :");
                System.out.println(" 1. TWICE\t[IDR 295K]");
                System.out.println(" 2. BTS\t\t[IDR 315K]");
                System.out.println(" 3. GFRIEND\t[IDR 270K]");
                System.out.println(" 4. WJSN\t[IDR 240K]");
                System.out.println(" 5. BLACKPINK\t[IDR 150K]");
                System.out.println(" 6. BIGBANG\t[IDR 450K]");
                System.out.println(" 7. SEVENTEEN\t[IDR 300K]");
                System.out.println(" 0. BACK");
                System.out.println("================================");
                System.out.print("Pilih menu [1/2/3/4/5/6/7/0] : ");
                try{
                pilih = sc.nextInt();
                if(pilih != 1 && pilih != 2 && pilih != 3 && pilih != 4 && pilih != 5 && pilih != 6 && pilih != 7 && pilih != 0){
                    valid="N";
                }
                }catch(Exception e){
                valid ="N";
                sc.nextLine();
                }
                if(valid=="N"){
                System.out.println(" >> input salah\n");
                }
            }while(valid=="N");
            switch(pilih){
                case 1 :
                    tampung = new String[tmpng];
                    tampung[z]=(nama[0]);
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga = 295*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+nama[0]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    z=z+1;
                    tmpng=tmpng+1;
                    break;
                case 2 :
                    tampung = new String[tmpng];
                    tampung[z]=(nama[1]);
                    qt = 0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=315*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+nama[1]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    z=z+1;
                    tmpng=tmpng+1;
                    break;
                case 3 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=270*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+nama[2]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    i=i+1;
                    tmpng = tmpng+1;
                    break;
                case 4 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=240*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+nama[3]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    i=i+1;
                    tmpng = tmpng+1;
                    break;
                case 5 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=150*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+nama[4]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    i=i+1;
                    tmpng = tmpng+1;
                    break;
                case 6 :
                    qt=0;
                    harga=0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=450*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+nama[5]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    i=i+1;
                    tmpng = tmpng+1;
                    break;
                case 7 :
                    qt=0;
                    harga =0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=300*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+nama[6]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    i=i+1;
                    tmpng = tmpng+1;
                    break;
                case 0 :
                    break;
            } 
                break;
            case 2 :
            do{
                System.out.println("================================");
                System.out.println("~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~");
                System.out.println("================================");
                System.out.println("LIST LIGHSTICK :");
                System.out.println(" 1. TWICE\t[IDR 510K]");
                System.out.println(" 2. BTS\t\t[IDR 390K]");
                System.out.println(" 3. GFRIEND\t[IDR 585K]");
                System.out.println(" 4. WJSN\t[IDR 575K]");
                System.out.println(" 5. BLACKPINK\t[IDR 260K]");
                System.out.println(" 6. BIGBANG\t[IDR 325K]");
                System.out.println(" 7. SEVENTEEN\t[IDR 610K]");
                System.out.println(" 8. IKON\t[IDR 300K]");
                System.out.println(" 9. GOT7\t[IDR 305K]");
                System.out.println(" 0. BACK");
                System.out.println("================================");
                System.out.print("Pilih menu [1/2/3/4/5/6/7/8/9/0] : ");
                try{
                pilih = sc.nextInt();
                if(pilih != 1 && pilih != 2 && pilih != 3 && pilih != 4 && pilih != 5 && pilih != 6 && pilih != 7 && pilih != 8 && pilih != 9 &&  pilih != 0){
                    valid="N";
                }
                }catch(Exception e){
                valid ="N";
                sc.nextLine();
                }
                if(valid=="N"){
                System.out.println(" >> input salah\n");
                }
            }while(valid=="N");
            switch(pilih){
                case 1 : 
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga = 510*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+LS[0]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 2 :
                    qt = 0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=390*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+LS[1]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 3 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=585*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+LS[2]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 4 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=575*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+LS[3]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 5 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=260*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+LS[4]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 6 :
                    qt=0;
                    harga=0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=325*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+LS[5]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 7 :
                    qt=0;
                    harga =0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=610*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+LS[6]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 8 :
                    qt=0;
                    harga=0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=300*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+LS[7]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 9 :
                    qt=0;
                    harga=0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=305*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+LS[8]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 0 :
                    break;
            }
                break;
            case 3 :
              do{
                System.out.println("================================");
                System.out.println("~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~");
                System.out.println("================================");
                System.out.println("LIST T-SHIRT :");
                System.out.println("all T-SHIRT IDR 90K");
                System.out.println(" 1. TWICE");
                System.out.println(" 2. BTS");
                System.out.println(" 3. GFRIEND");
                System.out.println(" 4. WJSN");
                System.out.println(" 5. BLACKPINK");
                System.out.println(" 6. BIGBANG");
                System.out.println(" 7. SEVENTEEN");
                System.out.println(" 8. IKON");
                System.out.println(" 9. GOT7");
                System.out.println(" 0. BACK");
                System.out.println("================================");
                System.out.print("Pilih menu [1/2/3/4/5/6/7/8/9/0] : ");
                try{
                pilih = sc.nextInt();
                if(pilih != 1 && pilih != 2 && pilih != 3 && pilih != 4 && pilih != 5 && pilih != 6 && pilih != 7 && pilih != 8 && pilih != 9 &&  pilih != 0){
                    valid="N";
                }
                }catch(Exception e){
                valid ="N";
                sc.nextLine();
                }
                if(valid=="N"){
                System.out.println(" >> input salah\n");
                }
            }while(valid=="N");
            switch(pilih){
                case 1 : 
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga = 90*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+shirt[0]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 2 :
                    qt = 0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=90*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+shirt[1]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 3 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=90*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+shirt[2]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 4 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=90*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+shirt[3]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 5 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=90*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+shirt[4]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 6 :
                    qt=0;
                    harga=0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=90*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+shirt[5]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 7 :
                    qt=0;
                    harga =0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=90*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+shirt[6]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 8 :
                    qt=0;
                    harga=0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=90*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+shirt[7]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 9 :
                    qt=0;
                    harga=0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=90*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+shirt[8]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 0 :
                    break;
            }
                break;
            case 4 :
              do{
                System.out.println("================================");
                System.out.println("~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~");
                System.out.println("================================");
                System.out.println("LIST ACCECORIES :");
                System.out.println(" 1. PIN\t\t[IDR  5K]");
                System.out.println(" 2. BANDO\t[IDR  7K]");
                System.out.println(" 3. BANTAL\t[IDR 45K]");
                System.out.println(" 4. POTHO CARD\t[IDR 15K]");
                System.out.println(" 5. KIPAS\t[IDR  8K]");
                System.out.println(" 6. KEY CHAN\t[IDR  6K]");
                System.out.println(" 0. BACK");
                System.out.println("================================");
                System.out.print("Pilih menu [1/2/3/4/5/6/0] : ");
                try{
                pilih = sc.nextInt();
                if(pilih != 1 && pilih != 2 && pilih != 3 && pilih != 4 && pilih != 5 && pilih != 6  &&  pilih != 0){
                    valid="N";
                }
                }catch(Exception e){
                valid ="N";
                sc.nextLine();
                }
                if(valid=="N"){
                System.out.println(" >> input salah\n");
                }
            }while(valid=="N");
            switch(pilih){
                case 1 : 
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga = 5*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+acc[0]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 2 :
                    qt = 0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=7*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+acc[1]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 3 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=45*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+acc[2]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 4 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=15*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+acc[3]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 5 :
                    qt=0;
                    harga = 0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=8*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+acc[4]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 6 :
                    qt=0;
                    harga=0;
                    do{
                        valid="Y";
                        System.out.print(">> Quantity[1-10] : ");
                        try{
                            qt=sc.nextInt();
                            if(qt<1||qt>10){
                                valid="N";
                            }
                        }catch(Exception e){
                                    valid="N"; sc.nextInt();
                                    }
                            if(valid=="N"){System.out.println(" >> Wrong input");
                                    }
                    }while(valid=="N");
                    harga=6*qt;
                    tot=tot+harga;
                    System.out.println("************************************************");
                    System.out.println("== You've order "+qt+" "+acc[5]+" ==");
                    System.out.println("== Please go to Payment menu to pay the bill ==");
                    System.out.println("************************************************");
                    break;
                case 0 :
                    break;
            }
                break;
            case 0 :
                
              do{
                System.out.println("*******************************");
                System.out.println("=========== PAYMENT ===========");
               
                if(qt==0){
                    System.out.println("== You didn't order anything yet ==");
                    System.out.println("== Please go to menu order ==");
                    break;
                }
                for(String t:tampung){
                    System.out.println(" "+t);
                }
                System.out.println("TOTAL ITEM\t: IDR "+tot+"K");
                System.out.println("*****************************");
                System.out.println("======== LIST ONGKIR ========");
                System.out.println("Pengiriman dari Kota Malang");
                System.out.println(" 1. Jakarta");
                System.out.println(" 2. Bandung");
                System.out.println(" 3. Yogyakarta");
                System.out.println(" 4. Surabaya");
                System.out.println(" 5. Malang");
                System.out.println(" 6. Other");
                System.out.println(" 0. Back");
                System.out.println("================================");
                System.out.print("Pilih menu [1/2/3/4/5/6/0] : ");
                try{
                    pilih = sc.nextInt();
                    if(pilih != 1 && pilih != 2 && pilih != 3 && pilih != 4 && pilih != 5 && pilih != 6 && pilih != 0){
                        valid="N";
                    }
                }catch(Exception e){
                    valid ="N";
                    sc.nextLine();
                }
                if(valid=="N"){
                    System.out.println(" >> input salah\n");
                    }
            }while(valid=="N");
            switch(pilih){
                case 1 :
                    ongkir=13;
                    System.out.println("=======================================");
                    System.out.println("~~~~~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~~~~");
                    System.out.println("=======================================");
                    System.out.println("TOTAL ITEM\t: IDR "+tot+"K");
                    System.out.println("ONGKIR\t\t: IDR "+ongkir+"K");
                    System.out.println("-------------------------------");
                    subtot=tot+ongkir;
                    System.out.println("ALL TOTAL\t: IDR "+subtot+"K");
                    System.out.println("=======================================");
                    System.out.println("we will process orders after\nyou make the transaction process");
                    System.out.println(" BCA\t\t0012-1253-22");
                    System.out.println(" MANDIRI\t070-00-5467443-5");
                    System.out.println(" BNI\t\t009-555-3426");
                    System.out.println("***************************************");
                    System.out.println("== THANKS FOR SHOPPING IN AEGYO SHOP ==");
                    System.out.println("***************************************");
                    System.exit(0);
                case 2 :
                    ongkir=16;
                    System.out.println("=======================================");
                    System.out.println("~~~~~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~~~~");
                    System.out.println("=======================================");
                    System.out.println("TOTAL ITEM\t: IDR "+tot+"K");
                    System.out.println("ONGKIR\t\t: IDR "+ongkir+"K");
                    System.out.println("-------------------------------");
                    subtot=tot+ongkir;
                    System.out.println("ALL TOTAL\t: IDR "+subtot+"K");
                    System.out.println("=======================================");
                    System.out.println("we will process orders after\nyou make the transaction process");
                    System.out.println(" BCA\t\t0012-1253-22");
                    System.out.println(" MANDIRI\t070-00-5467443-5");
                    System.out.println(" BNI\t\t009-555-3426");
                    System.out.println("***************************************");
                    System.out.println("== THANKS FOR SHOPPING IN AEGYO SHOP ==");
                    System.out.println("***************************************");
                    System.exit(0);
                case 3 :
                    ongkir=23;
                    System.out.println("=======================================");
                    System.out.println("~~~~~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~~~~");
                    System.out.println("=======================================");
                    System.out.println("TOTAL ITEM\t: IDR "+tot+"K");
                    System.out.println("ONGKIR\t\t: IDR "+ongkir+"K");
                    System.out.println("-------------------------------");
                    subtot=tot+ongkir;
                    System.out.println("ALL TOTAL\t: IDR "+subtot+"K");
                    System.out.println("=======================================");
                    System.out.println("we will process orders after\nyou make the transaction process");
                    System.out.println(" BCA\t\t0012-1253-22");
                    System.out.println(" MANDIRI\t070-00-5467443-5");
                    System.out.println(" BNI\t\t009-555-3426");
                    System.out.println("***************************************");
                    System.out.println("== THANKS FOR SHOPPING IN AEGYO SHOP ==");
                    System.out.println("***************************************");
                    System.exit(0);
                case 4 :
                    ongkir=7;
                    System.out.println("=======================================");
                    System.out.println("~~~~~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~~~~");
                    System.out.println("=======================================");
                    System.out.println("TOTAL ITEM\t: IDR "+tot+"K");
                    System.out.println("ONGKIR\t\t: IDR "+ongkir+"K");
                    System.out.println("-------------------------------");
                    subtot=tot+ongkir;
                    System.out.println("ALL TOTAL\t: IDR "+subtot+"K");
                    System.out.println("=======================================");
                    System.out.println("we will process orders after\nyou make the transaction process");
                    System.out.println(" BCA\t\t0012-1253-22");
                    System.out.println(" MANDIRI\t070-00-5467443-5");
                    System.out.println(" BNI\t\t009-555-3426");
                    System.out.println("***************************************");
                    System.out.println("== THANKS FOR SHOPPING IN AEGYO SHOP ==");
                    System.out.println("***************************************");
                    System.exit(0);
                case 5 :
                    ongkir=4;
                    System.out.println("=======================================");
                    System.out.println("~~~~~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~~~~");
                    System.out.println("=======================================");
                    System.out.println("TOTAL ITEM\t: IDR "+tot+"K");
                    System.out.println("ONGKIR\t\t: IDR "+ongkir+"K");
                    System.out.println("-------------------------------");
                    subtot=tot+ongkir;
                    System.out.println("ALL TOTAL\t: IDR "+subtot+"K");
                    System.out.println("=======================================");
                    System.out.println("we will process orders after\nyou make the transaction process");
                    System.out.println(" BCA\t\t0012-1253-22");
                    System.out.println(" MANDIRI\t070-00-5467443-5");
                    System.out.println(" BNI\t\t009-555-3426");
                    System.out.println("***************************************");
                    System.out.println("== THANKS FOR SHOPPING IN AEGYO SHOP ==");
                    System.out.println("***************************************");
                    System.exit(0);
                case 6 :
                    ongkir=25;
                    System.out.println("=======================================");
                    System.out.println("~~~~~~~~~~~~~~ AEGYO SHOP ~~~~~~~~~~~~~");
                    System.out.println("=======================================");
                    System.out.println("TOTAL ITEM\t: IDR "+tot+"K");
                    System.out.println("ONGKIR\t\t: IDR "+ongkir+"K");
                    System.out.println("-------------------------------");
                    subtot=tot+ongkir;
                    System.out.println("ALL TOTAL\t: IDR "+subtot+"K");
                    System.out.println("=======================================");
                    System.out.println("we will process orders after\nyou make the transaction process");
                    System.out.println(" BCA\t\t0012-1253-22");
                    System.out.println(" MANDIRI\t070-00-5467443-5");
                    System.out.println(" BNI\t\t009-555-3426");
                    System.out.println("***************************************");
                    System.out.println("== THANKS FOR SHOPPING IN AEGYO SHOP ==");
                    System.out.println("***************************************");
                    System.exit(0);
                case 0 :
                    break;
            }break;
            case 99 :
                System.out.println("***************************************");
                System.out.println("== THANKS FOR SHOPPING IN AEGYO SHOP ==");
                System.out.println("***************************************");
                System.exit(0);
                break;
        }
    }while(true);
    }
}