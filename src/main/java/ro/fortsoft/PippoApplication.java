package ro.fortsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.fortsoft.sqlxplr.tree.Node;
import ro.pippo.core.Application;
import ro.pippo.core.route.RouteContext;
import ro.pippo.core.route.RouteHandler;
import ro.pippo.fastjson.FastjsonEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple Pippo application.
 *
 * @see ro.fortsoft.PippoLauncher#main(String[])
 */
public class PippoApplication extends Application {

    private final static Logger log = LoggerFactory.getLogger(PippoApplication.class);

    @Override
    protected void onInit() {

        addPublicResourceRoute("/app");
        addWebjarsResourceRoute();

        GET("/", new RouteHandler() {

            @Override
            public void handle(RouteContext routeContext) {
                routeContext.render("index.html");
            }

        });

        GET("/jdbc/connections", new RouteHandler() {
            @Override
            public void handle(RouteContext routeContext) {
                routeContext.json().send(getJsonConnections());
            }
        });
    }

    private String getJsonConnections() {
//        List<Connection> all = new ArrayList<Connection>();
//        Connection con1 = new Connection();
//        con1.setName("Production");
//        con1.setType(ConnectionType.MYSQL);
//        all.add(con1);
//        Connection con2 = new Connection();
//        con2.setName("Test");
//        con2.setType(ConnectionType.MYSQL);
//        all.add(con2);
//        Connection con3 = new Connection();
//        con3.setName("Development");
//        con3.setType(ConnectionType.MYSQL);
//        all.add(con3);
//        FastjsonEngine engine = new FastjsonEngine();
//        String json = engine.toString(all);
//        log.info(json);
//        return json;
        List<Node> tree = new ArrayList<Node>();
        Node parent1 = new Node("Parent 1");
        Node child1 = new Node("Child 1");
        Node child2 = new Node("Child 2");
        parent1.getNodes().add(child1);
        parent1.getNodes().add(child2);
        Node grandChild1 = new Node("Grandchild 1");
        Node grandChild2 = new Node("Grandchild 2");
        child1.getNodes().add(grandChild1);
        child1.getNodes().add(grandChild2);
        Node parent2 = new Node("Parent 2");
        Node parent3 = new Node("Parent 3");
        Node parent4 = new Node("Parent 4");
        Node parent5 = new Node("Parent 5");
        tree.add(parent1);
        tree.add(parent2);
        tree.add(parent3);
        tree.add(parent4);
        tree.add(parent5);
        FastjsonEngine engine = new FastjsonEngine();
        String json = engine.toString(tree);
        log.info(json);
        return json;
    }
}
