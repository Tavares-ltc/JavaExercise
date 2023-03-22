import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<Exercise> exercises;

    public Forum() {
        exercises = new ArrayList<>();
    }

    public String addQuestion(Exercise question, User user){
        if(user.member){
            exercises.add(question);
            return "Question added.";
        }
        return "You need to be a member to do this.";
    }

    public void getExercises() {
        for (int i = 0; i < exercises.size(); i++) {
            Exercise exercise = exercises.get(i);
            System.out.println((i) + ". " + exercise.getTitle());
            System.out.println(exercise.getQuestion());
            System.out.println(exercise.getAnswers());

        }
    }
    
    public void addAnswer(int index, String answer, User user) {
        Exercise exercise = exercises.get(index);
        exercise.addAnswer(user.name + ": " + answer);
    }

}
