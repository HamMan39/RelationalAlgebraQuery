public class Model {
    private String rawText;
    private View output;

    public Model(View view){
        output = view;
    }

    public void submitQuery(String rawText){
        this.rawText = rawText;

    }
}
