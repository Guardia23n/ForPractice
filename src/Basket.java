public class Basket {
    private static String items = "";
    private static int totalPrice = 0;

    public static void main (String[] args){
        add("Колбаса", 76);
        add("Молоко", 85);
        add("Молоко", 55);
        add("Масло", 120);
        print("Содержимое корзины");
        int totalPrice = getTotaPrice();
        System.out.println("Общая стоимость товаров: " + totalPrice);
        clear();
        print("Содержимое корзины");
        System.out.println(getTotaPrice());

    }
    public static void add(String name, int price){
        if(contains(name)){
            return;
        }

        items = items + "\n" + name + " - " + price;
        totalPrice = totalPrice + price;
    }

    public static void clear(){
        items = "";
        totalPrice = 0;
    }

    public static int getTotaPrice(){

        return totalPrice;
    }

    public static boolean contains (String name) {
//        System.out.println(items.contains(name));
        return  items.contains(name);
//        if (items.contains(name)) {
//            return true;
//        }
//          return false;
    }

    public static void print(String title){
        System.out.println(title);
        if(items.isEmpty()){
            System.out.println("Карзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
