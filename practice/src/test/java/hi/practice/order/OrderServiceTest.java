package hi.practice.order;

import hi.practice.menu.EventMenu;
import hi.practice.menu.Menu;
import hi.practice.menu.MenuService;
import hi.practice.menu.MenuServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MenuService menuService = new MenuServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        long menuId = 1L;
        Menu menu = new Menu(menuId, "ShrimpBugger", EventMenu.ShrimpBugger);
        menuService.menuRegistration(menu);

        Order order = orderService.createOrder(menuId,"ShrimpBugger",5000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(2000);
    }
}
