package Graph;
//package Lec54;

import java.util.*;

public class Graph_Basics {

    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph_Basics(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) { //Making empty Hash Map for each node
            map.put(i, new HashMap<>());

        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost); //connecting node 1 to node 2
        map.get(v2).put(v1, cost); // connecting node 2 to node 1
    }

    public boolean ContainsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);

    }

    public boolean Containsvertex(int v1) {

        return map.containsKey(v1);
    }

    public int noofEdge() {
        int ans = 0;
        for (int key : map.keySet()) {
            ans += map.get(key).size();
        }
        //number of Vertix=n*(n-1)/2
        return ans / 2;
    }

    public void removeEdge(int v1, int v2) {

        if (ContainsEdge(v1, v2)) { //removing edge between V1 and V2 by simply deleting From HAshMap
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }

    }

    public void removevertex(int v1) {
        for (int nbrs : map.get(v1).keySet()) {
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);

    }

    public void display() {
        for (int key : map.keySet()) {
            System.out.println(key + "-->" + map.get(key));
        }
    }

    public boolean haspath(int src, int des, HashSet<Integer> visited) {

        if (src == des) {
            return true;
        }
        visited.add(src);
        for (int key : map.get(src).keySet()) {
            if (!visited.contains(key)) {
                boolean ans = haspath(key, des, visited);
                if (ans) {
                    return true;
                }
            }
        }
        visited.remove(src);
        return false;

    }

    public void Printpath(int src, int des, HashSet<Integer> visited, String ans) {
//recursive Trick to print All paths
if (src == des) {
            System.out.println(ans + src);
            return;
        }
        visited.add(src);
        for (int key : map.get(src).keySet()) {
            if (!visited.contains(key)) {
                Printpath(key, des, visited, ans + src);

            }
        }
        visited.remove(src);

    }

    public boolean BFS(int src, int des) {

        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while (!q.isEmpty()) {
            // 1 remove
            int rv = q.remove();
            // 2 ignore if ALready visited
            if (visited.contains(rv)) {
                continue;
            }
            // 3 marked visited
            visited.add(rv);
            // 4 self work
            if (rv == des) {
                return true;
            }
            // 5 unvisited nbrs ko add krna
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }

        }
        return false;

    }
    public boolean DFS(int src, int des) {

        Stack<Integer> s = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        s.push(src);
        while (!s.isEmpty()) {
            // 1 remove
            int rv = s.pop();
            // 2 ignore if ALready visited
            if (visited.contains(rv)) {
                continue;
            }
            // 3 marked visited
            visited.add(rv);
            // 4 self work
            if (rv == des) {
                return true;
            }
            // 5 unvisited nbrs ko add krna
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs)) {
                    s.push(nbrs);
                }
            }

        }
        return false;

    }
    public void BFT() { //used for Disconnected Graph also traverse all element

        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int src : map.keySet()) { // this is added to BFS to form BFT
            if (visited.contains(src)) {
                continue;
            }

            q.add(src);
            while (!q.isEmpty()) {
                // 1 remove
                int rv = q.remove();
                // 2 ignore if ALready visited
                if (visited.contains(rv)) {
                    continue;
                }
                // 3 marked visited
                visited.add(rv);
                // 4 self work
                System.out.print(rv + " ");

                // 5 unvisited nbrs ko add krna
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }

            }
        }
        System.out.println();

    }
    public void DFT() { //Depth first traversal same as DFS

        Stack<Integer> s = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int src : map.keySet()) { // this loop and if condition is added to DFS code!
            if (visited.contains(src)) {
                continue;
            }
            s.push(src);
            while (!s.isEmpty()) {
                // 1 remove
                int rv = s.pop();
                // 2 ignore if ALready visited
                if (visited.contains(rv)) {
                    continue;
                }
                // 3 marked visited
                visited.add(rv);
                // 4 self work
                System.out.print(rv + " ");
                // 5 unvisited nbrs ko add krna
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        s.push(nbrs);
                    }
                }

            }

        }
        System.out.println();

    }
}