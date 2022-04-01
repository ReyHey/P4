public class WhileCommand extends Command {
    public Expression E;
    public Block b;

    public WhileCommand(Expression E, Block b){
        this.E = E;
        this.b = b;
    }

}
