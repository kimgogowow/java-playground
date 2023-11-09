package com.kim.dataStructure;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println(q.isEmpty());
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(8);
        q.enqueue(3);
        q.enqueue(8);
        System.out.println(q.isFull());
        System.out.println(q.toString());

        Stack s = new Stack(5);
        s.push(1);
        s.push(3);
        s.push(6);
        s.push(8);
        s.push(9);
        System.out.println(s.isEmpty());
        System.out.println(s.toString());

        HashSet hs = new HashSet(5);
        hs.add(1);
        hs.add(4);
        hs.add(6);
        hs.add(7);
        hs.add(9);
        System.out.println(hs.toString());
        System.out.println("contains 9? : "+hs.contains(9));
        System.out.println("contains 100?: "+hs.contains(100));
        hs.remove(9);
        System.out.println(hs.contains(9));



//        LinkedList ll = new LinkedList();
//        ll.size = 10;
//        LinkedList ll2 = new LinkedList();
//        ll2.size = ll.size;
//        ll2.size = 12;
//        System.out.println(ll.size);

        LinkedList.size = 12;


        //for primitive data type
        int a  = 1;
        int b  = a;
        b=2;
        System.out.println(a);



        String string1 = "Hello";
        String string2 = string1;
        string2 = "World";
        System.out.println(string1);
    }

    // int, double, boolean, float, long, byte, char, short

// Queue





    /*
    * Java's stack/heap, not datastructure
    *
    * */


}
