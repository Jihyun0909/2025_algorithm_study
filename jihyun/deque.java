package jihyun;
import java.util.*;
import java.io.*;

public class deque {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front":
                    sb.append(dq.isEmpty() ? "-1\n" : dq.pollFirst() + "\n");
                    break;

                case "pop_back":
                    sb.append(dq.isEmpty() ? "-1\n" : dq.pollLast() + "\n");
                    break;

                case "size":
                    sb.append(dq.size()).append("\n");
                    break;

                case "empty":
                    sb.append(dq.isEmpty() ? "1\n" : "0\n");
                    break;

                case "front":
                    sb.append(dq.isEmpty() ? "-1\n" : dq.peekFirst() + "\n");
                    break;

                case "back":
                    sb.append(dq.isEmpty() ? "-1\n" : dq.peekLast() + "\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
