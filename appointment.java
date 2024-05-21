import java.util.*;
class patient
{
    Scanner sc=new Scanner(System.in);
    final int MAX=2 ;
    int last=-1,i,count=0;
    String name[]=new String[MAX],phone[]=new String[MAX],place[]=new
    String[MAX];
    int id[]=new int[MAX],age[]=new int[MAX];
    void add_appointment()
    {
        if(last==MAX-1)
        {
            System.out.print("\n###ALL THE SLOTS ARE FULL! ###\n");
        }
        else
        {
            last=last+1;
            System.out.print("\t\t\t\t////ENTER THE PATIENT'S DETAILS////\n");
            System.out.print("\tENTER ID NUMBER:");
            id[last]=sc.nextInt();
            System.out.print("\tENTER NAME:");
            name[last]=sc.next();
            System.out.print("\tENTER AGE NUMBER:");
            age[last]=sc.nextInt();
            System.out.print("\tENTER PHONE NUMBER:");
            phone[last]=sc.next();
            System.out.print("\tENTER PLACE:");
            place[last]=sc.next();
            count++;
            System.out.print("\n\t\tSLOT "+count+" SUCCESSFULLY ADDED \n");
            System.out.print("\t********************************");
        }
        System.out.print("\n");
    }
    void cancel_appointment()
    {
        if(last==-1)
            System.out.print("\n\t\t###ALL THE SLOTS ARE CANCELLED###\n");
        else
        {
            System.out.println( "\t\tCANCELLATION OF "+name[0]+"'s APOINTMENT IS SUCCESSFULL");
            for(i=0;i<last;i++)
            {
                id[i]=id[i+1];
                name[i]=name[i+1];
                age[i]=age[i+1];
                phone[i]=phone[i+1];
                place[i]=place[i+1];
            }
            last--;
            count--;
        }
        System.out.print("\n");
    }
    void display_appointment()
    {
        if(last==-1)
        {
            System.out.print("\n\t\t###NO APPOINTMENT BOOKED TO SHOW!###\n");
        }
        else
        {
            System.out.print("\n\tAPPOINTMENT BOOKED ARE:\n");
            System.out.print("\t\t\tID\t\t\tNAME\t\t\tAGE\t\t\tPHONE\t\t\t\tPLACE\n");
            for(i=0;i<=last;i++)
            {
                System.out.print("\t\t\t"+id[i]);
                System.out.print("\t\t\t"+name[i]);
                System.out.print("\t\t\t"+age[i]);
                System.out.print("\t\t\t"+phone[i]);
                System.out.println("\t\t\t"+place[i]);
            }
            System.out.print("\n");
        System.out.print("\n\t\t***********************************\n");
        }
    }
}
class appointment
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        patient p1=new patient();
        int ch;
        System.out.println("\t\t\t\t\t\t\t**************************************************");
        System.out.println("\t\t\t\t\t\t\t+\t\t\t\t\t\t +");
        System.out.println("\t\t\t\t\t\t\t+\t\tAMRITA HOSPITAL\t\t\t +");
        System.out.println("\t\t\t\t\t\t\t+\t\t\t\t\t\t +");
        System.out.println("\t\t\t\t\t\t\t**************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\tBOOKING APPOINTMENT\n");
        System.out.println("\n\t\t\t\t\t1.Book\t\t2.Cancel\t\t3.Display\t\t4.Logout\n");
        while(true)
        {
            System.out.print("\n\tENTER YOUR CHOICE:");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:p1.add_appointment();
                break;
                case 2:p1.cancel_appointment();
                break;
                case 3:p1.display_appointment();
                break;
                case 4:System.out.println("Logging out...");
                       in.close();
                       System.exit(0);
                default:
                       System.out.println("Invalid choice. Please enter a valid option.");

            }
        }
    }
}