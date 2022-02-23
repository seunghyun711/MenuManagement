package hi.practice;

import hi.practice.menu.EventMenu;
import hi.practice.menu.Menu;
import hi.practice.menu.MenuService;
import hi.practice.menu.MenuServiceImpl;

public class ManagementApp {

    public static void main(String[] args) {
        MenuService menuService = new MenuServiceImpl();
        Menu menu = new Menu(1L,"ShrimpBugger", EventMenu.ShrimpBugger);
        menuService.menuRegistration(menu);

        Menu findMenu = menuService.findMenu("ShrimpBugger");
        System.out.println("Registered Menu = " + menu.getName());
        System.out.println("find Menu = " + findMenu.getName());

        Menu deleteMenu = menuService.removeMenu(1L);
        System.out.println("Removed Menu : " + menu.getId()+ " " + menu.getName());


    }
}
