package Composite.CompositeExample;

public class CompositeExampleMain {

    public static void main(String[] args) {

                MenuComponent pancakeHouseMenu = new MenuComposite("PANCAKE HOUSE MENU");
                MenuComponent dinerMenu = new MenuComposite("DINER MENU");
                MenuComponent cafeMenu = new MenuComposite("CAFE MENU");
                MenuComponent dessertMenu = new MenuComposite("DESSERT MENU");
                MenuComponent allMenus = new MenuComposite("ALL MENUS");

                allMenus.add(pancakeHouseMenu);
                allMenus.add(dinerMenu);
                allMenus.add(cafeMenu);
                dinerMenu.add(new MenuLeaf("Pasta",true,3.89));
                dinerMenu.add(dessertMenu);
                dessertMenu.add(new MenuLeaf("Pie", true, 1.59));

                allMenus.print();
    }
}
