import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Fruits");
        DefaultMutableTreeNode citrus = new DefaultMutableTreeNode("Citrus");
        citrus.add(new DefaultMutableTreeNode("Orange"));
        citrus.add(new DefaultMutableTreeNode("Lemon"));
        citrus.add(new DefaultMutableTreeNode("Lime"));

        DefaultMutableTreeNode berries = new DefaultMutableTreeNode("Berries");
        berries.add(new DefaultMutableTreeNode("Strawberry"));
        berries.add(new DefaultMutableTreeNode("Blueberry"));
        berries.add(new DefaultMutableTreeNode("Raspberry"));

        root.add(citrus);
        root.add(berries);

        JTree tree = new JTree(root);

        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
