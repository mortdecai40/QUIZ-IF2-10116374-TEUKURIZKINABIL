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
public interface ServiceItem {
        public void displayService();
        public boolean checkMemberStatus(String statusMember);
        public float getSale(boolean isMember, float parServicePrice);
        public float getPrice(int serviceItem);
        
}
