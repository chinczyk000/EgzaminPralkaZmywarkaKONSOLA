public class Odkurzacz extends Urzadzenie{
    private boolean czyOdkurzaczJestWlaczony = false;
    public void on(){
        if(czyOdkurzaczJestWlaczony == false){
            this.czyOdkurzaczJestWlaczony = true;
            wyswietlKomunikat("Odkurzacz włączono");
        }else{
            return;
        }
    }
    public void off(){
        if(czyOdkurzaczJestWlaczony == true){
            this.czyOdkurzaczJestWlaczony = false;
            wyswietlKomunikat("Odkurzacz wyłączono");
        }else{
            return;
        }
    }
}
