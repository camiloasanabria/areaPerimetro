public class Main{
	public static void main(String[] arg){
		//r es el radio del circulo
		//a,b,c son los lados del triangulo donde b es la base y h es la altura
		//l es el valor de uno de los lados del cuadrado 
		int r=10;
		int a=3;
		int b=4;
		int c=5;
		int h=6;
		int l=10;
		System.out.println("el area del circulo con r="+r+" es: "+(3.1416*(r*r)));
		System.out.println("el perimetro del circulo con r="+r+" es: "+(2*3.1416*r)+"\n\n");
		System.out.println("el area del triangulo con b="+b+" y h="+h+" es: "+((b*h)/2));
		System.out.println("el perimetro del triangulo con lados a="+a+" b="+b+" c="+c+" es: "+(a+b+c)+"\n\n");
		System.out.println("el area del cuadrado con lado l="+l+" es: "+(l*l));
		System.out.println("el perimetro del cuadrado con lado l="+l+" es: "+(4*l));
	}
}