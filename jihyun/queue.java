package jihyun;
import java.util.*;
import java.io.*;

public class queue {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Queue<Integer> queue = new LinkedList<>();
    StringBuilder sb = new StringBuilder();

    int back = 0;

    for(int i = 0; i < N; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String S = st.nextToken();

      switch (S) {
        case "push":
          back = Integer.parseInt(st.nextToken());
          queue.add(back);
          break;
        case "pop":
          if(queue.isEmpty())
            sb.append(-1 + "\n");
          else{
            sb.append(queue.element() + "\n");
            queue.remove();
          }
          break;
        case "size":
          sb.append(queue.size() + "\n");
          break;
        case "empty":
          if(queue.isEmpty())
            sb.append(1 + "\n");
          else
            sb.append(0 + "\n");
          break;
        case "front":
          if(queue.isEmpty())
          sb.append(-1 + "\n");
          else
          sb.append(queue.element() + "\n");
          break;
        case "back":
          if(queue.isEmpty())
          sb.append(-1 + "\n");
          else
          sb.append(back + "\n");
          break;
          
        default:
          break;
      }
    }
    System.out.print(sb);
  }
}
