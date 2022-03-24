import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fisiere {

	public static void main(String[] args) {
		// Exercitiul3();
		Exercitiul4();
	}

	public static void Exercitiul3() {
		int i = 0;
		Scanner scan = new Scanner(System.in);
		String a;
		String b;
		System.out.print("Text: ");
		a = scan.nextLine();
		System.out.print("Fisier: ");
		b = scan.nextLine();
		System.out.print("Textul citit de la tastatura: ");
		System.out.print(a);
		System.out.println();
		System.out.print("Numele fisierului: ");
		System.out.print(b);
		System.out.println();
		try {
			BufferedReader br = new BufferedReader(new FileReader(b));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
				if (a.equals(line))
					i++;
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Eroare la deschiderea fisierului!");
		}
		System.out.println(i + " de linii sunt egale cu linia de citita de la tastatura: " + a);
	}

	public static void Exercitiul4() {
		int n;
		int m;
		int p;
		System.out.print("n= ");
		n = new Scanner(System.in).nextInt();
		System.out.print("m= ");
		m = new Scanner(System.in).nextInt();
		System.out.print("p= ");
		p = new Scanner(System.in).nextInt();
		System.out.println(n);
		System.out.println(m);
		System.out.println(p);
		int a = m;
		double[][] matrix1 = new double[n][m];
		double[][] matrix2 = new double[m][p];
		double[][] matrix3 = new double[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < p; j++) {
				matrix3[i][j] = 0;
			}
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				System.out.print("matrix1" + "[" + i + "]" + "[" + j + "]=");
				matrix1[i][j] = new Scanner(System.in).nextInt();
			}
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < a; i++)
			for (int j = 0; j < p; j++) {
				System.out.print("matrix2" + "[" + i + "]" + "[" + j + "]=");
				matrix2[i][j] = new Scanner(System.in).nextInt();
			}
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++)
			for (int j = 0; j < p; j++)
				for (int k = 0; k < m; k++)
					matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];

		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < p; j++) {
					bw.write(matrix3[i][j] + " ");
				}
				bw.write("\n");
			}
			bw.close();

		} catch (IOException e) {
			System.out.println("Eroare ");

		}
	}
}
