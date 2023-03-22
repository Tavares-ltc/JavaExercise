import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

    
        Forum forum = new Forum();
        User user = new User();
        
        user.name = "Jhon";
        user.member = true;
        Exercise exercise = new Exercise();
        exercise.setQuestion("Chem question;", "Which element has the largest atomic radius?");

        forum.addQuestion( exercise, user);
        

        User chemUser = new User();

        chemUser.name = "Dmitri";
        chemUser.member = false;

        forum.addAnswer(0, "Maybe Fr or Cs", chemUser);

        forum.getExercises();
    }
    
}
