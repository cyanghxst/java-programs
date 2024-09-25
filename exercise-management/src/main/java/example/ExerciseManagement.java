import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<Exercise> exerciseList() {
        return this.exercises;
    }

    public void add(String myExercise) {
        this.exercises.add(new Exercise(myExercise));
    }

    public void markAsCompleted(String myExercise) {
        for (Exercise exercise: this.exercises) {
            if (exercise.getName().equals(myExercise)) {
                exercise.setCompleted();
            }
        }
    }

    public boolean isCompleted(String myExercise) {
        for (Exercise exercise: this.exercises) {
            if (exercise.getName().equals(myExercise)) {
                return exercise.isCompleted();
            }
        }
        return false;
    }

    public boolean contains(String myExercise) {
        for (Exercise exercise: exercises) {
            if (exercise.getName().equals(myExercise)) {
                return true;
            }
        }
        return false;
    }
}
