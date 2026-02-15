package algorithms;
/*
https://leetcode.com/problems/merge-two-sorted-lists/description/
 */

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3,new ListNode(4)));
        ListNode resposta = ListNode.mergeTwoLists(list1,list2);
        while(resposta.next != null) {
            System.out.print(resposta.val + ", ");
            resposta = resposta.next;
        }
        System.out.print(resposta.val);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1 == null && list2 == null) {
                return list1;
            } else if(list1 == null) {
                return list2;
            } else if(list2 == null) {
                return list1;
            }
            ListNode listaOrdenada = new ListNode(-200);
            ListNode cabeca = listaOrdenada;
            while(list1 != null && list2 != null) {
                if(cabeca.val != -200) {
                    cabeca.next = new ListNode(-200);
                    cabeca = cabeca.next;
                }
                if(list1.val <= list2.val) {
                    cabeca.val = list1.val;
                    list1 = list1.next;
                } else {
                    cabeca.val = list2.val;
                    list2 = list2.next;
                }
            }
            while(list2 != null ) {
                if(cabeca.val != -200) {
                    cabeca.next = new ListNode(-200);
                    cabeca = cabeca.next;
                }
                cabeca.val = list2.val;
                list2 = list2.next;
            }
            while(list1 != null) {
                if(cabeca.val != -200) {
                    cabeca.next = new ListNode(-200);
                    cabeca = cabeca.next;
                }
                cabeca.val = list1.val;
                list1 = list1.next;
            }
            return listaOrdenada;
        }
    }
}
