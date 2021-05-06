import java.util.ArrayList;

public class Inheritance_ArrayList {
      public static void main(String args[]){
           Buah buah = new Buah();
           System.out.println(buah.sisaBuah());

           buah.tambahBuah("Nanas");
           buah.tambahBuah("Kiwi");
           buah.tambahBuah("Plum");
           System.out.println(buah.sisaBuah());

           buah.gantiBuah(1,"Sawo");
           System.out.println(buah.sisaBuah());

           buah.buahBusuk(0);
           System.out.println(buah.sisaBuah());
      }
}

class Pasae_Buah {
      ArrayList<String> fruit = new ArrayList<>();

      public Pasar_Buah(){

      }
      public void setBuah(ArrayList<String> fruit) {
            this.fruit = fruit;
      }
      public ArrayList<String> getBuah(){
            return this.fruit;
      }
} 

class Buah extends Pasae_Buah {
      public void tambahBuah(String fruit){
            super.getBuah().add(fruit);
      }
      public String buahBusuk(int index){
            return super.getBuah().remove(index);
      }
      public void gantiBuah(int index, String fruit){
            super.getBuah().set(index, fruit);
      }
      public ArrayList<String> sisaBuah(){
            return super.getBuah();
      }
}