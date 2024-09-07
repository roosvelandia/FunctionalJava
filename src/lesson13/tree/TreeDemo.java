package lesson13.tree;

public class TreeDemo {
    public static void main(String[] args) {

        TreeFun<Integer> tree = TreeFun.tree(23,5,76,10,3,45);
        System.out.println("_________TreeFun________");
        System.out.println(tree);
        System.out.println("_________Remove TreeFun________");
        TreeFun<Integer> treeRemove10 = tree.remove(10);
                System.out.println(treeRemove10);
        System.out.println("_________IsMember TreeFun________");
        System.out.println(tree.isMember(10));
        System.out.println("_________IsNotMember TreeFun________");
        System.out.println(tree.isMember(33));
        System.out.println("_________Max TreeFun________");
        System.out.println(tree.max());

    }
}
