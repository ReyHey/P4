public class IfCommand extends Command {
    public Expression E;
    public Block b1;
    public Block b2

    public IfCommand(Expression E, Block b1, Block b2){
        this.E = E;
        this.b1 = b1;
        this.b2 = b2;
    }

}
