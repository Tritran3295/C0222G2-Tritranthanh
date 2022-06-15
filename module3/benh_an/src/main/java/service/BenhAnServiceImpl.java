package service;

import repo.BenhAnRepositoryImpl;
import repo.IBenhAnRepository;

public class BenhAnServiceImpl implements IBenhAnService{
    IBenhAnRepository iBenhAnRepository = new BenhAnRepositoryImpl();
}
