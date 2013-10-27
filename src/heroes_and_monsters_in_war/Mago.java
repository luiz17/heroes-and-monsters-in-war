package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Mago extends Heroi {
    
    public Mago(String name, int idade, double peso) {
        
        // Adiciona o nome no ser
        this.setNome(name);
        
        // Adiciona a idade no ser
        this.setIdade(idade);
        
        // Adiciona o peso no ser
        this.setPeso(peso);
        
        // Adiciona a energia no ser
        this.setEnergia(100);
        
    }
    
    @Override
    public void atacarSer(ArrayList<Heroi> lista, Monstro monstro) {
        
        monstro.retirarEnergia(60);

    } // atacarSer()
    
}