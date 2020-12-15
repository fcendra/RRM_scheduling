  public class Ring {

  // DO NOT CHANGE THE FOLLOWING
  private class RingNode {
    Object obj;
    RingNode next;
 
    RingNode(Object j) {
      obj = j;
      next = null;  
    }
  }

  private RingNode head;
  private RingNode curr;

  public Ring() {
    head = curr = null;
  }
  
  // print out the content of the ring
  // starting from the head node
  public String toString() {
    String s = "";

    RingNode curr = head;
    if (curr == null) return s;

    s += curr.obj.toString();
    while (curr.next != head) {
      curr = curr.next;
      s += ", " + curr.obj.toString();
    }

    return s;
  }
  ////////////////////////////////////////

  // PUT YOUR CODES BELOW HERE
  
  //This method add Obj in the ring
  public void addObj(Object obj) {
	  RingNode newNode = new RingNode(obj);
	  if (head == null) {
		  head = newNode;
		  head.next = head;
		  curr = head;
	  }
	  else {
		  RingNode temp = head.next;
		  head.next = newNode;
		  head.next.next = temp;
	  }
  }
  
  //This method returns the number of nodes in the ring
  public int size() {
	  if (head == null) {
		  return 0;
	  }
	  int count = 1;
	  RingNode current = curr.next;
	  RingNode stop = curr;
	  while (current!=stop) {
		  count++;
		  current = current.next;
	  }
	  return count;
  }
  
  //This method returns the object pointed by curr
  public Object getCurrObj() {
	  return curr.obj;
  }
  
  //This method removes the object being pointed by curr
  public void removeCurrObj() {
	  if (head == null) {
		  return;
	  }
	  if (head.next == head) {
		  head = null;
	  }
	  else {
		  if (curr == head) {
			  RingNode tempNode = head.next;
			  curr = head.next;
			  int counter = 1;
			  int start = 1;
			  RingNode stopNode = head;
			  while (tempNode != stopNode) {
				  counter++;
				  tempNode = tempNode.next;
			  }
			  while (start != counter) {
				  head = head.next;
				  start +=1;
			  }
			  head.next = head.next.next;
			  head = head.next;
			  curr = head;
		  }
		  else {
			  int counter2 = 1;
			  RingNode current = curr.next;
			  RingNode stop = curr;
			  while (current!=stop) {
				  counter2++;
				  current = current.next;
			  }
			  int start2 = 1;
			  while (start2 != (counter2 )) {
				  curr = curr.next;
				  start2 += 1;
			  }
			  curr.next = curr.next.next;
			  curr = curr.next;
		  }
	  }
  }
  
  //This method advance curr to the next node
  public void advance() {
	  if (head == null) {
		  curr = null;
	  }
	  else if (head == curr) {
		  curr = head.next;
	  }
	  else {
		  RingNode traverse = head.next;
		  while (traverse != curr) {
				  traverse = traverse.next;
		  }
		  curr = traverse.next;
	  }
  }
}

