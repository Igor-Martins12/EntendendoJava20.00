package Lojas;

import orientacaoObjetos.Cachorro;



public class PetShop {
    public void darbanho(orientacaoObjetos.animal animal){
        animal.setEstadoDoEspirito("Limpo");

    }
    
    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDoEspirito("tosado");

    }

    public void deixarNoHotel(orientacaoObjetos.animal animal) {
        animal.setEstadoDoEspirito("com saudades");

    }
}
