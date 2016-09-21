
public class DatosPrimitivos {

	public static void main (String[]agrs) {
		
		System.out.println("----------------------------");
		System.out.println("DATOS NATIVOS O PRIMITIVOS");
		System.out.println("----------------------------");
		System.out.println("");
		
		System.out.println("Los datos primitivos o datos nativos, llamados así por su facilidad");
		System.out.println("de uso son ocho:");
		System.out.println("");
		
		//CHAR
		System.out.println("* CHAR: Este permite representar caracteres aislados. En otras palabras el uso de este es para");
		System.out.println("  representar letras. Ej: c, a, b, etc. Por cierto, este le da un peso fijo de 16 bit.");
		System.out.println("");
		
			//Ejemplos:
		
			System.out.println("  Ejemplo");
			System.out.println("  -------");
			System.out.println("");
				
				char eme='M';
				char ii='I';
				char ka='K';
				char ache='H';
				char ee='E';
				char ele='L';
				char sexo='M';
						
				
				System.out.print("    * "+ eme);
				System.out.print("    "+ ii);
				System.out.print("    "+ ka);
				System.out.print("    "+ ache);
				System.out.print("    "+ ee);
				System.out.print("    "+ ele);
				
				System.out.println("");
				System.out.println("");
				
				System.out.println("    * Escriba su sexo: "+ sexo);
				System.out.println("");
				System.out.println("");
				
				
				
			
		//BOOLEAN
		System.out.println("* BOOLEAN: Este permite representar valores lógicos o booleanos (falso y verdadero. Una variable");
		System.out.println("  boolean solo puede tomar dos posibles valores: false ó true. Este tipo de variables se usan");
		System.out.println("  más para evaluar condicioenes en las cuales es necesario conocer el valor de verdad de cierta ");
		System.out.println("  operación lógica. Por cierto, este tiene un peso de 16 bit.");
		System.out.println("");
		
			System.out.println("  Ejemplos");
			System.out.println("  --------");
			System.out.println("");
			
			int cinco=5;
			int dos=2;
			boolean mirando= cinco > dos;
			boolean cierto=true;
			
			System.out.println("    * Puedes ver si cinco es mayor a dos: " + mirando);
			System.out.println("");
			System.out.println("    *"+ cierto);
			System.out.println("");
			
			
		
				
		
		//BYTE
		System.out.println("* BYTE: Este tipo de datos representa números enteros de 8bit. Solo puede tener números entre");
		System.out.println("  -128 y 127");
		System.out.println("");
		
		System.out.println("  Ejemplos");
		System.out.println("  --------");
		System.out.println("");
		
		byte numerito= 127;
		
		System.out.println("    * El número que haz escogido es: "+ numerito);
		System.out.println("");
		
		
		//SHORT
		System.out.println("* SHORT: l tipo de dato short es un entero de 16 bits complemento a dos. Su valor mínimo es -32,768	");
		System.out.println("* y el máximo 32,767 (inclusive). Se aplican las mismas directrices que con byte:");
		System.out.println("puede utilizar short para ahorrar memoria en grandes arrays, en situaciones en las que el ahorro realmente importa.");
		System.out.println();
		
		System.out.println("  Ejemplos");
		System.out.println("  --------");
		System.out.println("");
		
		short variable=32767;
		System.out.println("Este es su limite básico "+ variable);
		System.out.println("");
		
		//INT
		
		System.out.println("* INT: Es una variable que solo acepta números enteros, el que se aplica por obviedad solo la arítmetica entera");
		System.out.println("");
		
		System.out.println("  Ejemplos");
		System.out.println("  --------");
		System.out.println("");
		
		int numero1=20;
		int numero2=10;
		int resultado=numero1/numero2;
		
		System.out.println("Aquí he dividido 20 entre 10 y este es su resultado: "+ resultado);
		System.out.println("");
		
		//LONG
		System.out.println("* LONG: El tipo de dato long es un entero de 64 bits complemento a dos. Su valor mínimo es -9,223,372,036,854,775,808 y el máximo 9,223,372,036,854,775,807 (inclusive).");
		System.out.println("");
		
		System.out.println("  Ejemplos");
		System.out.println("  --------");
		System.out.println("");
		
		long altavariable=100000;
		long altavariable2=2;
		long resultadoAltavariable=altavariable/altavariable2;
		
		System.out.println("   Este es el resultado de dividiir 1,000,000 entre 2:"+ resultadoAltavariable);
		System.out.println("");
		
		//FLOAT:
		
		System.out.println("* FLOAT: Tiene de 6 a 7 decimales aproximadamente.");
		System.out.println("  Ejemplos");
		System.out.println("  --------");
		System.out.println("");
		
		float usandoFloat=3.14f;
		float usandoFloat2=2.18f;
		float resultadoFloat=usandoFloat-usandoFloat2;
		
		System.out.println("Estas son dos variables float realizando una resta:" + resultadoFloat);
		
		
	
		
	}

}
;
