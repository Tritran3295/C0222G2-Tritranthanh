package ss999_ket_thuc_module.service.Impl;

import ss999_ket_thuc_module.model.ShopPhone;
import ss999_ket_thuc_module.service.IShopPhone;

import java.util.ArrayList;
import java.util.List;

public class ShopPhoneImpl implements IShopPhone {
    HandPhoneImpl handPhone = new HandPhoneImpl();
    RealPhoneImpl realPhone = new RealPhoneImpl();

    @Override
    public void display() {
        realPhone.display();
        handPhone.display();

    }

    @Override
    public void add() {
        handPhone.add();
        realPhone.add();
    }

    @Override
    public void delete() {
        handPhone.delete();
        realPhone.delete();

    }

    @Override
    public void search() {
        handPhone.search();
        realPhone.search();

    }
}
