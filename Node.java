public class Node {
	public Node(String type, String op, String left, String right) {
		this.type = type;
		this.op = op;
		this.left = left;
		this.right = right;
	}
	public Node(String type, String left) {
		this.type = type;
		this.left = left;
	}

	String type;
	String op;
	String left;
	String right;
}