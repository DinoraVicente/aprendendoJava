package estudos.entities;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calculoNotas(){
        return nota1 + nota2 + nota3;
    }

    public double missingPoints(){
        if (calculoNotas() < 60.0){
            return 60.0 - calculoNotas();
        }else{
            return 0.0;
        }
    }
}
