package service.Status;

import model.Status;
import repository.Status.IStatusRepository;
import repository.Status.StatusRepositoryImpl;

import java.util.List;

public class StatusServiceImpl implements IStatusService{
    IStatusRepository iStatusRepository = new StatusRepositoryImpl();
    @Override
    public List<Status> selectAllStatus() {
        return iStatusRepository.selectAllStatus();
    }
}
