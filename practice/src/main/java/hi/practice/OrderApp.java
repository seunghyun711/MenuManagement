package hi.practice;

import hi.practice.menu.EventMenu;
import hi.practice.menu.Menu;
import hi.practice.menu.MenuService;
import hi.practice.menu.MenuServiceImpl;
import hi.practice.order.Order;
import hi.practice.order.OrderService;
import hi.practice.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MenuService menuService = new MenuServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        long menuId =1L;
        Menu menu = new Menu(menuId, "ShrimpBugger", EventMenu.ShrimpBugger);
        menuService.menuRegistration(menu);

        Order order = orderService.createOrder(menuId,"ShrimpBugger",2000);
        System.out.println("order = " + order);
    }
}
