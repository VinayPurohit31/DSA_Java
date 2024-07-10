class Main {
    public fact(int n){
        if(n==1) return 1;
        return  n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main m = new Main();
        System.out.println(m.fact(n));
    }

}