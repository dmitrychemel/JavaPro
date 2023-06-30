package homework14;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeNode {

    private final String key;
    private final String value;
    private final TreeSet<TreeNode> children;

    public TreeNode(String key, String value) {
        this.key = key;
        this.value = value;
        this.children = new TreeSet<>(Comparator.comparing(TreeNode::getKey));

    }

    public void add(TreeNode child){
        children.add(child);
    }

    public boolean remove(TreeNode child){
        return children.remove(child);
    }

    public String getKey(){
        return key;
    }

    public String getValue(){
        return value;
    }

    public Set<TreeNode> getNodes(){
        return children;
    }

    public boolean isLeaf(){
        return children.isEmpty();
    }

    public TreeNode findTreeNodeDFS(String key){
        if(this.key.equals(key)){
            return this;
        }

        for(TreeNode child: children){
            TreeNode find = child.findTreeNodeDFS(key);
            if(find != null){
                return find;
            }

        }
        return null;
    }

    public void printAllTree(){
        System.out.println(key + ": " + value);

        for(TreeNode child: children){
            child.printAllTree();
        }
    }

    public int heightTree(){
        if(this.isLeaf()){
            return 0;
        }

        int countHeight = 0;
        for(TreeNode child: children){
            int heightChild = child.heightTree();
            countHeight = Math.max(countHeight, heightChild);
        }

        return countHeight +1;
    }

    public int totalEdges(){
        if(this.isLeaf()){
            return 0;
        }

        int countEdges = 0;
        for(TreeNode child: children){
            countEdges += child.totalEdges()+1;
        }
        return countEdges;
    }

    public int totalKnots(){
        int countKnots = 1;
        for(TreeNode child: children){
            countKnots += child.totalKnots();
        }
        return countKnots;
    }
}
