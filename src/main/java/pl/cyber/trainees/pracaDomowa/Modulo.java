package pl.cyber.trainees.pracaDomowa;

public class Modulo {
    public boolean modulo(Integer liczba){

        if(liczba % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean modulo2(Integer liczba2){

        if(liczba2 % 3 == 0 && liczba2 % 5 == 0){
            return true;
        }else{
            return false;
        }
    }
}
