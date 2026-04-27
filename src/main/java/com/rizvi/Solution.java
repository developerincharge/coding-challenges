package com.rizvi;


import org.w3c.dom.Node;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


class Solution {


    public static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static class Stack {
        Node head;

        public void push(int new_data) {
            Node temp = new Node(new_data);
            temp.next = head;
            head = temp;
        }

        public int pop() {
            if (head == null) return -1;
            int value = head.data;
            head = head.next;
            return value;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

        public static class Queue {
            Stack s1, s2;

            Queue() {
                s1 = new Stack();
                s2 = new Stack();
            }

            public void push(int new_data) {
                s1.push(new_data);
            }

            public int pop() {
                // Check if queue is empty
                if (s1.isEmpty() && s2.isEmpty()) {
                    return -1; // or throw an exception for better error handling
                }

                // If s2 is empty, transfer all elements from s1 to s2
                if (s2.isEmpty()) {
                    while (!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
                }

                // Pop from s2 — this is the front of the queue
                return s2.pop();
            }

            // Optional: peek at front element without removing it
            public int peek() {
                if (s1.isEmpty() && s2.isEmpty()) {
                    return -1;
                }

                if (s2.isEmpty()) {
                    while (!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
                }

                return s2.head.data;
            }

            public boolean isEmpty() {
                return s1.isEmpty() && s2.isEmpty();
            }
        }

        public static void main(String[] args) throws java.lang.Exception {
        Queue Q = new Queue();
        Scanner in = new Scanner(System.in);
        int q, type, value, popped, numPops = 0;
        q = in.nextInt();
        int[] output = new int[q];

        for (int i = 0; i < q; i++) {
            type = in.nextInt();
            if (type == 1) {
                value = in.nextInt();
                Q.push(value);
            } else {
                popped = Q.pop();
                output[numPops++] = popped;
            }
        }

        for (int i = 0; i < numPops; i++) {
            if (i != numPops - 1) {
                System.out.print(output[i] + " ");
            } else {
                System.out.print(output[i]);
            }
        }

        in.close(); // Close scanner to prevent resource leak
    }
}