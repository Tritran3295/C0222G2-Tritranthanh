package service.TypeRoom;

import model.TypeRoom;
import repository.TypeRoom.ITypeRoomRepository;
import repository.TypeRoom.TypeRoomRepositoryImpl;

import java.util.List;

public class TypeRoomServiceImpl implements ITypeRoomService{
    ITypeRoomRepository iTypeRoomRepository = new TypeRoomRepositoryImpl();

    @Override
    public List<TypeRoom> selectAllTypeRoom() {
        return  iTypeRoomRepository.selectAllTypeRoom();
    }
}
