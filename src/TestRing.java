public class TestRing {

  public static void main(String[] args) {

    // create a ring and add some objects
    Ring ring = new Ring();
    ring.addObj(4);
    ring.addObj(5);
    ring.addObj(1);
    ring.addObj(3);
    ring.addObj(2);
    ring.addObj(9);
    ring.addObj(6);

    // print out the initial ring
    System.out.println("The size of the ring is : " + ring.size());
    System.out.println(ring);
    System.out.println("The curr node is " + ring.getCurrObj());
    System.out.println();
   

    // advanced curr twice
    ring.advance();
    ring.advance();

    // remove three consecutive nodes
    System.out.println("Remove the current node.");
    System.out.println("The curr node is " + ring.getCurrObj());
    ring.removeCurrObj();
    System.out.println("The size of the ring after removal is : " + ring.size());
    System.out.println(ring);

    System.out.println("The curr node is " + ring.getCurrObj());
    System.out.println("Remove the current node.");
    ring.removeCurrObj();
    System.out.println("The size of the ring after removal is : " + ring.size());
    System.out.println(ring);

    System.out.println("The curr node is " + ring.getCurrObj());
    System.out.println("Remove the current node.");
    ring.removeCurrObj();
    System.out.println("The size of the ring after removal is : " + ring.size());
    System.out.println(ring);
    System.out.println();

    // advanced curr twice
    ring.advance();
    ring.advance();

    System.out.println("The curr node is " + ring.getCurrObj());
    System.out.println("Remove the current node.");
    ring.removeCurrObj();
    System.out.println("The size of the ring after removal is : " + ring.size());
    System.out.println(ring);
    System.out.println();

    // remove the remaining nodes
    int size = ring.size();
    for (int i = 0; i < size; i++)
      ring.removeCurrObj();	

    System.out.println("After removing all nodes.");
    System.out.println("The size of the ring is : " + ring.size());
  }
}
