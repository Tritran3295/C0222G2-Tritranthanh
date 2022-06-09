package repository.EducationDegreeImpl;

import model.DegreeEducation;

import java.util.List;

public interface IEducationDegreeRepository {
    List<DegreeEducation> selectAllDegreeEducation();
}
