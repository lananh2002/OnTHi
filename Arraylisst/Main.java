package Arraylisst;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử n từ người dùng
        System.out.print("Nhập vào số lượng phần tử: ");
        int n = scanner.nextInt();

        // Tạo một mảng để chứa các phần tử số nguyên
        int[] danh_sach = new int[n];

        // Nhập n phần tử số nguyên từ người dùng và thêm vào danh_sach
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            danh_sach[i] = scanner.nextInt();            
        }

        // In danh sách tất cả các phần tử đã nhập
        System.out.println("Danh sách các phần tử:");
        for (int phan_tu : danh_sach) {
            System.out.println(phan_tu);
        }
        // Tìm giá trị lớn nhất trong mảng
        int gia_tri_lon_nhat = timGiaTriLonNhat(danh_sach);

        // In kết quả giá trị lớn nhất
        System.out.println("Giá trị lớn nhất trong mảng: " + gia_tri_lon_nhat);
        
        
        // Tìm giá trị lớn nhất trong mảng
        int gia_tri_nho_nhat = timGiaTriNhoNhat(danh_sach);

        // In kết quả giá trị lớn nhất
        System.out.println("Giá trị nho nhất trong mảng: " + gia_tri_nho_nhat);
        
        
        // Tính giá trị trung bình của mảng
        double gia_tri_trung_binh = tinhGiaTriTrungBinh(danh_sach);

        // In kết quả giá trị trung bình
        System.out.println("Giá trị trung bình của mảng: " + gia_tri_trung_binh);
   
     // Sắp xếp các phần tử trong mảng theo thứ tự ngược lại
        sapXepNguoc(danh_sach);

        // In danh sách các phần tử đã được sắp xếp ngược lại
        System.out.println("Danh sách các phần tử sau khi sắp xếp ngược lại:");
        for (int phan_tu : danh_sach) {
            System.out.println(phan_tu);
        }
    }
    

    // Hàm tính giá trị trung bình của mảng
    public static double tinhGiaTriTrungBinh(int[] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
        }
        return (double) tong / arr.length;
    }
    
    // Hàm tìm giá trị lớn nhất trong mảng
    public static int timGiaTriLonNhat(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    
 // Hàm tìm giá trị nhỏ nhất trong mảng
    public static int timGiaTriNhoNhat(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    
    
    // Hàm sắp xếp các phần tử trong mảng theo thứ tự ngược lại
    public static void sapXepNguoc(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    }

