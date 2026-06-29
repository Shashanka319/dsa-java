package com.dsa.linkedList;

// A simple Node class for our custom Linked List chaining
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Custom Set implementation from scratch
class CustomSet {
    private Node[] bucketArray;
    private int numBuckets;

    public CustomSet(int capacity) {
        this.numBuckets = capacity;
        this.bucketArray = new Node[numBuckets];
    }

    // Hash function to map a key to a bucket index
    private int getBucketIndex(int key) {
        // Using Math.abs to safely handle negative integers
        return Math.abs(key) % numBuckets;
    }

    // 1. ADD OPERATION (Returns true if added, false if already exists)
    public boolean add(int key) {
        int bucketIndex = getBucketIndex(key);
        Node head = bucketArray[bucketIndex];

        // Check if the key already exists in the linked list
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return false; // Duplicate found, do not add
            }
            current = current.next;
        }

        // Key is unique, insert it at the head of the linked list
        Node newNode = new Node(key);
        newNode.next = head;
        bucketArray[bucketIndex] = newNode;
        return true;
    }

    // 2. CONTAINS OPERATION (Returns true if key exists)
    public boolean contains(int key) {
        int bucketIndex = getBucketIndex(key);
        Node current = bucketArray[bucketIndex];

        // Search the linked list at this bucket
        while (current != null) {
            if (current.data == key) {
                return true; // Found
            }
            current = current.next;
        }
        return false; // Not found
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Initialize our custom set with 10 buckets
        CustomSet mySet = new CustomSet(10);

        int[] stream = {5, 23, 5, -8, 23, 42};

        System.out.println("Processing stream of numbers:");
        for (int num : stream) {
            boolean inserted = mySet.add(num);
            System.out.println("Inserting " + num + ": " + (inserted ? "Success" : "Duplicate ignored"));
        }

        System.out.println("\nTesting lookups:");
        System.out.println("Contains 23? " + mySet.contains(23)); // Expected: true
        System.out.println("Contains -8? " + mySet.contains(-8)); // Expected: true
        System.out.println("Contains 100? " + mySet.contains(100)); // Expected: false
    }
}