import java.util.Scanner;

class Shop {

    String[] bill=new String[100];
    int Sl,Itemrate,rate,Quantity;
    int totalrate=0;
    int n,m;
  
    String[] items;
    String[] itemNAME;

    int no_of_items;
    public Shop(int n)
    {
        this.m=0;
        this.n=n;
       
        this.items=new String[100];
        this.no_of_items=0;
    }

  
    void available(int sl,int quantity)
    {
        String availableItm[]={
                "ICE and FLOURS   ", " Sugar           ", "Jaggery          ", "Idli rice        ", "Sona masoori Rice", "Dosa rice        ",
                "Basmati rice     ", "Wheat flour      ", "Maida            ", " Ragi flour      ", " oats            ", "Rice flour       ",
                " Besan           ", "Wheat rava       ", " Idli rava       ", "   nstant rice  ", " Red chilli      ", "ambar powder     ", "18  Idli podi    ",

                "PULSES/DALS       ", "  Toor dal       ", " Round urad dal  ", " moong dal       ", " Chana dal       ", " Split urad dal  ",
                " Rajma chana     ", " Crystal salt    ", " Powder salt     ", " Red chili       ", " Dhania powder   ", " Garam masala    ",
                " Chat masala     ", " Tea powder      ", " Cooking soda    ", " Baking powder   ",

                " OILS           ", "Cooking oil     ", "Gingelly oil    ", "Coconut oil     ", "Ghee or butter  ", "Olive oil       ",
        } ;


        int availableItmRate[]={30,25,30,35,45,25,25,60,40,30,40,70,40,35,25,20,30, 50,70
                ,90,100,70,60,40,55,10,18,70,40,150,100,90, 160,160,90,
                95,250,80,39,50,60 };

        Sl=sl;
        Itemrate=availableItmRate[Sl];
        Quantity=quantity;
        rate=quantity*Itemrate;
        totalrate=totalrate+rate;

        System.out.println("ITEM NUMBER\t\tITEM NAME\t\tRATE\t\tQUANTITY\t\tAMOUNT");
        System.out.print(sl);
        System.out.print("\t\t\t"+availableItm[Sl]);
        System.out.print("\t"+Itemrate);
        System.out.print("\t\t"+quantity);
        System.out.println("\t\t\t"+rate);
        System.out.println();

        bill[m]=sl+"\t\t\t"+availableItm[Sl]+"\t\t"+Itemrate+"\t\t"+quantity+"\t\t\t\t"+rate;
        m++;


    }
    void print()
    {
        System.out.println("ITEM NUMBER\t\tITEM NAME\t\t\tRATE\t\tQUANTITY\t\t\tAMOUNT");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        for (int i1=0; i1<n; i1++) {
            System.out.println(bill[i1]);
        }

    }


}
public class shopBill1 {
    public static void main(String[] args) {


                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("\n  SUPER MART Ltd\n  Gulbarga  585104 \n +91 7204728158 \n");
        System.out.println("---------- SUPER MART-------------- SUPER MART------------- SUPER MART ---------- SUPER MART---\n");

        Scanner sc = new Scanner(System.in);

              System.out.println( "      ICE and FLOURS                                    PULSES/DALS                                      OILS");
              System.out.println("--------------------------------------------------------------------------------------------------------------------");

               System.out.println( "1   Sugar             - 1 kg (Rs 25/-)           20  Toor dal        - 1 kg (Rs 100 /-)        36 Cooking  oil   - 1 lts (Rs 250 /-)");
               System.out.println( "2   Jaggery           - 1 kg (Rs 30/-)           21 Round urad dal   - 1 kg (Rs 70 /-)         37 Gingelly oil   - 1 lts (Rs 80 /-)");
               System.out.println("3   Idli rice         - 1 kg (Rs 35/-)           22 Yellow moong dal - 1 kg (Rs 60 /-)         38 Coconut  oil   - 1 lts(Rs 39 /-)");
               System.out.println( "4   Sona masoori Rice - 1kg  (Rs 45/-)           23 Chana dal        - 1 kg (Rs 40 /-)         39 Ghee or butter - 1 kg (Rs 50 /-)");
               System.out.println( "5   Dosa rice         - 1 kg (Rs 25/-)           24 Split urad dal   - 1 kg (Rs 55 /-)         40 Olive    oil   - 1 lts (Rs 60 /-)");
               System.out.println( "6   Basmati rice      - 1 kg (Rs 25/-)           25 Rajma            - 1 kg (Rs 10 /-) ");
               System.out.println( "7   Wheat flour       - 1 kg (Rs 60/-)           26 Crystal salt     - 1 kg (Rs 18 /-) ");
               System.out.println( "8   Maida             - 1 kg (Rs 40/-)           27 Powder salt      - 1 kg (Rs 70 /-) ");
               System.out.println( "9   Ragi flour        - 1 kg (Rs 30/-)           28 Red chili        - 1 kg (Rs 40 /-) ");
               System.out.println( "10  oats              - 1 kg (Rs 40/-)           29 Dhania powder    - 1 kg (Rs 150 /-) ");
               System.out.println( "11  Rice flour        - 1 kg (Rs 70/-)           30 Garam masala     - 1 kg (Rs 100 /-) ");
               System.out.println( "12  Besan             - 1 kg (Rs 40/-)           31 Chat masala      - 1 kg (Rs 90 /-) ");
               System.out.println( "13  Wheat rava        - 1 kg (Rs 35/-)           32 Tea powder       - 1 kg (Rs 160 /-) ");
               System.out.println("14  Idli rava         - 1 kg (Rs 25/-)           33 Cooking soda     - 1 kg (Rs 160 /-) ");
               System.out.println( "15  nstant rice sevai - 1 kg (Rs 20/-)           34 Baking powder    - 1 kg (Rs 90 /-) ");
               System.out.println( "16  Red chilli        - 1 kg (Rs 30/-)           ");
                System.out.println("17  ambar powder      - 1 kg (Rs 50/-)           ");
               System.out.println( "18  Idli podi         - 1 kg (Rs 70/-)           ");

        System.out.println("\n Enter How Many Items: ");
        System.out.print("--->");
        int n=sc.nextInt();

        //sc.nextLine();
        Shop shop = new Shop(n);

        for (int i = 0; i < n; i++) {

            System.out.println("Enter The Item Number: ");
            int slNo = sc.nextInt();
            System.out.print("Enter The Quantity: ");
            int quantity=sc.nextInt();
            shop.available(slNo,quantity);

        }
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
       
        System.out.println("\t\t\t\t\t\tGENERATED BILL \n");
        shop.print();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTOTAL AMOUNT= "+shop.totalrate);
        System.out.println(" \n----------- SUPER MART--------- SUPER MART----------  SUPER MART----------- SUPER MART----------- SUPER MART----------\n ");

    


    }


}