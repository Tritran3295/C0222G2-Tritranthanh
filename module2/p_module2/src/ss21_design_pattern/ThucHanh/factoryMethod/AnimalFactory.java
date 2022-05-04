package ss21_design_pattern.ThucHanh.factoryMethod;

public class AnimalFactory {
    public Animals getAnimal(String type){
        if("canine".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
