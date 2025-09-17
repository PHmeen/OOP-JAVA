class Lab4_4 {
    public static void main(String[] args) {
        int x, y, z = 5;
        System.out.println("z=" + z);

        z *= 2;  // คูณค่า z ด้วย 2 เก็บผลลัพธ์กลับไปที่ z
        System.out.println("z=" + z);

        x = y = z + 5; // คำนวณ z + 5 แล้วนำผลไปกำหนดให้ x y
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);

        y += ++y + x++ + (z--) + 5;        
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
    }
}
