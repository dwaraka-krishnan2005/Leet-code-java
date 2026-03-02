class solve {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;

        // 2. Loop until we run out of numbers to add
        while (l1 != null || l2 != null || carry != 0) {
            
            // Get the value from L1 (or 0 if it's empty)
            int val1 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next; // Move to the next number in L1
            }

            // Get the value from L2 (or 0 if it's empty)
            int val2 = 0;
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next; // Move to the next number in L2
            }

            // 3. Add them together with the carry
            int total = val1 + val2 + carry;
            
            // If total is 12, carry becomes 1. If total is 7, carry becomes 0.
            carry = total / 10; 
            
            // If total is 12, we only want the '2'.
            int digit = total % 10; 

            // 4. Create a new "Link" in our chain with that digit
            current.next = new ListNode(digit);
            current = current.next; // Step forward into that new link
        }

        // 5. Skip the placeholder and return the real answer
        return head.next;
    }
        
    }
