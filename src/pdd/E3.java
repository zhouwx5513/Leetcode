package pdd;

import java.util.*;

/**
 *
 * 现在一共有N个待执行的任务，每个任务需要Pi的时间完成执行。同时任务之间可能会有一些依赖关系，
 * 比如任务1可能依赖任务2和任务3，那么任务1必须等任务2和任务3执行完成后才能开始执行。
 * 为了最小化任务的平均返回时长，请安排所有任务的执行顺序。假设在零时刻，所有N个任务已到达系统。
 *
 * 每行表示一个任务依赖关系。每行包括2个整数Ai（1<=Ai<=N）、Bi（1<=Bi<=N），表示第Bi个任务依赖于第Ai个任务。
 *
 *
 * 输入示例：
 * 5 6
 * 1 2 1 1 1
 * 1 2
 * 1 3
 * 1 4
 * 2 5
 * 3 5
 * 4 5
 *
 * 输出：1 3 4 2 5
 */


public class E3 {
    static class Task {
        int seq;
        int weight;
        public Task(int n, int w) {
            seq = n;
            weight = w;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();  //task数量
            int m = in.nextInt();  //顺序数
            Task[] t = new Task[n+1];
            for(int i = 1; i < n+1; ++i) {
                t[i] = new Task(i, in.nextInt());
            }
            // construct dependency raph
            Map<Integer, List<Integer>> graph = new HashMap<>();
            int[] indegree = new int[n+1];
            for(int i = 0; i < m; ++i) {
                int u = in.nextInt();
                int v = in.nextInt();
                if(graph.containsKey(u)) {
                    graph.get(u).add(v);
                } else {
                    List<Integer> edges = new ArrayList<>();
                    edges.add(v);
                    graph.put(u, edges);
                }
                indegree[v]++;
            }
            //topological sort
            PriorityQueue<Task> queue = new PriorityQueue<>(new Comparator<Task>() {
                @Override
                public int compare(Task o1, Task o2) {
                    return o1.weight-o2.weight;  //这样优先级队列中是小的先出
                }
            });
            for(int i = 1; i < n+1; ++i) {
                if(indegree[i] == 0) queue.offer(t[i]);
            }
            List<Integer> res = new ArrayList<>();
            while(!queue.isEmpty()) {
                for (Task task: queue){
                    System.out.print(task.seq+"_"+task.weight+" ");
                }
                System.out.println();
               // System.out.println(Arrays.toString(queue.toArray()));
                Task complete = queue.poll();
                res.add(complete.seq);
                if(graph.containsKey(complete.seq)) {
                    for(int i : graph.get(complete.seq)){
                        if(--indegree[i] == 0) {
                            queue.offer(t[i]);
                        }
                    }
                }
            }
            for(int i = 0; i < n; ++i) {
                System.out.print(res.get(i));
                if(i != n-1) System.out.print(" ");
            }
        }
    }
}
