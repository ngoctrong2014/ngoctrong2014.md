public static void main(String[] args) {
    JFrame frame = new JFrame("Đồng hồ");
    Clock clock = new Clock();
    frame.add(clock);
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); // Đây là dòng quan trọng để hiển thị cửa sổ
}
