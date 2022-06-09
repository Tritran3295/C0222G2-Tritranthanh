package service.Division;

import model.Division;
import repository.DivisionImpl.DivisionRepositoryImpl;
import repository.DivisionImpl.IDivisionRepository;

import java.util.ArrayList;
import java.util.List;

public class DivisionServiceImpl implements IDivisionService{
    private IDivisionRepository iDivisionRepository = new DivisionRepositoryImpl();
    @Override
    public List<Division> selectAllDivision() {
        List<Division>divisionList = iDivisionRepository.selectAllDivision();
        return divisionList;

    }
}
