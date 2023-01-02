package Iterator.IteratorExample;

public class IteratorExampleMain {

        public static void main(String[] args) {
            Literature literature = new Literature();
            itr(literature.iterator());

            System.out.println("\n+----------Divider----------+\n");

        }

        private static void itr(Iterator iterator) {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
