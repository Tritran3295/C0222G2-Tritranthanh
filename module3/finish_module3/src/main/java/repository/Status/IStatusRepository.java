package repository.Status;

import model.Status;

import java.util.List;

public interface IStatusRepository {
    List<Status> selectAllStatus();
}
