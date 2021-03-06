package io.pello.codewars.linkedlist.mergelists;
import io.pello.codewars.linkedlist.ListNode;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeListsTest {
    
    private ListNode listNode1;
    private ListNode listNode2;
    private MergeLists mergeLists;
    
    @BeforeEach
    void setUp() throws Exception {
        mergeLists = new MergeLists();
        listNode1 = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8,null))));
        listNode2 = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7,null))));
    }
    @Test
    void testListNodeIntListNode() {
        assertEquals(mergeLists.merge(listNode1, listNode2).toString(), "1->2->3->4->5->6->7->8");
    }

    @Test
    void testToString() {
        listNode1 = null;
        listNode2 = null;
        assertNull(mergeLists.merge(listNode1, listNode2));
    }
}
