package service.ServiceService;

import model.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceService {
    List<Service> selectAllService();

    void add(Service service) throws SQLException;
}
