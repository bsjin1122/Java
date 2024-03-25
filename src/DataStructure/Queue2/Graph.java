import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean marked; // 방문했는지 마킹하는 플래그 선언

        Node(int data) { // 생성자, 데이터를 받고, 초기화하고 linkedlist준비
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
    }
    Node[] nodes; // 노드들을 저장할 배열이 필요함
    Graph(int size) { // 노드 개수는 고정으로
        nodes = new Node[size]; // 노드 개수를 받아서 배열 방을 만듦
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i); // 편의를 위해 배열 방번호와 같게
        }
    }

    void addEdge(int i1, int i2){ // 두 노드의 관계를 저장하는 함수
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        // 데이터가 인덱스와 같으니, 받은 숫자로 인덱스를 사용할 수 있다.
        if (!n1.adjacent.contains(n2)) { // 상대방이 있는지 확인하고, 서로 추가를 해준다.
            n1.adjacent.add(n2);
        }
        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }
    void dfs() {// 그냥 호출하면 0번부터
        dfs(0);
    }

    void dfs(int index) { // 시작 인덱스를 받아서 dfs 순회 결과를 출력
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>(); // 스택 생성
        stack.push(root); // 노드 하나 넣고
        root.marked = true; // 표시
        while (!stack.isEmpty()) { // 데이터가 없을 때까지 반복하는 작업
            Node r = stack.pop(); // 데이터 하나 가져오고
            for (Node n : r.adjacent) {// 가져온 노드의 자식들을 추가
                if (n.marked == false) {  // 추가되지 않은 자식들만 넣기
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    void bfs(){
        bfs(0);
    }

    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        root.marked = true;
        while (!queue.isEmpty()) {
            Node r = queue.poll();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.offer(n);
                }
            }
            visit(r);
        }
    }

    void dfsR(Node r) {
        if (r == null) {
            return;
        }
        r.marked = true;
        visit(r);
        for (Node n : r.adjacent) {
            if (n.marked == false) {
                dfsR(n);
            }
        }
    }

    void dfsR(int index) { // 시작노드를 다양하게 테스트해보기 위해
        Node r = nodes[index]; // 해당 노드를 시작으로 재귀호출 시작
        dfsR(r);
    }
    void dfsR(){
        dfsR(0);
    }


    void visit(Node n) {
        System.out.print(n.data + " ");
    }


}
