/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10116374.teukurizkinabil;

/**
 *
 * @author Acromyrmex
 */
public class ServicePrice implements ServiceItem {
    private float discount;
    private float priceService;
    
    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    public float getPriceService() {
        return priceService;
    }

    @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3): ");
    }
    
    @Override
    public float getPrice(int serviceItem) {
        float price;
        switch (serviceItem) {
            case 1:
            price = 45000;
            break;
            case 2:
            price = 55000;
            break;
            case 3:
            price = 15000;
            break;
            default:
            price = 0;
            break;
        };
    return price;
    }

    
    public boolean checkMemberStatus(String statusMember) {
        statusMember = statusMember.toLowerCase();
        return statusMember.equals("yes") ? true : false;
    }

    
    
    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if (isMember == true) {
            discount = (10 * parServicePrice) / 100;
        } else {
            discount = 0;
        }
    return discount;
    }
    
    
    public float getTotalPay(float priceService, float discount) {
        return priceService - discount;
    }
}