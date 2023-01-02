package Composite.CompositeTemplate;


public abstract class Component {


    public abstract void operation();

        public void add(Component component) {

            throw new UnsupportedOperationException();
        }
        public void remove(Component component) {

            throw new UnsupportedOperationException();
        }
        public Component getChild(int i) {

            throw new UnsupportedOperationException();
        }


}
