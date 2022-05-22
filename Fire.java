import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fire2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    /*construtor*/
    public Fire(){
        //chama a imagem referente a classe, através de setter
        setImage("fogo.png");
    }
    /**
     * Act - do whatever the fire2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        //método usado para movimentar o objeto horizontalmente(X), sendo da direita para esquerda(-1)
        setLocation(getX() -1, getY());
        //condicional para remover objeto na posição <=15px
        if(getX() <= 15){
            ((Florest) getWorld()).removeObject(this);
        }
    }
}
