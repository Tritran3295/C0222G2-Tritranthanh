package service.ServiceService;

import model.Service;
import repository.ServiceRepository.IServiceRepository;
import repository.ServiceRepository.ServiceRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class ServiceServiceImpl implements IServiceService {
    private IServiceRepository iServiceRepository = new ServiceRepositoryImpl();
    @Override
    public List<Service> selectAllService() {
        return iServiceRepository.selectAllService();
    }

    @Override
    public void add(Service service) throws SQLException {
        iServiceRepository.createsService(service);
    }
}
