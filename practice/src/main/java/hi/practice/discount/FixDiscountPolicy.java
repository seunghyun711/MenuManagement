package hi.practice.discount;

import hi.practice.menu.EventMenu;
import hi.practice.menu.Menu;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 2000; // 2000원 할인

    @Override
    public int discount(Menu menu, int price) {
        if(menu.getEventMenu() == EventMenu.ShrimpBugger){
            return discountFixAmount; // 주문한 메뉴가 ChickenBugger 이면, 할인
        }else{
            return 0;
        }
    }
}
