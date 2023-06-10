package pro.sky.cw2.service;

import pro.sky.cw2.model.Question;

import java.util.Collection;

public interface ExaminerService {


    Collection<Question> getQuestions(int amount);
}
