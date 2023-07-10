package homework15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    String value;
    LinkedList<Edge> nodes = new LinkedList<>();

    public void print() {
        System.out.println(value);
        nodes.forEach(System.out::println);
    }

    public void countEdgesAndNodes() {
        int countNodes = 0;
        int countEdges = 0;

        List<Node> visitedNodes = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        visitedNodes.add(this);
        queue.add(this);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            countNodes++;

            for (Edge edges : currentNode.nodes) {
                countEdges++;
                Node neighbor = edges.node;

                if (!visitedNodes.contains(neighbor)) {
                    visitedNodes.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println("Узлов " + countNodes);
        System.out.println("Ребер " + countEdges/2);
    }

    public boolean findWay(Node target) {
        List<Node> visitedNodes = new ArrayList<>();
        return helper(this, target, visitedNodes);
    }

    public boolean helper(Node current, Node target, List<Node> visitedNodes) {
        visitedNodes.add(current);

        for(Edge edges: current.nodes){
            Node neighbor = edges.node;
            if(current == target || (!visitedNodes.contains(neighbor)) && helper(neighbor, target, visitedNodes)){
                return true;
            }
        }
        return false;
    }
}
