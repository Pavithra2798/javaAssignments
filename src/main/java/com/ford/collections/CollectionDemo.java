package com.ford.collections;

import java.util.*;

public class CollectionDemo {
    public int operateCollection() {
        int[] arrary = new int[]{1, 2, 3, 4, 5};
        return arrary[0];
    }

    public Object operateVector() {
        Vector vector = new Vector();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        return vector.elementAt(0);
    }

    public Object operateHashTable() {
        Hashtable hashTable = new Hashtable();
        hashTable.put(1, "hi");
        hashTable.put(2, "pavi");
        hashTable.put(3, "welcome");
        return hashTable.get(1);

    }

    public void operateArrayList() {
        //ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int number = (int) iterator.next();
            if (number == 2) {
                //arrayList.remove(2);
                iterator.remove();
            }

            //System.out.println(iterator.next());
        }
//        for (Integer number:arrayList
//             ) {
//            //System.out.println(number);
//            if(number == 2){
//                arrayList.remove(number);
//            }

        System.out.println(arrayList.size());
        //return arrayList.get(0);
    }

    public int operateHashMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Pavi", 100);
        //System.out.println(hashMap.get("Pavi").hashCode());
        hashMap.put("Ashi", 101);
        hashMap.put("Vidhi", 102);
        hashMap.put("Pavi", 200);
        //System.out.println(hashMap.get("Pavi").hashCode());
        Iterator dummyIterator = hashMap.keySet().iterator();
        while (dummyIterator.hasNext()) {
            System.out.println(dummyIterator.next().hashCode());

        }
        return hashMap.get("Pavi");
    }

    public void operateQueues() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(14);
        queue.add(100);
        queue.add(2);
        queue.add(10);
        queue.add(4);
        queue.poll();
        System.out.println(queue);



    }
}
