package service.EducationDegree;

import model.DegreeEducation;
import repository.EducationDegreeImpl.EducationDegreeImpl;
import repository.EducationDegreeImpl.IEducationDegreeRepository;

import java.util.ArrayList;
import java.util.List;

public class EducationServiceImpl implements IEducationDegreeService {
    private IEducationDegreeRepository iEducationDegreeRepository = new EducationDegreeImpl();
    @Override
    public List<DegreeEducation> selectAllDegreeEducation() {
        List<DegreeEducation> degreeEducationList = new ArrayList<>();
        return degreeEducationList;
    }
}
