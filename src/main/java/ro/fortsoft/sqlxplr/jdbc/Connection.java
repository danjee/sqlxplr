package ro.fortsoft.sqlxplr.jdbc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by djipa on 7/2/15 2:33 PM.
 */
public class Connection implements TreeNode<DatabaseSchema> {

    private String name;
    private ConnectionType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConnectionType getType() {
        return type;
    }

    public void setType(ConnectionType type) {
        this.type = type;
    }

    @Override
    public List<DatabaseSchema> getChildren() {
        List<DatabaseSchema> schemas =new ArrayList<>();
        return schemas;
    }
}
