public class Main {
  public static void main(String[] args) {
    BinaryHeap bh=new BinaryHeap(5);
    
    System.out.println("Max Heap");
    bh.insert(5,"Max");
    bh.insert(10,"Max");
    bh.insert(15,"Max");
    bh.insert(20,"Max");
    bh.insert(30,"Max");
    bh.levelOrder();

    bh.extractHeadNode("Max");
    bh.levelOrder();
    bh.deleteBH();
  }
}