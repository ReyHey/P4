public class ForEachCommand extends Command{
    public Type type;
    public Block b;

    public ForEachCommand(Type type, Block b){
        this.type = type;
        this.b = b;
    }
}
