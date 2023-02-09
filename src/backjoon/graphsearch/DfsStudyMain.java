package backjoon.graphsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DfsStudyMain {

    static StringBuilder sb = new StringBuilder();
    static int[] result = new int[100001];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //정점 개수
        int M = Integer.parseInt(st.nextToken()); //간선 개수
        int R = Integer.parseInt(st.nextToken()); //시작 정점

        LinkedList<Integer>[] graph = new LinkedList[N + 1]; //그래프

        for (int i = 1; i <= N; i++) {
            graph[i] = new LinkedList<>();
        }

        //간선
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            graph[v1].add(v2);
            graph[v2].add(v1); //양방향
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]); //각 정점에 연결된 정점을 오름차순 정렬
        }

        boolean[] visited = new boolean[N + 1]; //방문 체크

        DFS(R, graph, visited); //탐색 시작

        for (int i = 1; i <= N; i++) {
            sb.append(result[i] + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    //DFS(깊이 우선 탐색)
    public static void DFS(int R, LinkedList<Integer>[] graph, boolean[] visited) {

        Iterator<Integer> iterator = graph[R].listIterator();

        visited[R] = true; //시작 정점은 무조건 방문
        result[R] = ++count; //순서 입력

        //방문한 정점에 인접한 정점이 있다면
        while (iterator.hasNext()) {
            int w = iterator.next();

            //아직 방문하지 않았다면
            if (!visited[w]) {
                DFS(w, graph, visited); //DFS 탐색
            }
        }
    }
}
