package hi.practice.menu;

import java.util.HashMap;
import java.util.Map;

public class MemoryMenuRepository implements MenuRepository {

    private static Map<String, Menu> store = new HashMap<>();


    @Override
    public void save(Menu menu) {
        store.put(menu.getName(), menu);
    }

    @Override
    public Menu findByName(String menuName) {
        return store.get(menuName);
    }

    @Override
    public Menu delete(Long menuId) {
        return store.remove(menuId);
    }
}
