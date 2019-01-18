/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypatternjava;

/**
 *
 * @author mastanczak
 */
public class AnimalFactory {
    
    public Animal getAnimal( EnumType.AnimalType animalType ){
        if(animalType == null){
            return null;
        }
        if(animalType.equals(EnumType.AnimalType.dog)){
            return new Dog();
        }
        if(animalType.equals(EnumType.AnimalType.cat)){
            return new Cat();
        }
        if(animalType.equals(EnumType.AnimalType.bear)){
            return new Bear();
        }
        
        return null;
    }
    
}
