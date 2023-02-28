package Oops;

import java.util.LinkedList;

public class llChallenge {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        addintolist(list);
        removefromlist(list);
        searchfromlist(list);
        System.out.println(list);
    }


   static void addintolist(LinkedList<String> list){
        list.add("Ahemdabad");
        list.add("Surat");
        list.addFirst("Gandhinagar");
        list.addLast("Vadodra");

        list.offer("Kutch");
        list.offer("Bhuj");
        list.offerFirst("Mandvi");
        list.offerLast("Bhachau");

        list.push("Vapi");
        list.push("Navsari");
       System.out.println(list);
   }
   static void removefromlist(LinkedList<String> list){
        list.remove();
//        list.removeFirst();
//        list.removeLast();
//        list.pop();
//        list.pop();
//        list.poll();
//        list.pollFirst();
//        list.pollLast();
//        list.remove(1);
        System.out.println(list);
   }

   static void searchfromlist(LinkedList<String> list){
//        String s = list.peek();
//        String s = list.peekFirst();
        String s = list.peekLast();
       System.out.println(s);
        boolean u = list.contains("Surat");
       System.out.println(u);
   }
}
