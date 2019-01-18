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
public class FactoryPatternJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        
        run(animalFactory.getAnimal(EnumType.AnimalType.dog));
        run(animalFactory.getAnimal(EnumType.AnimalType.cat));
        run(animalFactory.getAnimal(EnumType.AnimalType.bear));
    }
    
    public static void run(Animal animal){
        System.out.println(animal.speek());
    }
    
}
