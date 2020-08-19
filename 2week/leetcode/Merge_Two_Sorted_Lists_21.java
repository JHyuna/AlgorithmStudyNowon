import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge_Two_Sorted_Lists_21 {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ln = l1;

        ArrayList<Integer> al = new ArrayList<>();

        while(true) {
            if(ln == null)
                break;
            al.add(ln.val);
            if(ln.next == null)
                break;
            ln = ln.next;
        }
        ln = l2;
        while(true) {
            if(ln == null )
                break;
            al.add(ln.val);
            if(ln.next == null)
                break;
            ln = ln.next;
        }
        Collections.sort(al);
        System.out.println(al.toString());

        ListNode next = new ListNode();
        ListNode answer = null;
        if(al.size() > 0){
            if(al.size() == 1){
                answer = new ListNode(al.get(0));
            } else{
                answer = new ListNode(al.get(0), next);
            }
            ListNode tmp = answer.next;


            for(int i = 1 ; i < al.size(); i++){
                if(i != 1){
                    tmp = tmp.next;
                }

                tmp.val = al.get(i);

                if(i != al.size() -1){
                    tmp.next = new ListNode();
                }
            }
        }

        return answer;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
