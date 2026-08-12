package com.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(50);
        pq.add(55);
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}