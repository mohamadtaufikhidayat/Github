package GithubPackage;
import java.util.Scanner;

public class UploadGithubUjianSoal2 {
	//70//34 26 44//21 39 33
	public Scanner scan = new Scanner(System.in);
	public int [][] ArrayItem(){
		int arrayItem [][]=new int [2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				if(i==0) {
					System.out.println("Masukan hasukan harga kaca mata:"+(j+1));
					arrayItem[i][j]=scan.nextInt();
				}else {
					System.out.println("Masukan hasukan harga baju:"+(j+1));
					arrayItem[i][j]=scan.nextInt();
				}
			}
		}
		scan.close();
		return arrayItem;
	}
	public void hasilSum() {
		System.out.println("Masukan Nilai masukan uang Andi:");
		int a=0;
		int uangAndi= scan.nextInt();
		int [][] arrayItem = ArrayItem();
		int [][] arraySum = new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int	sum=Integer.valueOf(arrayItem[0][i])+Integer.valueOf(arrayItem[1][j]);
				arraySum [i][j]=sum;
				if(arraySum[i][j]<=uangAndi&&arraySum[i][j]>a) {
				a=arraySum[i][j];
				//System.out.println(arraySum[i][j]);
				}
			}
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		UploadGithubUjianSoal2 run =new UploadGithubUjianSoal2();
		run.hasilSum();	
	}
	
}
