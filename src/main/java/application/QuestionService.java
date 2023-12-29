package application;

import java.util.List;

public interface QuestionService {
    int addQuestion(Question newQuestion);
    int removeQuestion(int questionId);
    List<Question> getAllQuestions();
}
