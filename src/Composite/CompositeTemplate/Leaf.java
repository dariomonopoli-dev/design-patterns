package Composite.CompositeTemplate;

public class Leaf extends Component{

    String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println(name);
    }
}
