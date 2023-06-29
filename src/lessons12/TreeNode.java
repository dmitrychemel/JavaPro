package lessons12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeNode {
    private String key;
    private String value;
    private TreeSet<TreeNode> children;

    public TreeNode(String key, String value) {
        this.key = key;
        this.value = value;
        this.children = new TreeSet<>(Comparator.comparing(TreeNode::getKey));
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public void add(TreeNode child){
        children.add(child);
    }

    public boolean remove(TreeNode child) {
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
            TreeNode found = child.findTreeNodeDFS(key);
            if(found != null){
                return found;
            }
        }

        return null;
    }

    public void printAllTree(int indentationLevel) {
        StringBuilder tree = new StringBuilder();
        for (int i = 0; i < indentationLevel; i++) {
            tree.append("\t");
        }

        System.out.println("Уровень - " + indentationLevel + " "+ key + ": " + value);

        for (TreeNode child : children) {
            child.printAllTree(indentationLevel + 1);
        }
    }
}
