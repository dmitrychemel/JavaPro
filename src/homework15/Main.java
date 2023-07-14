package homework15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 1, 1},
                {1, 1, 0, 0},
                {0, 1, 0, 0}
        };

        Graph graph = new Graph(matrix);
        System.out.println(graph.countEdges());

        System.out.println(graph.findWay(0,3));

        List<List<Integer>> dynamicMatrix = new ArrayList<>();
        dynamicMatrix.add(Arrays.asList(0, 1, 1, 0));
        dynamicMatrix.add(Arrays.asList(1, 0, 1, 1));
        dynamicMatrix.add(Arrays.asList(1, 1, 0, 1));
        dynamicMatrix.add(Arrays.asList(0, 1, 1, 0));

        Node node1 = new Node();
        node1.value = "Узел 1";

        Node node2 = new Node();
        node2.value = "Узел 2";

        Node node3 = new Node();
        node3.value = "Узел 3";

        Node node4 = new Node();
        node4.value = "Узел 4";

        node1.nodes.add(new Edge(node2, 1));
        node1.nodes.add(new Edge(node3, 2));

        node2.nodes.add(new Edge(node1, 3));
        node2.nodes.add(new Edge(node3, 4));
        node2.nodes.add(new Edge(node4, 5));

        node3.nodes.add(new Edge(node1, 6));
        node3.nodes.add(new Edge(node2, 7));
        node3.nodes.add(new Edge(node4, 8));

        node4.nodes.add(new Edge(node2, 9));
        node4.nodes.add(new Edge(node3, 10));

        node1.countEdgesAndNodes();

        System.out.println("Есть ли путь - " + node1.findWay(node4));
    }
}
