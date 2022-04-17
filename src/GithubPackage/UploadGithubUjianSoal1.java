package GithubPackage;
import java.util.Scanner;


public class UploadGithubUjianSoal1 {
	//nyoba bikin file di git
		public int inputN(){
			System.out.println("Masukan Nilai N:");
			Scanner scan = new Scanner(System.in);
			int n= scan.nextInt();
			scan.close();
			return n;
		}
		public int [][] isiArray(int n){
			int [][]array= new int [2][n];
			for(int i=0;i<2;i++) {
				for(int j=0; j<n;j++) {
					if(i==0) {
						array[i][j]=2*j+1;// 1 5 9 13 dst 
					}else {
						//cara 1
						array[i][j]=2*n-1-2*j;// 
						//cara 2
						//array[i][j]=array[0][n-1-j];//
					}
				}
			}
			return array;
			
		}
		public void cetakArray() {
			int n=inputN();
			int [][]array=isiArray(n);
			for(int i=0;i<2;i++) {
				for(int j=0;j<n;j++) {
					System.out.printf("%3d",array[i][j]);
				}
				System.out.println();
			}
		}
			public static void main(String[] args) {
				UploadGithubUjianSoal1 run = new UploadGithubUjianSoal1();
				run.cetakArray();
			}
}
// Coba tambah comment