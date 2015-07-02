package ro.fortsoft.sqlxplr.jdbc;

import java.util.List;

/**
 * Created by djipa on 7/2/15 3:29 PM.
 */
public interface TreeNode<T> {
    List<T> getChildren();
}
