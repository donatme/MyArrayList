public class Demo {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList();

        //добавление элементов
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.getByIndex(i)); //получаем элемент по индексу
        }
        System.out.println();

        //добавление по индексу
        list.addByIndex(0, 3);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.getByIndex(i));
        }
        System.out.println();

        //удаление элемента по индексу
        /*list.removeByIndex(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.getByIndex(i));
        }
        System.out.println();*/

        //добавление по индексу, если индекс больше
        /*list.addByIndex(0, 10);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.getByIndex(i));
        }
        System.out.println();*/

    }
}