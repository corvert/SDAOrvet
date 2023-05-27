package designPatterns.composite.menuItem;

import designPatterns.composite.menuItem.Menu;

public class MenuDemo {
    public static void main(String[] args) {
        Menu menu1 = new Menu("Menu1 ", 200);
        Menu menu2 = new Menu("menu2", 300);
        MenuItem menuItem = new MenuItem("Menu item", 150);

        menu1.display();
        System.out.println("---------");
        menu1.addItem(menu2);
        menu1.display();
        System.out.println("-------------");

        menu1.addItem(menuItem);
        menu1.display();
        System.out.println("---------");
        menuItem.display();

    }
}
