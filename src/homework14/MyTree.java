package homework14;

public class MyTree {
    public static void main(String[] args) {
        TreeNode director = new TreeNode("Директор","Василий");
        TreeNode deputy = new TreeNode("Заместитель","Герасим");
        TreeNode salesDepartment = new TreeNode("Отдел продаж","Марк");
        TreeNode marketingDepartment = new TreeNode("Отдел маркетинга","Антон");
        TreeNode finance = new TreeNode("Финансы","Сергей");
        TreeNode assistant = new TreeNode("Помощник","Георгий");
        TreeNode marketerSenior  = new TreeNode("Маркетолог Старший","Андрей");
        TreeNode marketer = new TreeNode("Маркетолог","Дима");
        TreeNode marketerAssistant = new TreeNode("Помощник в Маркетинге","Борис");
        TreeNode salesmanSenior = new TreeNode("Продажник Старший","Кирил");
        TreeNode salesman = new TreeNode("Продажник","Игорь");

        director.add(deputy);
        director.add(salesDepartment);
        director.add(marketingDepartment);
        deputy.add(finance);
        deputy.add(assistant);
        marketingDepartment.add(marketer);
        marketingDepartment.add(marketerSenior);
        marketerSenior.add(marketerAssistant);
        salesDepartment.add(salesmanSenior);
        salesDepartment.add(salesman);

        director.printAllTree();
        System.out.println("высота дерева: " + director.heightTree());
        System.out.println("количество ребер: " + director.totalEdges());
        System.out.println("количество узлов: " + director.totalKnots());



    }
}
