import Utils.*;

public class Ahnenbaum {
  private BinaryTree<Ahne> SvensAhnenbaum;

  Ahnenbaum(){
      BinaryTree<Ahne> b1= new BinaryTree<Ahne> (new Ahne("Thomas","Hartung", 'M'));
      BinaryTree<Ahne> b2= new BinaryTree<Ahne> (new Ahne("Hella","Hartung-Ehlert", 'W'));
      BinaryTree<Ahne> b3= new BinaryTree<Ahne> (new Ahne("Stefanie","Hartmann", 'W'),b1,b2);
      BinaryTree<Ahne> b4= new BinaryTree<Ahne> (new Ahne("Elke","Hartmann", 'W'));
      BinaryTree<Ahne> b5= new BinaryTree<Ahne> (new Ahne("Manfred","Hartmann", 'M'));
      BinaryTree<Ahne> b6= new BinaryTree<Ahne> (new Ahne("Sascha","Hartmann", 'M'),b4,b5);
      BinaryTree<Ahne> Ahnenbaum = new BinaryTree<Ahne>(new Ahne("Sven", "Hartmann", 'M'), b3, b6);


  }
}
