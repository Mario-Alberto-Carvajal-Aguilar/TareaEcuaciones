package MetodosNumericos;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JOptionPane;
public class MetodosNumericos {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        do {
            int opcion,opcion2;
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,""
                          + "1.-Formula de euler a la x\n"
                          + "2.-Formula de euler a la -x\n"
                          + "3.-Formula de Varianza\n"
                          +"4.-Metodos para resolver ecuaciones cuadraticas","MENU"
                          ,JOptionPane.QUESTION_MESSAGE));
            
            switch(opcion){
                case 1:
                    int x1,j;
                        JOptionPane.showMessageDialog(null,""
                                                   +"Formula igualitaria e^x=∑(n) x^j/j!", "Formula de euler a la x\n",JOptionPane.INFORMATION_MESSAGE);
 
                        x1=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"introduzca X","Formula de euler a la x"
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));
  
                        j=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"introduzca J","Formula de euler a la x"
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));
                    
                    double sumatoria = 0;
                    for (int i = 0; i < j+1; i++) {
                        sumatoria = sumatoria + Math.pow(x1, i)/(factor(i));
                    }
                    
                        JOptionPane.showMessageDialog(null,""
                                                   +"Resultado: "+ df.format(sumatoria), "Formula de euler a la x\n",JOptionPane.INFORMATION_MESSAGE);

                    
                    break;
                case 2:
                   int y,k;
                    
                        JOptionPane.showMessageDialog(null,""
                                                   +"calculo de e^-x usando su formula igualitaria e^-x=1/∑(n) (x^j/j!)", "Formula de euler a la -x\n",JOptionPane.INFORMATION_MESSAGE);

                        y=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"introduzca X",
                                                    "Formula de euler a la -x\n",JOptionPane.QUESTION_MESSAGE));

                        k=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"introduzca J",
                                                    "Formula de euler a la -x\n",JOptionPane.QUESTION_MESSAGE));
                    
                    
                    double sumatoria2 = 0;
                    for (int i = 0; i < k + 1; i++) {
                        sumatoria2 = sumatoria2 + (Math.pow(y, i)/(factor(i)));
                    }

                    double ar=1/sumatoria2;

                        JOptionPane.showMessageDialog(null,""
                                                   +"Resultado: "+ar+"\n"
                                                   +"Resultado sumatoria: "+ df.format(sumatoria2), "Formula de euler a la -x\n",JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 3:
                     double numrandom[];
                    double summedia = 0, v, media,SumaVar=0;
                    int cantidad;

                        JOptionPane.showMessageDialog(null,""
                                                   +"Varianza con formula =((x-x̅)^2+(x2-x̅)^2+...+(xn-x̅)^2)", 
                                                    "Formula de Varianza"
                                                   +"\n",JOptionPane.INFORMATION_MESSAGE);

                        cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Ingrese cuantos numeros se agregaran",
                                                    "Formula de Varianza"
                                                   +"\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));

                    numrandom = new double[cantidad];

                        JOptionPane.showMessageDialog(null,""
                                                    +"Numeros random",
                                                    "Formula de Varianza"
                                                    +"\n",JOptionPane.INFORMATION_MESSAGE);

                    String mensaje="Los numeros son :\n";
                    
                    for (int i = 0; i < cantidad; i++) {
                        
                        numrandom[i] =Math.random();
                        System.out.println("");
                        mensaje+=String.format("Numero "+""+(i+1)+": "+""+numrandom[i]+"\n");

                    }
                     JOptionPane.showMessageDialog(null,mensaje+"\n",
                                                   "Formula de Varianza"
                                                   +"\n",JOptionPane.INFORMATION_MESSAGE);

                    for (int i = 0; i < cantidad; i++) {
                        summedia += numrandom[i];
                    }
                    media = summedia/cantidad;  

                        JOptionPane.showMessageDialog(null,""
                                                   +"La media es: "+ media,
                                                    "Formula de Varianza"
                                                   +"\n",JOptionPane.INFORMATION_MESSAGE);

                    String mensaje2="Resultados de (x-x̅)^2 :\n";
                    for (int i = 0; i < cantidad; i++) {               
                    SumaVar+=Math.pow(numrandom[i]-media, 2);

                      
                    mensaje2+=String.format("Numero "+""+(i+1)+": "+""+SumaVar+"\n");
                        
                    }
                    JOptionPane.showMessageDialog(null,mensaje2+"\n",
                                                   "Formula de Varianza"
                                                   +"\n",JOptionPane.INFORMATION_MESSAGE);

                    v=SumaVar/cantidad;       

                    JOptionPane.showMessageDialog(null,""
                                                   +"Resultado de la varianza:"+df.format(v),
                                                    "Formula de Varianza"
                                                   +"\n",JOptionPane.INFORMATION_MESSAGE);
  
                    break;
                case 4:
                            int cond;
            do{
                    opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,""
                          + "1.-Metodo formula general\n"
                          + "2.-Metodo de Po Shen Loh\n"
                          + "3.-Metodo de Formula General a la Inversa\n","MENU"
                          ,JOptionPane.QUESTION_MESSAGE));
            
            switch(opcion2){
                
                
                case 1:
                    double ax2,bx,c,res;
                        ax2=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Ingrese el valor de a(x^2)","Metodo formula general" 
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));

                        bx=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Ingrese el valor de b(x)","Metodo formula general" 
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));
                    
                    
                        c=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Ingrese el valor del termino independiente (c)","Metodo formula general" 
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));

                        res=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Introduzca el igual a:","Metodo formula general" 
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));

                        c=c-res;

                        
                        formulageneral(ax2,bx,c);
                    break;
                case 2:
                    
                        ax2=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Ingresa el valor de a(x^2)","Metodo de Po Shen Loh"
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));

                        bx=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Ingrese el valor de b(x)","Metodo de Po Shen Loh"
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));

                        c=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Ingrese el valor del termino independiente (c)","Metodo de Po Shen Loh"
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));

                        res=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Introduzca el igual a:","Metodo de Po Shen Loh"
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));

                        c=c-res;

                        

                        PSL(ax2,bx,c);
                    
                    break;
                case 3:
                     ax2=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Ingresa el valor de a(x^2)","Metodo de Formula General a la Inversa"
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));

                        bx=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Ingrese el valor de b(x)","Metodo de Formula General a la Inversa"
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));
                    
                        c=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Ingrese el valor del termino independiente (c)","Metodo de Formula General a la Inversa"
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));
                    
                        res=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                                    +"Introduzca el igual a:","Metodo de Formula General a la Inversa"
                                                    + "\n"
                                                    ,JOptionPane.QUESTION_MESSAGE));

                        c=c-res;

                       
                        formulageneralinversa(ax2,bx,c);
                    
                    break;
                default:
                        JOptionPane.showMessageDialog(null,"Ingrese una opcion valida", "ERROR",JOptionPane.ERROR_MESSAGE);
                    break;
                    
            }
                        cond=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Desea volver al menu?\n"
                                                                + "1.- Si\n"
                                                                + "2.- No\n","Regresar menu",JOptionPane.QUESTION_MESSAGE));
          }while(cond == 1);

                    break;
           
                default:
                    JOptionPane.showMessageDialog(null,"Ingrese una opcion valida", "ERROR",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (true);   
    }
    
    
    public static void formulageneral(double a,double b,double c){
        double a1,x1,x2;
        DecimalFormat df = new DecimalFormat("#.####");
        a1=(Math.pow(b,2))-(4*(a)*(c));
        if(Dis(a,b,c)==true){

            JOptionPane.showMessageDialog(null,"El problema planteado no tiene solución", "ERROR",JOptionPane.ERROR_MESSAGE);
          
        }
        else{
            x1=(-(b)+Math.sqrt(a1))/(2*(a));
            x2=(-(b)-Math.sqrt(a1))/(2*(a));

            JOptionPane.showMessageDialog(null,""
                                                   +"Resultado de x1: "+df.format(x1)+"\n"        
                                                   +"Resultado de x2: "+df.format(x2), "Metodo formula general"
                                                           + "\n",JOptionPane.INFORMATION_MESSAGE);

        }
    }
    
    public static void PSL(double a,double b,double c){
        DecimalFormat df = new DecimalFormat("#.####");
        if(Dis(a,b,c)==true){
            JOptionPane.showMessageDialog(null,"El problema planteado no tiene solución", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            double b1=b/a;
            double c1=c/a;
            double p=-(b1)/2;
            double u=Math.sqrt((c1-(Math.pow(p, 2)))*-1);
            double x1=p+u;
            double x2=p-u;

            JOptionPane.showMessageDialog(null,""
                                                   +"Resultado de x1: "+df.format(x1)+"\n"
                                                   +"Resultado de x2: "+df.format(x2),"Metodo de Po Shen Loh"
                                                   + "\n",JOptionPane.INFORMATION_MESSAGE);
            
            
        }
        
    }
    public static void formulageneralinversa(double a,double b,double c){
        DecimalFormat df = new DecimalFormat("#.####");
        if(Dis(a,b,c)==true){
            JOptionPane.showMessageDialog(null,"El problema planteado no tiene solución", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            double x1=(-2*c)/(b+(Math.sqrt(Math.pow(b,2)-(4*a*c))));
            double x2=(-2*c)/(b-(Math.sqrt(Math.pow(b,2)-(4*a*c))));

            JOptionPane.showMessageDialog(null,""
                                                   +"Resultado de x1: "+df.format(x1)+"\n"
                                                   +"Resultado de x2: "+df.format(x2), "Metodo de Formula General a la Inversa"
                                                   + "\n",JOptionPane.INFORMATION_MESSAGE);
  
        }
    }
    public static boolean Dis(double a,double b,double c){
        double dis;
        dis=(Math.pow(b,2))-(4*(a)*(c));
        if(dis<0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int factor (int num) {
        if (num==0)
        return 1;
        else
        return num * factor(num-1);
    }   

   
}
