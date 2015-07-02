package ro.fortsoft.sqlxplr.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by djipa on 7/2/15 4:14 PM.
 */
public class Node {

    private String text;
    private List<Node> nodes = new ArrayList<>();

    public Node(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
}
