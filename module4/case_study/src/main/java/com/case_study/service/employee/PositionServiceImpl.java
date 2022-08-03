package com.case_study.service.employee;

import com.case_study.model.employee.Position;
import com.case_study.repository.employee.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements IPositionService {
    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> selectAll() {
        return positionRepository.findAll();
    }
}
