package system.beta;
import java.util.Scanner;
public class Selection {
   Scanner in = new Scanner(System.in);
    int ctr,quantity,selection,inven,trans[] = new int[500];
   char choice;
   double total,payment,change;
   String products [] = {"ROG STRIX GTX1080 8GB                   ", "ROG STRIX GTX1070 8GB                   ", "MSI GTX1070 Gaming X 8GB                ", "ZOTAC GTX1070 8GB                       ","MSI GTX1080 Gaming X twin Frozr 4 8GB   ", "Sapphire RX 480 8GB                     ","XFX RX 480 8GB                          ","Sapphire Nitro R9-390 Tri-X OC 8GB      ","Sapphire R9 Fury X 4GB                  ","MSI GTX980 Ti ARMOR 2X OC 8GB           ","NVIDIA GeForce GTX 1080 Ti 11GB         ","NVIDIA GeForce GTX 960 4GB               ","AMD Radeon RX 480 4GB                    ","NVIDIA TITAN X 12GB                     ","NVIDIA GeForce 9600 GT 1GB               ","AMD Radeon RX 580 8GB                   ","AMD Radeon R9 Fury 4GB                  ","AMD Radeon R9 Fury X 4GB                ","NVIDIA GeForce GTX 950 4GB               ","NVIDIA GeForce GTX TITAN 12GB           ",
	"AMD A10-7870K @ 3.9GHz                   ","Intel Core I7-6700K @ 4.0GHz            ","AMD A8-7600 @ 3.1GHz                     ","Intel Core I5-6600K @ 3.5GHz            ","AMD A6-6400k @ 3.9GHz                    ","Intel I3-6100 @ 3.7GHz                   ","AMD A4-6300 @ 3.7GHz                     ","Intel Pentium G3258 @ 3.2GHz             ","AMD FX-9590 @ 4.70GHz                   ","Intel Pentium G4400 @ 3.3GHz             ","AMD Ryzen 7 1800X @ 3.6GHz              ","Intel Core 2 Duo E8600 @ 3.33GHz        ","AMD Athlon II X2 250 @ 3.0GHz            ","Intel Celeron J3455 @ 2.3GHz             ","AMD Phenom II X6 1075T @ 3.7GHz         ","Intel Atom D2700 @ 2.13GHz               ","AMD Sempron 3850 @ 1.3GHz                ","Intel Core i7-7700K @ 4.5GHz             ","AMD Ryzen 7 1700X @ 3.8GHz               ","Intel Core i3-3250T @ 3.0GHz             ",
	"MSI 970 Gaming                           ","Asus B85-Pro Gamer                       ","Gigabyte H81m-DS2                        ","Gigabyte F2A68HM-DS2                     ","Asus Maximus VIII Hero                  ","MSI A88X-G45 Gaming                      ","MSI X99A Godlike Gaming                 ","Asus Rampage V Extreme                  ","ASRock Z77 Extreme 6                     ","ASRock FM2A68M-DG3+                      ","MSI 990FXA-GD65 V2                       ", "MSI 990FXA-GD65 V2                      ", "MSI 970A SLI Krait Edition              ", "ASROCK 787E-ITx mothrboard intelZ87/LGA ", "ASRock B250M-HDVIntel B250/LGA1151      ", "Asus Prime Z270-A intel Z27-?LGA 1151   ", "AsusCrosshairVFormula Z AMD 990FX SB950 ", "MSI-970 SLIKRAITEDITION-AMD970          ", "ASRock 970 Pro3 R2.0 DDR3               " , "ASRock 990FX Extreme4                   "}; 
   double prices [] = {40820.00 , 28230.00 , 26500.00 , 26500.00 , 42000.00 , 13800.00 , 13800.00 , 16250.00 , 32700.00 , 29990.00,34960.00,9950.00,9950.00,59950.00,2000.00,11450.00,27450.00,32450.00,7950.00,49950.00,          
	       6300.00 , 16500.00 , 3500.00 , 11400.00 , 2150.00 , 5450.00 , 1550.00 , 3388.00 , 15250.00 , 2700.00,24950.00,13000.00,4350.00,5350.00,12250.00,2600.00,1765.00,17150.00,19600,6860,
	       4950.00 , 4900.00 , 2350.00 , 2330.00 , 14200.00 , 6150.00 , 27900.00 , 26500.00 , 9200.00 , 2560.00,6300.00 , 13800.00 , 29990.00 , 12345.00 , 25000.00 , 43000.00 ,32000.00 , 56000.00 , 40000.00 , 33000.00 ,50000.00};
   
   
   void Choice()
   {
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   System.out.println("**********************************************************************************************************************************************************************************");  
   System.out.println("-----------------------------------------------------------------------------COMPUTER PARTS MO TO 💻!!!----------------------------------------------------------------------------");
   System.out.println("**********************************************************************************************************************************************************************************");
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   System.out.println("");
   System.out.println("");
   System.out.println("");
   System.out.println("💻 a.Processors");
   System.out.println("💻 b.Graphic Card");
   System.out.println("💻 c.Motherboard");
   System.out.println("💻 d.Records");
   System.out.println("💻 e.Exit");
   System.out.print("Enter your choice: ");
    choice = in.next().charAt(0);
   }
    void processor(){
    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
    System.out.println("**********************************************************************************************************************************************************************************");  
    System.out.println("----------------------------------------------------------------------------------PROCESSORS 💻!!!---------------------------------------------------------------------------------");
    System.out.println("**********************************************************************************************************************************************************************************");
    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
    System.out.println("");
          for(ctr=0;ctr<500;ctr++)
          {
              trans[ctr] = -1;
          }
            for(ctr=0;ctr<20;ctr++)
               {
                    System.out.println("💻 "+(char)(97+ctr)+"."+products[ctr+20]+" "+prices[ctr+20]);
               }
        
        System.out.print("Your choice: ");
        choice = in.next().charAt(0);
        selection = (int)choice;
	selection -= 97;
        if(selection>=0&&selection<=19)
        {
        System.out.print("Quantity: ");
        quantity = in.nextInt();
        total = prices[selection+20]*quantity;
        System.out.println("Total: "+total);
        System.out.print("Enter your Payment: ");
        payment = in.nextDouble();
        if(payment>=total)
            {
                change = payment-total;
                System.out.println("change: "+change);
                trans [inven]=selection+20;
	        inven++;
            }
        else
            {
                System.out.println("not enough cash!!");
            }
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
void vcard(){
    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
    System.out.println("**********************************************************************************************************************************************************************************");  
    System.out.println("--------------------------------------------------------------------------------GRAPHIC CARDS 💻!!!--------------------------------------------------------------------------------");
    System.out.println("**********************************************************************************************************************************************************************************");
    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
    System.out.println("");
    for(ctr=0;ctr<20;ctr++)
        {
        System.out.println("💻 "+(char)(97+ctr)+"."+products[ctr]+" "+prices[ctr]);
        }
   
    System.out.print("Your choice: ");
        choice = in.next().charAt(0);
        selection = (int)choice;
	selection -= 97;
        if(selection>=0&&selection<=19)
        {
        System.out.print("Quantity: ");
        quantity = in.nextInt();
        total = prices[selection]*quantity;
        System.out.println("Total: "+total);
        System.out.print("Enter your Payment: ");
        payment = in.nextDouble();
        if(payment>=total)
            {
                change = payment-total;
                System.out.println("change: "+change);
                trans[inven] = selection;
                inven++;
            }
        else
            {
                System.out.println("not enough cash!!");
            }
        
        }
        else
        {
            System.out.println("Invalid Choice!!");
        }
}
void mobo()
{
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   System.out.println("**********************************************************************************************************************************************************************************");  
   System.out.println("----------------------------------------------------------------------------------MOTHERBOARDS 💻!!!-------------------------------------------------------------------------------");
   System.out.println("**********************************************************************************************************************************************************************************");
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   System.out.println("");
     for(ctr=0;ctr<20;ctr++)
        {
        System.out.println("💻 "+(char)(97+ctr)+"."+products[ctr+40]+" "+prices[ctr+40]);
        }
   
    System.out.print("Your choice: ");
        choice = in.next().charAt(0);
        System.out.print("Quantity: ");
        quantity = in.nextInt();
        selection = (int)choice;
	selection -= 97;
        if(selection>=0&&selection<=19)
        {
        total = prices[selection+40]*quantity;
        System.out.println("Total: "+total);
        System.out.print("Enter your Payment: ");
        payment = in.nextDouble();
        if(payment>=total)
            {
                change = payment-total;
                System.out.println("change: "+change);
                trans[inven] = selection+40;
                inven++;
            }
        else
            {
                System.out.println("not enough cash!!");
            }
        
       }
         else
        {
            System.out.println("Invalid Choice!!");
        }
}
void record()
        {
       
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   System.out.println("**********************************************************************************************************************************************************************************");  
   System.out.println("------------------------------------------------------------------------------------RECORDS 💻!!!----------------------------------------------------------------------------------");
   System.out.println("**********************************************************************************************************************************************************************************");
   System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
   System.out.println("");
            total = 0;	
            ctr =0;
            while (trans [ctr]!=-1)
		{
                    System.out.println(products[trans[ctr]]+" "+quantity*prices[trans[ctr]]);
                    total+=prices[trans[ctr]]*quantity;
                    ctr++;
                }
                System.out.println("--------------------------------------------------");
                System.out.println("Total                                     "+total);
                System.out.println("--------------------------------------------------");
        
}
}   
    

    



