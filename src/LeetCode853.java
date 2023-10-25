public class LeetCode853 {
    public int carFleet(int target, int[] position, int[] speed) {
        return target;

    }

    class stack {
        Node head;

        public void push(int position, int speed) {
            if (head == null) {
                head = new Node(position, speed, null);
            } else {
                head = new Node(position, speed, head);
            }
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.position;
        }

        public int getMin() {
            return head.speed;
        }

        class Node {
            int position;
            int speed;
            Node next;

            public Node(int position, int speed, Node next) {
                this.speed = speed;
                this.next = next;
                this.position = position;
            }

            public Node() {
            }

        }
    }
}
