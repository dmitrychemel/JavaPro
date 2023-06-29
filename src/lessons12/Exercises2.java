package lessons12;

public class Exercises2 {
    public static void main(String[] args) {
        TreeNode level1 = new TreeNode("Директор","Алексей");
        TreeNode level2 = new TreeNode("Заместитель-1","Иван");
        TreeNode level2_1 = new TreeNode("Заместитель-2","Сергей");
        TreeNode level3From2 = new TreeNode("РОП-1","Гоша");
        TreeNode level3From2copy = new TreeNode("РОП-2","Антон");
        TreeNode level3From2_1 = new TreeNode("РОП-3","Дима");
        TreeNode level3From2_1copy = new TreeNode("РОП-4","Георгий");
        level1.add(level2);
        level1.add(level2_1);
        level2.add(level3From2);
        level2.add(level3From2copy);
        level2_1.add(level3From2_1);
        level2_1.add(level3From2_1copy);

        level1.printAllTree(0);

        System.out.println(level1.findTreeNodeDFS("РОП-4"));
    }
}
