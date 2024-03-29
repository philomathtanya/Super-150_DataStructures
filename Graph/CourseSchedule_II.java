package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule_II {
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < numCourses; i++) {
                map.put(i, new ArrayList<>());

            }

            for (int i = 0; i < prerequisites.length; i++) {
                int a1 = prerequisites[i][0];
                int b1 = prerequisites[i][1];
                map.get(b1).add(a1);
            }

            int[] in = indegre(map);
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < in.length; i++) {
                if (in[i] == 0) {
                    q.add(i);
                }
            }
            int count = 0;
            int[] order = new int[map.size()];
            int idx = 0;
            while (!q.isEmpty()) {
                int rv = q.poll();
                order[idx++] = rv;
                count++;
                for (int nbrs : map.get(rv)) {
                    in[nbrs]--;
                    if (in[nbrs] == 0) {
                        q.add(nbrs);
                    }
                }
            }
            return count == map.size() ? order : new int[0];

        }

        public int[] indegre(HashMap<Integer, List<Integer>> map) {
            int[] in = new int[map.size()];
            for (int key : map.keySet()) {
                for (int nbsr : map.get(key)) {
                    in[nbsr]++;
                }
            }
            return in;
        }
    }
}