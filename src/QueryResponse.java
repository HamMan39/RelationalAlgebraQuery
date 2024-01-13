import java.util.ArrayList;

public class QueryResponse {
    private ArrayList<Relation> data;
    private ArrayList<String> commands;

    public QueryResponse(){
        data = new ArrayList<>();
        commands = new ArrayList<>();
    }
    public void addRelation(Relation newRelation){
        data.add(newRelation);
    }
    public void addCommand(String newCommand){
        commands.add(newCommand);
    }
    public ArrayList<Relation> getData(){
        return data;
    }
    public ArrayList<String> getCommands(){
        return commands;
    }
}
