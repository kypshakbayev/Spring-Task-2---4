package db;

import servlets.Item;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static Long id = 2L;
    private static List<Item> itemList = new ArrayList<>();

    static {
        itemList.add(new Item(1L, "Устроиться на работу", "Устроиться на хорошую работу, чтобы зарплаты было достаточно", "Нет", "01.03.2025"));

    }

    public static List<Item> getAllTasks() {
        return itemList;
    }
    public static void addTask(Item item){
        item.setId(id);
        itemList.add(item);
        id++;
    }
    public static Item getTask(Long id){
        Item foundItem = null;
        for(Item it: itemList){
            if(it.getId() == id) {
                foundItem = it;
            }
        }
       return foundItem;
    }

    public static void deleteTask(Long id){
        Item foundItem = null;
        for(Item it: itemList){
            if(it.getId() == id) {
            foundItem = it;
            }
        }
        if(foundItem != null){
            itemList.remove(foundItem);
        }
    }
    public static void saveItem(Item item){
        for (int i = 0; i <itemList.size(); i++) {
            if(itemList.get(i).getId() == item.getId()){
                itemList.set(i,item);
            }
        }
    }
}
