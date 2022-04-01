public class SwitchCommand extends command {
    public Expression E;
    public CaseStmts caseStmts;
    public StmtList stmtList;


    public SwitchCommand(Expression E, CaseStmts caseStmts, StmtList stmtList){
        this.E = E;
        this.caseStmts = caseStmts;
        this.stmtList = stmtList;
    }


}
