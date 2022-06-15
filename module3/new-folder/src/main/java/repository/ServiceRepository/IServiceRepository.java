package repository.ServiceRepository;

import model.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceRepository {
    List<Service> selectAllService();

    void createsService(Service service) throws SQLException;
}
