package com.leepans.code.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Victor
 * @Date 2026-06-02 6:54 p.m.
 */

public class C_LRUCache_146 {
    class Node{
        int key,val;
        Node prev,next;
        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    private int capacity;
    private Node head,tail;
    private Map<Integer,Node> map;

    public C_LRUCache_146(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if (!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        addToHead(node);
        return node.val;
    }

    public void put(int key, int val){
        if ((map.containsKey(key))){
            Node node = map.get(key);
            node.val = val;
            remove(node);
            addToHead(node);
        }else {
            if (map.size()==capacity){
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }

            Node newNode = new Node(key,val);
            map.put(key,newNode);
            addToHead(newNode);
        }
    }

    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node){
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        C_LRUCache_146 lRUCache = new C_LRUCache_146(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // return -1 (not found)
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));    // return 4
    }

}
