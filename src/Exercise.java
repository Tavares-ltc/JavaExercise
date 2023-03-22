import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private String title;
    private String question;
    private List<String> answers;
    
    public void setQuestion(String title, String question) {
        this.title = title;
        this.question = question;
        this.answers = new ArrayList<>();
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public void addAnswer(String answer) {
        answers.add(answer);
    }
    
    public List<String> getAnswers() {
        return answers;
    }

}
