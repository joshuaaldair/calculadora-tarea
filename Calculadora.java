
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		float num1=0, num2=0, total=0;
		int sel, res;
		char sign=' ';
		String op=" ", continuar;
		Scanner scan = new Scanner(System.in);
		/*
		 * suma s = num1+num2;
		 *resta r = num1-num2;
		 *multiplicacion m = num1**num2;
		 *division d = num1/num2;
		 */
		
		do {
			System.out.print("Calculadora \nQue operacion quiere realizar?\num1.Suma\num2.Resta\num3.Multiplicación\num4.División\n\nSu selección: ");
			sel = scan.nextInt();
			if (sel<=4 && sel>0){
				res=1;
				System.out.print("\nseleccione el primer numero:\t");
				num1 = scan.nextFloat();
				System.out.print("Ingrese el segundo numero:\t");
				num2 = scan.nextFloat();
				switch(sel) 
				{
				case 1: 
					suma s = num1+num2;
					//s.setNum1(num1);
					//s.setNum2(num2);
					total = s.getClass();
					sign = s.getSign();
					op = s.getOperation();
					break;
				case 2:
					resta r = num1-num2;
					//r.setNum1(num1);
					//r.setNum2(num2);
					total = r.getRes();
					sign = r.getSign();
					op = r.getOperation();
					break;
	case 3:
					multiplicacion m = num1*num2;
					//m.setNum1(num1);
					//m.setNum2(num2);
					total = m.getRes();
					sign = m.getSign();
					op = m.getOperation();
					break;
 
	case 4:
					if (n2==0) {
						System.out.println("No se puede dividir entre 0");
						res=0;
						break;
					}
					else {
						division d = new division(n1, n2); 
						//d.setNum1(num1);
						//d.setNum2(num2);
						total = d.getRes();
						sign = d.getSign();
						op = d.getOperation();
						break;
					}	
				default:
					System.out.println("Seleccion Invalida");
					break;
				}
				if (res==1) {
					System.out.println("\nEl resultado de la "+op+" "+n1+" "+sign+" "+n2+" es igual a:");
					System.out.print(total);
				}
				
			}
			else
				System.out.println("\nSeleccion Invalida");
			System.out.print("\nDesea continuar? (S/N): ");
			continuar=scan.next();
			//Para comparar stings se utiliza variable.equals(comparacion)
			} while (continuar.equals("S")||continuar.equals("s")||continuar.equals("Si")||continuar.equals("si")||continuar.equals("SI")||continuar.equals("sI"));
		scan.close();
		}
	}