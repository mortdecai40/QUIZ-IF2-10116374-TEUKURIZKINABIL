package quiz.if2.pkg10116374.teukurizkinabil;
import java.util.Scanner;
/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program kasir rock n roll
 *
 */
public class QUIZIF210116374TEUKURIZKINABIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        
        Customer customer = new Customer();
        
        System.out.print("Customer Name : ");
        customer.setName(scanner1.nextLine());
        
        System.out.print("Customer Email : ");
        customer.setEmail(scanner2.next());
        customer.displayService();
        customer.setPriceService(customer.getPrice(scanner4.nextInt()));
        System.out.print("Are you Member (yes/no) : ");
        customer.setMember(customer.checkMemberStatus(scanner3.next()));
        System.out.println("\n");
        System.out.println("#*******************************#");
        System.out.println("#********CUSTOMER INVOICE*******#");
        System.out.println("Date Transaction : "+customer.currentTime());
        System.out.println("Service Price : Rp." + customer.getPriceService());
        System.out.println("Discount : Rp." + customer.getSale(customer.isMember(), customer.getPriceService()));
        System.out.println("Total Pay : Rp." + customer.getTotalPay(customer.getPriceService(),
        customer.getSale(customer.isMember(), customer.getPriceService())));
    }
    
}
